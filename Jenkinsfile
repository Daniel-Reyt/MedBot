pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }
    stages {
        stage('Build') {
            steps {
                sh """
                    echo 'Build'
                    cd MedBot/src/Methods
                    javac MedBot.java
                """
            }
        }
        stage('Test') {
            steps {
                sh """
                    echo 'test'
                """
            }
        }

        stage('Deploy') {
            steps {
                sh """
                    echo 'deploy'
                """
            }
        }
    }
}