FROM openjdk:17-alpine
VOLUME /tmp
#EXPOSE 8000
ADD ./target/openshft-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
ENTRYPOINT ["sh","-c","java -jar /app.jar"]