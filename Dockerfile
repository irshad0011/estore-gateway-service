FROM eclipse-temurin:17-jdk-alpine
COPY target/estore-gateway-service.jar estore-gateway-service.jar
ENTRYPOINT ["java","-jar","/estore-gateway-service.jar"]