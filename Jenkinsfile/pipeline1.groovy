import hudson.model.*;

pipeline{
  
  agent any
  stages{
    stage("Hello World!"){
      steps{
        script{
          
          println "Hello step one."
          println "Hello step two."
        }
      }
    }
  }
  
}
