package org.p11combinedforce.common

def call(String url, String branch, String creds) {
    stage("Clone Private Repo") {
        script {
            checkout([$class: 'GitSCM', 
                branches: [[name: branch]],
                userRemoteConfigs: [[
                    url: url,
                    credentialsId: creds
                ]]
            ])
        }
    }
}
