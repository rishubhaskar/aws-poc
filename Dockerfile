FROM openjdk:11
EXPOSE 9094
ADD target/aws-poc.jar aws-poc.jar
ENTRYPOINT ["java", "-jar", "/aws-poc.jar"]