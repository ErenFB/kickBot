FROM openjdk:21-jdk-slim
WORKDIR /app

EXPOSE 8080

COPY ./target/kickBot-0.0.1-SNAPSHOT.jar kickBot.jar

ENTRYPOINT ["java", "-jar", "kickBot.jar"]
