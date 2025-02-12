FROM openjdk:17-jdk-alpine
COPY stub/target/service_stub-1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]