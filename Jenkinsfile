pipeline {
    agent any
    
    options
    {
        timeout(time: 1, unit: 'HOURS')
        disableConcurrentBuilds()
        buildDiscarder(logRotator(numToKeepStr: '10'))
        timestamps()
    }

    triggers
    {
        pollSCM('* * * * *')
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing..'
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
                    //sh "mvn clean verify package" 
                    
                }
            }
        }
        
        stage("Quality Gate") {
           steps {
              waitForQualityGate abortPipeline: true
           }
        }
        
        stage('Deploy2Dev') {
            steps {
                echo 'Deploying....'
            }
        }
    }
    
}
