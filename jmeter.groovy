/**
 * Created by KaushikS on 24/09/2018.
 */
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', credentialsId: 'saurabh.kaushik003@gmail.com', url: 'https://github.com/saurabhmgm/QLoyal.git'

            }
        }
    }
    stage('Run JMeter Test') {
        steps {
            dir('Perf') {
                bat 'bat 'C:/apache-jmeter-3.3/bin/jmeter -n -t PHPTRAVELS.jmx -l PHPTRAVELS.jtl'
            }
        }
    }
}
