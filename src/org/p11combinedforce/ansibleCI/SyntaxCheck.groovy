package org.p11combinedforce.ansibleCI

def call(String playbookName) {
    stage("Syntax Check") {
        script {
            sh "ansible-playbook --syntax-check ${playbookName}"
        }
    }
}
