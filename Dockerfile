FROM --platform=linux/amd64 eclipse-temurin:25-jdk
WORKDIR /app
COPY target/22April-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080