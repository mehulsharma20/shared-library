def buildNdeploy(){
        dir('/home/mehul/Desktop/shared-library/vars') {
        stage("build frontend project"){
            sh "./frontend.sh"
            }
         }
}
            