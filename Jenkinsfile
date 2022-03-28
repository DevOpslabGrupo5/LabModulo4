pipeline {
    agent any
    stages {
        stage('Clean & Install') {
            steps {
                sh "mvn clean install"
            }
        }

        stage('Run!!!') {
            steps {
                sh "mvn spring-boot:run &"
            }
        }

        stage('Tutooooooo 30 segundos') {
            steps {
                sh 'sleep 30'
            }
        }
        
        stage('Test') {
            steps {
                sh "mvn clean test"
            }
        }
       

        stage('Test Newman') {
            steps {
                sh "newman run src/test/java/com/devops/dxc/devops/postman/Dxc.postman_collectionLab.json  -n 1 --delay-request 1000"
            }
        }

        // stage('Jmeter') {
        //     steps {
        //         sh "mvn verify -Pperformance"
        //     }
        // }
    }
}