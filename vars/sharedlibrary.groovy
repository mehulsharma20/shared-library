def buildNdeploy(){
        dir('/home/mehul/Desktop/shared-lib/vars') {
        stage("build frontend project"){
            try{
               sh "./frontend.sh" 
            }
            catch(Exception e){
                echo "build failed"
//                stage("Revert back."){
                 }
                throw e 
              }
            }
               }
               //}