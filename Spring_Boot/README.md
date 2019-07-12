# Spring Boot REST service

This is a Java, Maven, Spring Boot (version 2.0.3) test application that returns the balance and currency for a given user. it was created because of PAF Coding exercise.

## How to Run
This application is packaged as a war which has Tomcat 8 embedded. No Tomcat or JBoss installation is necessary. You run it using the java -jar command.
* Clone this repository
* Make sure you are using [JDK 1.8](https://www.java.com/en/download/) and [Maven 3.x](https://maven.apache.org/)
* Be sure that 8080 port is free at the moment
* You can build the project and run the tests by running 
```
      mvn clean install
```
* Once successfully built, you can run the service by one of these two methods:
```
      mvn spring-boot:run 
```       
* Check the stdout or boot_example.log file to make sure no exceptions are thrown 
Once the application runs you should see something like this
```
  2017-08-29 17:31:23.091  INFO 19387 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8090 (http)
  2017-08-29 17:31:23.097  INFO 19387 --- [           main] com.khoubyari.example.Application        : Started Application in 22.285 seconds (JVM running for 23.032)
```
# About the Service
The service is just for a test project review REST service. 
You can start calling some of the operational endpoints (see full list below) like /myservice and /myservice/balance (these are available on port 8080)

You can use this sample service to understand the conventions and configurations. Once you understand and get comfortable with the sample app.

Here is what this little application demonstrates:

* Full integration with the latest Spring Framework: inversion of control, dependency injection, etc.
* No need to install a container separately on the host just run using the java -jar command
* Exception mapping from application exceptions to the right HTTP response with exception details in the body
* The out put is under JSON format
```
      {
            "balance": "9",
            "currency": "X"
      }
```
* Here are some endpoints you can call:
### Get balance and currency for a given user.
Send request in below format. it must contain id and username.
```
http://localhost:8080/myservice/balance?id=3&username=XYZ
```
# About Spring Boot
Spring Boot is an "opinionated" application bootstrapping framework that makes it easy to create new RESTful services (among other types of applications). It provides many of the usual Spring facilities that can be configured easily usually without any XML. In addition to easy set up of Spring Controllers, Spring Data, etc. Spring Boot comes with the Actuator module that gives the application the following endpoints helpful in monitoring and operating the service:
# Questions and Comments: vpiroozbakht@gmail.com
