pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '/opt/apache-maven-3.5.0/bin/mvn clean install'
      }
    }
  }
}