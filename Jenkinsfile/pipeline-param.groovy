
pipeline {
    agent any
    
  parameters {
    string defaultValue: 'v1.0.0', description: 'version', name: 'version', trim: true
  }
  
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
