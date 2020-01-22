node("linux") {
  def customImage = ""
  stage("create dockerfile") {
    sh """
      tee Dockerfile <<-'EOF'
       FROM ubuntu:latest
       RUN touch file-01.txt
EOF
"""
}
  stage("build docker") {
    customImage = docker.build("shaulishaked/opsschool-jenkins-test-01")
}
  stage("verify dockers") {
    sh "docker images"
  }
}
