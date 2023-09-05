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
sh "scp /home/ubuntu/.jenkins/workspace/DecltiveSharedLibrary/webapp/target/webapp.war ubuntu@172.31.8.235:/var/lib/tomcat9/webapps/testapp3.war"

