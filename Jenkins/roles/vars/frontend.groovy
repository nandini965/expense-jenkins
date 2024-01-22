def call () {
    pipeline {
        agent {
            node {
                label 'workstation'
            }
        }
        options {
            ansicolor(xterm)
        }

        stages {
            stage('code quality') {
                steps {
                    sh 'echo run code quality'
                }
            }

            stage('unit test cases') {
                steps {
                    sh 'echo unit test cases'
                }
            }
            stage('checkmarx SCA test') {
                steps {
                    sh 'echo run checkmarx sca test'
                }
            }
            stage('checkmarx SAST test') {
                steps {
                    sh 'echo run checkmarx sast test'
                }
            }
            stage('release application') {
                steps {

                }
            }
        }
        post {
            always {
                cleanws()
            }

        }
    }
}