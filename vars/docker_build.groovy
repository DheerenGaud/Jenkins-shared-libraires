def call(String project_name,String tag){
  sh "docker build -t ${project_name}:${tag} ."
}
