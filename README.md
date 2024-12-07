Demo API

Simple application to demonstrate my skills and how I work with MVC and use it to CRUD.

Tools
-Spring Boot
-Spring MVC
-Spring Security
-Spring Data JDBC
-H2

How to run it
-Clone git repository: 
git clone https://github.com/mcp182/demo.git
-Build project:
./mvnw clean package
-Execute:
java -jar ./target/demo-0.0.1-SNAPSHOT.jar
-Test ( with httppie ):
http -a username:password POST :8080/authenticate
JWT = <token>
http :8080/private -A bearer -a ${JWT}
