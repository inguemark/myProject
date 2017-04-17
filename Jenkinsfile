pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        git(url: 'https://github.com/inguemark/myProject.git', branch: 'master', changelog: true)
        echo 'Coucou !'
        build 'myProject-master-build'
        sh 'mvn clean install'
      }
    }
  }
}