node()
{
  stage('Checkout')
  {
    checkout scm
  }
  stage('Build')
  {
    withMaven(maven: 'maven') {
      sh "mvv clean install -DskipTests=true"
    }
  }
  stage('Test')
  {
    withMaven(maven: 'maven') {
      sh "mvv test"   
    } 
  }
  
}
