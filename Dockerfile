FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
COPY target/estore-gateway-service.jar estore-gateway-service.jar
ENTRYPOINT ["java","-jar","/estore-gateway-service.jar"]