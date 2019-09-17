pipeline{
    agent any

    stages{
        stage('Compile stage'){
            steps{
                withMaven(maven : 'M3'){
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Testing Stage'){
            steps{
                withMaven(maven : 'M3'){
                    sh 'mvn test'
                }
            }
        }
    }
}