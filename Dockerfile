FROM eclipse-temurin:17-jre
ENV delay=1
COPY stub/target/service_stub-1.jar app.jar
ENTRYPOINT java -jar app.jar --custom.response=$delay