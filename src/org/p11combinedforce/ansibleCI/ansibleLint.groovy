package org.p11combinedforce.ansibleCI

def call(String playbookName) {
    stage("Lint Check") {
        script {
            sh """
                if ! command -v ansible-lint &> /dev/null; then
                    pip install --user ansible-lint
                fi
                ansible-lint ${playbookName}
            """
        }
    }
}

