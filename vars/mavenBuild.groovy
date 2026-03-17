def call(){
    stage ('Build using shared library') {
        echo "running build using shared library"
        sh 'mvn clean package'
    }
}
