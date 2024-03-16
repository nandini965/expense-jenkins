def call () {
    pipeline {
        agent {
            node 'workstation'
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
              //  when {
                //    expression {
                   //     env.TAG_NAME == ~".*"
                   // }
               // }
                steps {
                sh 'npm install'

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