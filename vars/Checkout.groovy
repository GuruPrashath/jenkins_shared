def call (def giturl,def branch){
    echo "hurray!!!"
checkout([$class: 'GitSCM', branches: [[name: branch ]], extension: [], userRemoteConfigs: [
[credentialsId: 'github', url:giturl]
]])
}
