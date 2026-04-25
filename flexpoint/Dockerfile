FROM eclipse-temurin:17-jdk
ARG JAR_FILE=target/flexpoint-0.0.1.jar
COPY ${JAR_FILE} /app/flexpoint.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/flexpoint.jar"]