def call(def giturl,def branch) {
  echo "mvn compile"
  sh '''
  mvn  compile
  '''
}
