FROM openjdk:8-jdk-alpine
ADD app/demo5-0.0.1-SNAPSHOT.jar app.jar
VOLUME /tmp
EXPOSE 5000
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar" ]