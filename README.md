# PROJECT NAME
document-management-int-api

## Description
Document management project including functionality to store and remove documents associated to different services data.
Store files into Abast.

## Prepare environment
* Requirements:
  - Java 1.8
  - Maven (can use mvnw included in project)

## How to run (spring local profile)
>  ./mvnw spring-boot:run -Dspring.profiles.active=local


## Api
> {environmentUrl}/swagger-ui.html

## Built With


* [Spring-Boot (v2.0.2)](https://projects.spring.io/spring-boot/) - The web framework used
* [Maven (v3.5)](https://maven.apache.org/) - Dependency Management

#### How to build run docker image with ElasticSearch for logging in local
Pull ElasticSearch image from Docker hub:
```
docker pull elasticsearch
```

Run image:
```
docker run -p 9200:9200 -p 9300:9300 id_image
```
