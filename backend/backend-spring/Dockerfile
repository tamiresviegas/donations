FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY backend/backend-spring/target/backend-spring.jar backend-spring.jar.
ENTRYPOINT ["java","-jar","/backend-spring.jar"]
