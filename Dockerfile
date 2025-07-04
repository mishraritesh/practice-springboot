FROM amazoncorretto
EXPOSE 8080
LABEL authors="ritesh"
ADD target/springboot-practice.jar springboot-practice.jar
ENTRYPOINT ["java", "-jar" , "/springboot-practice.jar"]