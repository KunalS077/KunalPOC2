FROM openjdk:11
EXPOSE 8080
COPY target/POC2JarFile.jar POC2JarFile.jar
ENTRYPOINT [ "java","-jar","/POC2JarFile.jar ]