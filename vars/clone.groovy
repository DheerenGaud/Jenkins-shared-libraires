def call(String url,String branch){
                echo "clone the project"
                git url:"${url}",
                branch : "${branch}"
}
