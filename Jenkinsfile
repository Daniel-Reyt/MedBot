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