pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        git(url: 'git@github.com:inguemark/myProject.git', branch: 'master')
      }
    }
  }
}