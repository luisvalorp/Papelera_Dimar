pipeline{
    agent any
        tools {
            maven 'M3'
        }
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