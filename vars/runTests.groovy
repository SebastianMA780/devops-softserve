/**
 * Defines a reusable stage for running tests.
 */
def call(Map config = [:]) {
    stage('Test') {
        echo 'This is the modular test stage.'
        echo 'Installing dependencies and running tests...'
        // As your testing grows, you can add more steps here, for example:
        // sh 'npm install'
        // sh 'npm test'
    }
}
