package org.p11combinedforce.ansibleCI

def call(String playbookName) {
    stage("cred Scanning") {
        script {
            sh "gitleaks detect --source=${playbookName} --verbose --report-path=gitleaks-report.json"
        }
    }
}
