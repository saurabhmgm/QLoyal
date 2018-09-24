/**
 * Created by KaushikS on 24/09/2018.
 */
node {
     stage('Checkout') {
       checkout scm
    }
     stage('Run JMeter Test') {
        script {
        bat 'C:/apache-jmeter-3.3/bin/jmeter -n -t https://github.com/saurabhmgm/QLoyal.git/Perf/PHPTRAVELS.jmx -l PHPTRAVELS.jtl'
      }
    }
     stage("Publish-Results") {
            
               step([$class: 'ArtifactArchiver', artifacts: '**/*.jtl, **/jmeter.log'])
            
        }
  
}
