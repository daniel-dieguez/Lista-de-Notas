FROM openjdk:8-jdk-alpine
MAINTAINER Daniel Dieguez
COPY target/Listatareas-0.0.1-SNAPSHOT.jar ListadoDeNotas-1.0.0.jar
ENTRYPOINT ["java","-jar","/ListadoDeNotas-1.0.0.jar"]