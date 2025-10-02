def clone(String url,String branch){
                echo "clone the project"
                git url:"${url}",
                branch : "${branch}"
}
