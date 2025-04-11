pipelineJob('Pipeline-Job11') {
    description('This is a Pipeline Job')
    
    definition {
        cps {
            script("""
                pipeline {
                    agent any
                    
                    stages {

                        stage('App Builds') {
                            steps {
                                echo 'App Building...'
                            }
                        }
                        
                        stage('App Test') {
                            steps {
                                echo 'Testing...'
                            }
                        }
                        
                        stage('App Deploy') {
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
