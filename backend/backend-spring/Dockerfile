FROM openjdk:8-jdk-alpine
MAINTAINER github.com/tamiresviegas
COPY ./target/backend-spring.jar /app/backend-spring.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","backend-spring.jar"]
