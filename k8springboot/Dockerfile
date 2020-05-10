FROM openjdk:8-jdk-alpine

EXPOSE 8080

ARG JAR_FILE=/target/{jarfilename}.jar

COPY $(JAR_FILE) app.jar

ENTRYPOINT [“java”,”-jar”,”{jarfilename.jat}”]
