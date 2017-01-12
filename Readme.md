1. build jar file
    execute
    mvn clean install
2. create docker file "Dockerfile"
    FROM frolvlad/alpine-oraclejdk8:slim
    ADD ./target/spring-boot-jenkins-workshop-0.0.1-SNAPSHOT.jar app.jar
    ENV JAVA_OPTS=""
    ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
3. Build docker image
    execute
    docker build .
4. Run docker image
    execute
    sudo docker run -p 8080:8080 03b413db1357