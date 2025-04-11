
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

