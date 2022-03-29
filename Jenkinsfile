pipeline {
    agent any
    stages {
        stage('Clean & Compile') {
            steps {
                sh "mvn clean compile"
            }
        }

        stage('Test Unitario!') {
            steps {
                sh "mvn -Dtest=UtilTest test"
            }
        }

        stage('Package') {
            steps {
                sh "mvn package -Dmaven.test.skip"
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
       
        stage('Test Selenium!') {
            steps {
                sh "mvn -Dtest=ApplicationTest test"
            }
        }

        stage('Test Newman') {
            steps {
                sh "newman run src/test/postman/Dxc.postman_collectionLab.json"
            }
        }

        stage('Jmeter') {
            steps {
                sh "mvn verify -Pperformance"
            }
        }
    }
}