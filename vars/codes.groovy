def gitDownload(repo)
{
  git "https://github.com/AkashB1993/${repo}"
}
def newBuild()
{
  sh 'mvn package'
}
def newDeployment(jobname,ip,appname)
{
sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
def runSelenium(jobname)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
  ///home/ubuntu/.jenkins/workspace/DecltiveSharedLibrary/.git
}

 
