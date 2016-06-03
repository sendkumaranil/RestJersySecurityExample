# RestJersySecurityExample (Container Managed)
Rest Security Example using Jersy API
This example is using Container Managed Security.
where following files will be modified for container managed using BASIC Authentication type.
1)web.xml
2)tomcat-user.xml
3)server.xml

->web.xml
  --authenticate user role and resources,
->tomcat-user.xml
  --creating user and roles
->server.xml
  --turn on realm 
  --Use the LockOutRealm to prevent attempts to guess user passwords via a brute-force attack
