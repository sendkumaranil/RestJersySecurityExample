# RestJersySecurityExample
Rest Security Example using Jersy API
This example is using Declarative Approach,
where following files will be modified for declarative approaches using BASIC Authentication type.
web.xml
tomcat-user.xml
server.xml

web.xml
--authenticate user role and resources
tomcat-user.xml
--creating user and roles
server.xml
--turn on realm 
--Use the LockOutRealm to prevent attempts to guess user passwords via a brute-force attack
