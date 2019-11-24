# Library-Spring-Boot
Spring Boot REST API example for library management system (Under Development)

Dependency Used
* Lombok
* JPA and Hibernate
* Actuator
* Web Starter

## To Do List
- [x] Add MySQL Database
- [x] Convert APIs to Database
- [ ] Add Author
- [ ] Add Relationships
- [ ] Add request validations
- [ ] Add Authentication

## Application.Properties
You need this for your MySQL configuration

```
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${hostname}:3306/${db}?serverTimezone=Asia/Brunei
spring.datasource.username=${username}
spring.datasource.password=${password}
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect // very important
```

## Interesting Findings
* You don't have to do DB Migration. Hibernate will automatically create DB Tables based on your Java Entity
* Don't forget to `@Autowired` your repository if you want to use them
* `CrudRepository` is similar to `Laravel's Eloquent`
* `Models` contains the Entity
* `Services` contains business logic which uses repositories
* `Repositories` is just like Eloquent Models
* `Controllers` handle the request response
