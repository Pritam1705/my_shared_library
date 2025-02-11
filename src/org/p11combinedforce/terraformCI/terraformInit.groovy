package org.p11combinedforce.terraformCI

def call(String Dir="") {
    stage("Terraform Init"){
        script{
            if(Dir == ""){
                sh "terraform init"
            }else{
                sh "terraform init ${Dir}"
            }
        }
    }
}
