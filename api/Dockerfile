FROM openjdk:8-jdk-alpine
COPY ./target/fuel-tracker*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]