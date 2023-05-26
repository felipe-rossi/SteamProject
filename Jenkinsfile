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
            emailext attachLog: true, body: '''Surgiu uma faca com um valor menor que 300 reais!!!!!!
            Build: $BUILD_NUMBER''', subject: 'FACA COM VALOR DE 300 REAIS NA STEAM  NA BUILD: $BUILD_NUMBER', to: 'felipe.rossigz@hotmail.com'
        }
    }
}