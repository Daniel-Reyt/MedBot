pipeline {
    agent any

    stages {
        stage('Branch') {
            steps {
                sh """
                    git clone https://github.com/Daniel-Reyt/MedBot.git
                    git checkout origin master
                """
            }
        }
        stage('Build') {
            steps {
                sh """
                    echo 'Build'
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