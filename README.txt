Building block Spring REST Dockerized

Herewith a small example how to mount a Spring REST web app in a Docker container. Spring
by default starts an embedded Apache Tomcat application server image for your container.

Summary

- Java 17
- Spring Boot by way of Initializr

How to run

. build.sh   // in the root of restDocker

How to test

http://localhost:5000/allCustomers  // App will respond "No customers recorded yet"