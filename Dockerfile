FROM openjdk:17-jdk-alpine
ENV delay=100
COPY stub/target/service_stub-1.jar app.jar
COPY dockerfile_script/run.sh run.sh
ENTRYPOINT java -jar app.jar --custom.response=$delay