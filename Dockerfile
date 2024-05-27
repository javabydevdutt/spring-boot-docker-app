FROM openjdk:17-jdk-alpine

MAINTAINER "DEVDUTT JATAV"

COPY target/spring-boot-docker-app.jar /usr/app

WORKDIR /usr/app

EXPOSE 9090

ENTRYPOINT [ "java","-jar","spring-boot-docker-app.jar" ]
