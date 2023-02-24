FROM openjdk:11
ADD target/fundingbody-0.0.1-SNAPSHOT.jar fundingbody.jar
ENTRYPOINT ["java", "-jar", "fundingbody.jar"]