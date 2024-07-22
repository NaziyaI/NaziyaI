# Spring Boot Redis example

Add Redis Cache into your Spring Boot Application (CRUD example) using `spring-boot-starter-data-redis`.

## Run Spring Boot application
```
mvn spring-boot:run
```

## Postman collection

GET : http://localhost:8080/api/redis/find?key=testKey3
POST : http://localhost:8080/api/redis/save?key=testKey3&value=testValue3
DELETE : http://localhost:8080/api/redis/delete?key=test3