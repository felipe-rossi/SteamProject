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
       always{
            mail to: "felipaovs12@gmail.com",
            subject: "Test Email",
            body: "Test"
       }
    }
}