FROM openjdk:21-slim
MAINTAINER Daniel Dieguez
COPY target/Listatareas-0.0.1-SNAPSHOT.jar Listatareas-1.0.0.jar
ENTRYPOINT ["java","-jar","/Listatareas-1.0.0.jar"]


