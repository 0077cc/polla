FROM maven:3.5.4-jdk-8
WORKDIR /app
COPY . ./
RUN mvn clean install -Dmaven.test.skip=true
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "/app/target/polla-0.0.1-SNAPSHOT.jar"]