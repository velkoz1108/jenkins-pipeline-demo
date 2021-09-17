
pipeline {
    agent any
    
  parameters {
    string defaultValue: 'v1.0.0', description: 'version', name: 'version', trim: true
    string defaultValue: 'demo-server', name: 'server name', trim: true
  }
  
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
