FROM amazoncorretto:11-alpine-jdk
MAINTAINER VAO
COPY victor/target/victor-0.0.1-SNAPSHOT.jar  vao-app.jar
ENTRYPOINT ["java","-jar","/vao-app.jar"]