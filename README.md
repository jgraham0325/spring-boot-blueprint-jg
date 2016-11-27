Blueprint project for prototyping Spring Boot functionality
===================================

Requirements
------------
* [Java Platform (JDK) 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

Quick start
-----------
1. `gradlew bootRun`
2. Point your browser to [http://localhost:8083](http://localhost:8083)

Depoloyment
-----------
1. `gradlew assemble`
2. `java -jar build/libs/spring*.jar`
3. Point your browser to [http://localhost:8083](http://localhost:8083)

Configuration
-----------

Config (incl. server port) is defined in /src/main/resources/application.properties
This can be externalised by putting a custom application.properties in the same directory as the war file when started

Endpoints
-----------

* Static content:
[http://localhost:8083/](http://localhost:8083/)

* Rest end-point example:
[http://localhost:8083/api/v1/endpoint](http://localhost:8083/api/v1/endpoint)

* Actuator end-points (logs, etc):
[http://localhost:8083/actuator](http://localhost:8083/actuator)

* SwaggerUI documentation: 
[http://localhost:8083/swagger-ui.html](http://localhost:8083/swagger-ui.html)