def call (def giturl,def branch){
checkout([$class: 'GitSCM', branches: [[name: branch ]], extension: [], userRemoteConfigs: [
[credentialsId: 'github', url:giturl]
]])
}
