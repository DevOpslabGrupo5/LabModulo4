pipeline {
    agent any
    stages {
        stage('Clean & Install') {
            steps {
                sh "mvn clean compile"
            }
        }

        stage('Package') {
            steps {
                sh "mvn package -e"
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
       
        stage('Test!') {
            steps {
                sh "mvn test"
            }
        }

        // stage('Test Newman') {
        //     steps {
        //         sh "newman run src/test/java/com/devops/dxc/devops/postman/Dxc.postman_collectionLab.json"
        //     }
        // }

        stage('Jmeter') {
            steps {
                sh "mvn verify -Pperformance"
            }
        }
    }
}