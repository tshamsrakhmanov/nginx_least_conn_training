FROM openjdk:17-jdk-alpine
COPY stub/target/service_stub-1.jar app.jar
COPY dockerfile_script/run.sh run.sh
ENTRYPOINT ["./run.sh"]