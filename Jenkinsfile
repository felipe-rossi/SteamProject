pipeline{
    agent any
    stages{
        stage('Iniciar Testes'){
            steps{
                bat 'mvn test'
            }
        }
    }
    post{
       unsuccessful{
            emailext attachLog: true, body: 'Nome da Build: $BUILD_NAME - Número da Build: $BUILD_NUMBER', subject: 'Surgiu uma faca com um valor menor que 300 reais na Build: $BUILD_NAME - $BUILD_NUMBER', to: 'felipaovs12@gmail.com'

       }
    }
}