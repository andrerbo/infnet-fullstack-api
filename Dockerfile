FROM openjdk:17-jdk-slim
COPY ./target/cars-0.0.1-SNAPSHOT.jar /app/cars-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/cars-0.0.1-SNAPSHOT.jar"]
