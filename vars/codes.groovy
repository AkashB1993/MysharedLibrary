def gitDownload(repo)
{
  git "https://github.com/AkashB1993/${repo}.git"
}
def newBuild()
{
  sh 'mvn package'
}
def newDeployment(jobname,ip,appname)
{
  deploy adapters: "[tomcat9(credentialsId: '14913ee1-760e-42cd-bd05-0d981085ad17', path: '', url: 'http://${ip})], contextPath: ${appname}, war: '**/*.war"
 // sh "scp /var/lib/jenkinss/workspace/${jobname}/webapp/target/webapp.war ubuntu@ ${ip}:/var/lib/tomcat9/webapp/${appname}.war"
}
