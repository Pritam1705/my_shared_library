package org.p11combinedforce.ansibleCI

def call(String playbookName) {
    stage("Syntax Check") {
        script {
             gitleaks detect --source=${playbookName} --verbose --report-path=gitleaks-report.json
        }
    }
}
