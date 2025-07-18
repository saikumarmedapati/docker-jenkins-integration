FROM openjdk-17
EXPOSE 8085
COPY target/*.jar docker-jenkins-demo.jar
ENTRYPOINT [ "java", "-jar", "/docker-jenkins-demo.jar" ]
