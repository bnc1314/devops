FROM openjdk:8-jdk-alpine
VOLUME /home/student/assignment1
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8090:80
