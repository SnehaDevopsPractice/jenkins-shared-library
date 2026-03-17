@Library('my-shared-library') _
pipeline {
    agent any
    tools {
        jdk 'java17'
        maven 'maven19'
    }
    stages{
        stage('checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/SnehaDevopsPractice/simple-java-app.git'
            }
        }
        stage('build') {
            steps {
                mavenBuild()   
            }
        }
        stage ('post-build'){
            steps{
                echo 'build completed successfully'
            }
        }
    }
}
