FROM amazoncorretto:17
COPY build/libs/parcial1-api-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]