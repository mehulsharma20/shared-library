def buildNdeploy(){
        dir('/home/mehul/Desktop/shared-lib/vars') {
        stage("build frontend project"){
            sh "./frontend.sh"
            }
               }
            