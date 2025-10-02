def call(String project_name){
  sh "docker build -t ${project_name} ."
}
