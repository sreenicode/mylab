node{
    
    stage('clean'){
        cleanWs()
    }
    
    stage('checkout'){
        echo 'started checking out project'
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/sreenicode/mylab.git']]])
   
    }
    
    stage('build'){
        
         dir('learning-concepts'){
             echo 'start'
             sh 'chmod +x gradlew'
             sh './gradlew clean build'
             echo 'done'
         }
        
    }
    
    stage('archive'){
        dir('learning-concepts'){
        archiveArtifacts artifacts: 'build/libs/**/*', followSymlinks: false
        }
    }
    
    stage('deploy to PWS'){
    dir('learning-concepts'){
        
    

        echo 'start'
        sh 'cf login -a https://api.run.pivotal.io/ -o mylab-sreeni-org -s development -u sreenivasulu.kambham@gmail.com -p Zebronic@1'
        sh 'cf routes'
        sh 'cf push concepts -f manifest.yml'
        sh 'cf map-route concepts cfapps.io --hostname concepts'
        
        }
        
        }
    }

    
