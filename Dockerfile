FROM amazoncorretto:11-alpine-jdk
WORKDIR /apps/api-employee/
COPY target/api-employee.jar ./api-employee.jar
ENTRYPOINT ["java", "-jar", "api-employee.jar"]
