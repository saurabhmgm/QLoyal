/**
 * Created by KaushikS on 24/09/2018.
 */
node {
     stage('Checkout') {
        git branch: 'master', credentialsId: 'saurabh.kaushik003@gmail.com', url: 'https://github.com/saurabhmgm/QLoyal.git'
    }
     stage('Run JMeter Test') {
        script {
        bat 'C:/apache-jmeter-3.3/bin/jmeter -n -t https://github.com/saurabhmgm/QLoyal.git/Perf/PHPTRAVELS.jmx -l PHPTRAVELS.jtl'
      }
    }
     stage("Publish-Results") {
            script{
                performanceReport parsers: [[$class: 'JMeterParser', glob: 'C:/apache-jmeter-3.3/bin/PHPTRAVELS.jtl']], relativeFailedThresholdNegative: 1.2, relativeFailedThresholdPositive: 1.89, relativeUnstableThresholdNegative: 1.8, relativeUnstableThresholdPositive: 1.5
            }
        }
  
}
