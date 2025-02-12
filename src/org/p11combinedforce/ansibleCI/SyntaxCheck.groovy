package org.p11combinedforce.ansibleCI

def call(String playbookPath) {
    stage("Syntax Check") {
        script {
            sh "ansible-playbook --syntax-check ${playbookPath}"
        }
    }
}
