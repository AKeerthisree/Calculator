FROM openjdk:8
COPY  ./target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "./target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]

