pipeline {
    agent any

    tools {
        maven 'MAVEN'  // Maven tool name in Jenkins
    }

    environment {
        SONARQUBE_SERVER = 'SonarQubeServer'  // SonarQube server name in Jenkins config
        SONAR_TOKEN = 'sqa_6a647f9ce3f63b4b3e8bd5907af2b5eecbccad49'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/samuelms123/OTP-2-Assignment4.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQubeServer') {
                    bat """
                        ${tool 'SonarScanner'}\\bin\\sonar-scanner ^
                        -Dsonar.projectKey=devops-demo ^
                        -Dsonar.sources=src ^
                        -Dsonar.projectName=Week4_inClass ^
                        -Dsonar.host.url=http://localhost:9000 ^
                        -Dsonar.login=${env.SONAR_TOKEN} ^
                        -Dsonar.java.binaries=target/classes
                    """
                }
            }
        }
    }
}