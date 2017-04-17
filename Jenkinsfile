pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        git(url: 'https://github.com/inguemark/myProject.git', branch: 'master', changelog: true)
        sh 'mvn clean install -DSkipTests'
      }
    }
  }
}