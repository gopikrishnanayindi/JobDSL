               pipeline {
                    agent any
                    
                    stages {

                        stage('Sample App Builds') {
                            steps {
                                echo 'App Building...'
                            }
                        }
                        
                        stage('Sample App Test') {
                            steps {
                                echo 'Testing...'
                            }
                        }
                        
                        stage('Sample App Deploy') {
                            steps {
                                echo 'Deploying...'
                            }
                        }
                    }
                }
