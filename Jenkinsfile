pipeline{

agent any
    stages
    {
      stage("Cleaning Stage"){
      
                steps{   
                  bat "mvn clean"
                   }
               }
               
          stage("Testing Stage"){
      
                steps{   
                  bat "mvn test"
                   }
               }

     stage("Packing Stage"){
      
                steps{   
                  bat "mvn package"
                   
               }
         }
         stage("Consolidated Result"){
      
                steps{   
                 input("Do you want to capture results?")
                    junit'**/target/surefire-reports/TEST-*.xml'
                    archive 'target/*.jar'
                   
               }
         }
        
        stage("Email Build Status"){
            steps{
                mail bcc: '', body: '''Hi all,
                Test results''', cc: '', from: '', replyTo: '', subject: 'Sample Body', to: 'nikitajawali06@gmail.com'
        }
      }
    }
}
