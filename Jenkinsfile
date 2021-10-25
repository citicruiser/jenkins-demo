pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh 'echo test'
            }
        }

        stage('Sonar Scan') {
            agent {
                docker {
                    image 'maven:3.6.3-jdk-11'
                }
            }

            steps {
                withSonarQubeEnv('SonarQube') {
                    sh "mvn clean verify package sonar:sonar" 
                }
            }
        }

    }
    
}
