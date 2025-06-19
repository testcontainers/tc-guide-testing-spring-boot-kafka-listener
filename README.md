# Testing Spring Boot Kafka Listener using Testcontainers

This is sample code for [Testing Spring Boot Kafka Listener using Testcontainers](https://testcontainers.com/guides/testing-spring-boot-kafka-listener-using-testcontainers) guide.

## 1. Setup Environment

Make sure you have Java 8+ and a [compatible Docker environment](https://www.testcontainers.org/supported_docker_environment/) installed.
If you are going to use Maven build tool then make sure Java 17+ is installed.

For example:

```shell
$ java -version
openjdk 17.0.15 2025-04-15 LTS
OpenJDK Runtime Environment (build 17.0.15+10-LTS)
OpenJDK 64-Bit Server VM (build 17.0.15+10-LTS, mixed mode, sharing)
$ docker version
...
Server: Docker Desktop 4.0.0 ()
 Engine:
  Version:          28.2.2
  API version:      1.50 (minimum version 1.24)
  Go version:       go1.24.3
  Git commit:       45873be
  Built:            Fri May 30 12:07:26 2025
  OS/Arch:          linux/amd64
  Experimental:     false
...
```

## 2. Setup Project

* Clone the repository

```shell
git clone https://github.com/testcontainers/tc-guide-testing-spring-boot-kafka-listener.git
cd tc-guide-testing-spring-boot-kafka-listener
```

* Open the **tc-guide-testing-spring-boot-kafka-listener** project in your favorite IDE.

## 3. Run Tests

Run the command to run the tests.

```shell
$ ./gradlew test //for Gradle
$ ./mvnw verify  //for Maven
```

The tests should pass.

> [!NOTE]
> The project is configured to automate the code formatting with spotless plugin
> using prettier-plugin-java, which internally requires Node.js runtime.
> If you don't have Node.js installed and want to disable the code formatting,
> you can pass additional parameter to the build command as shown below:

```shell
./gradlew build -x spotlessCheck //for Gradle
./mvnw verify -Dspotless.check.skip=true //for Maven
```
