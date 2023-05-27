pipeline{
    agent any
    stages{
        stage('Iniciar Testes'){
            steps{
                bat 'mvn test'
            }
        }
    }
    always{
       unsuccessful{
            emailext attachLog: true, body: 'FACA COM VALOR DE 300 REAIS NA STEAM NA BUILD', subject: 'Surgiu uma faca com um valor menor que 300 reais', to: 'felipaovs12@gmail.com'
       }
    }
}