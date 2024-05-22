# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app

COPY pom.xml ./
RUN mvn dependency:go-offline -B

COPY src ./src
RUN mvn package -DskipTests

# Stage 2: Run the application
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/portfolio_backend-0.0.1-SNAPSHOT.jar /app/portfolio_backend.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/portfolio_backend.jar"]
