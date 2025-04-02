pipelineJob('Pipeline-Job') {
    description('This is a Pipeline Job')
    
    definition {
        cps {
            script("""
                pipeline {
                    agent any
                    
                    stages {
                        stage('Build') {
                            steps {
                                echo 'Building...'
                            }
                        }
                        
                        stage('Test') {
                            steps {
                                echo 'Testing...'
                            }
                        }
                        
                        stage('Deploy') {
                            steps {
                                echo 'Deploying...'
                            }
                        }
                    }
                }
            """)
        }
    }
}