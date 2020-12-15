

FROM maven:adoptopenjdk AS build

WORKDIR /app

COPY ./ ./

RUN mvn clean install -P no-download

FROM adoptopenjdk:latest


WORKDIR /app

COPY --from=build /app/target/logging-1.0.0-SNAPSHOT-jar-with-dependencies.jar .


CMD ["java", "-jar", "logging-1.0.0-SNAPSHOT-jar-with-dependencies.jar"]