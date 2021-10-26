pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh """
                    git reset --hard
                    git pull origin master
                """
                sh """
                    echo 'Build'
                    cd src
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