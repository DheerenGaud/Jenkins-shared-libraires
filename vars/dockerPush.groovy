def call(String imageName, String dockerRepo, String credentialsId) {
    steps {
        script {
            withCredentials([usernamePassword(credentialsId: credentialsId, usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                sh """
                    echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin
                    docker image tag ${imageName} ${dockerRepo}:latest
                    docker push ${dockerRepo}:latest
                """
            }
        }
    }
}
