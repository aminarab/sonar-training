1- Extract zip G:\Archive\sonarqube-8.3.1.34397.zip to G:\sonarqube-8.3.1.34397

2- Environment Variable :
SONAR_RUNNER_HOME=G:\sonarqube-8.3.1.34397\bin\windows-x86-64

3- D:\run\ws\process\sonar-training>mvn clean install site

4- D:\run\ws\process\sonar-training>mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -X

https://www.howtogeek.com/howto/28609/how-can-i-tell-what-is-listening-on-a-tcpip-port-in-windows/
https://helpdeskgeek.com/how-to/use-netstat-to-see-listening-ports-and-pid-in-windows/

netstat -o -n -a | findstr 0.0:[port] -> PID
netstat -o -n -a | findstr 0.0:9000 -> xdebug.remote_port=9000 use for php Eclipse


C:\sonarqube-8.3.1.34397\bin\windows-x86-64\StartSonar.bat
SonarQube requires Java 11 to run


192.168.1.5
192.168.1.9