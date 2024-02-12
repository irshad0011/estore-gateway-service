FROM eclipse-temurin:17-jdk-alpine
COPY target/estore-gateway-service-0.0.1-SNAPSHOT.jar estore-gateway-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/estore-gateway-service-0.0.1-SNAPSHOT.jar"]