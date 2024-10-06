pipeline{
    agent any

    environment {
         DIRECTORY_PATH = '/path/to/code/directory'
         TESTING_ENVIRONMENT = 'TestE'
         PRODUCTION_ENVIRONMENT = 'OnayaProduction'

    stages{
        stage('Build')
            steps{
               script  {
                     echo "Get the source code from directory path"
                }
        }
    }
        stage('Test'){
            steps{
               echo "Test started and completed!"
            }
        }
         stage('Code Quality Check'){
            steps{
               echo "Code Quality Check started and completed!"
            }
        }
        stage('Deploy'){
            steps{
               echo "Deployment started and completed!"
            }
        }
        stage('Approval'){
            steps{
               echo "Approvement started and completed!"
            }
        }
        stage('Deploy to Production'){
            steps{
               echo "Deployment of Production started and completed!"
            }
        }
}
}