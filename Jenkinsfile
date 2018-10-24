node()
{
  stage('Checkout')
  {
    checkout scm
  }
  stage('Build')
  {
    withMaven(maven: 'maven') {
      sh "mvn clean install -DskipTests=true"
    }
  }
  stage('Test')
  {
    withMaven(maven: 'maven') {
      sh "mvn test"   
    } 
  }
  
}
