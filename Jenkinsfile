pipeline{
    agent any
    stages{
        stage('Iniciar Testes'){
            steps{
                bat 'mvn test -DskipTests=true'
            }
        }

    }
}