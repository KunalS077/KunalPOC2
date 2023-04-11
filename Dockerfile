FROM openjdk:11
EXPOSE 8080
COPY target/poc-docker.jar kunaljarfile-POC.jar
ENTRYPOINT [ "java","-jar","/kunaljarfile-POC.jar ]