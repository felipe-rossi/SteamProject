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
            emailext attachLog: true, body: 'FACA COM VALOR DE 300 REAIS NA STEAM NA BUILD: $BUILD_NUMBER', subject: 'Surgiu uma faca com um valor menor que 300 reais na Build: $BUILD_NUMBER', to: 'felipaovs12@gmail.com'
       }
    }
}