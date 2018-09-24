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
             script {
                 cd C:\\apache-jmeter-3.3\\bin\
               jmeter -n -t https://github.com/saurabhmgm/QLoyal.git/Perf/PHPTRAVELS.jmx -l PHPTRAVELS.jtl
            }
        }
    }
   
}
