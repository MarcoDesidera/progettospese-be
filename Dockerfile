# Fase 1: Build con Maven
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
# Compila il pom.xml dentro la cartella progettospese
RUN mvn -f progettospese/pom.xml clean package -DskipTests

# Fase 2: Run con Java 21
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
COPY --from=build /app/progettospese/target/*.jar app.jar
EXPOSE 8080
# Cloud Run assegna la porta automaticamente tramite la variabile $PORT
ENTRYPOINT ["java", "-Dserver.port=${PORT}", "-Xmx512M", "-jar", "app.jar"]
