FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD backend/backend-spring/target/backend-spring.jar
COPY **/target/backend-spring.jar backend-spring.jar.
ENTRYPOINT ["java","-jar","/backend-spring.jar"]
