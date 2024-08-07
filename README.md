# Spring Boot Template

![CI](https://github.com/chenrui333/spring-boot-template/workflows/ci/badge.svg)
[![codecov](https://codecov.io/gh/chenrui333/spring-boot-template/branch/main/graph/badge.svg?token=PmeCqKHbTR)](https://codecov.io/gh/chenrui333/spring-boot-template)

Minimal spring-boot microservice template.


## Dependencies

- Java 22
- Gradle 8.9
- Spring Boot 3

## How to run and test the app

- `./gradlew bootRun`
- `curl http://localhost:9000/hello`

## build performance

- without cache, 1m27s, build run, https://github.com/chenrui333/spring-boot-template/actions/runs/2162133074
- with cache, 1m9s, build run, https://github.com/chenrui333/spring-boot-template/runs/6010214055
- with cache, 54s, build run, https://github.com/chenrui333/spring-boot-template/runs/2162167587
- with cache, 53s, build run, https://github.com/chenrui333/spring-boot-template/runs/2162182351
