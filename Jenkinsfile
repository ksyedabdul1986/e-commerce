pipeline {
    agent any
    tools {
        maven 'mvn3.9.16'
    }
    environment {
        MY_GIT_BRANCH='main'
        MY_GIT_URL='https://github.com/ksyedabdul1986/e-commerce.git'
    }
    parameters {
        choice(name: 'MY_ENVIRONMENT', choices: ['TEST', 'PROD'], description: 'Setting environment')
    }
    stages {
        stage('Clone') {
            steps {
                git branch: env.MY_GIT_BRANCH, url: env.MY_GIT_URL
            }
        }
        stage('Build') {
            when {
                expression {
                    return params.MY_ENVIRONMENT.equals('TEST')
                }
            }
            steps {
                bat 'mvn clean install'
            }
        }
    }
}
