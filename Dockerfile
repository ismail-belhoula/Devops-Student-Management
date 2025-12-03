# Use official OpenJDK 17 image
FROM eclipse-temurin:17-jdk
# Add the JAR built by Maven
ARG JAR_FILE=target/student-management-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Expose port (optional, your app default is 8080)
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java","-jar","/app.jar"]
