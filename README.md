# Getting Started
GraphQL interface exposed to endpoint http://localhost:8080/graphql
based on example from [Udacity Java Web Developer Nanodegree](https://www.udacity.com/course/java-developer-nanodegree--nd035)

### ToDo
Activate /graphql/schema.json
- queries via endpoints /graphql and /graphiql work as desired
- http://localhost:8080/graphql/schema.json leads to 404

### Versions and Dependencies
Spring Boot 2.7.3, using spring-boot-starter-graphql as single dependency for GraphQL.

### History and Migration
Before Spring Boot 2.7.0 the two dependencies: 
* graphql-spring-boot-starter (5.0.2), together with
* graphql-java-tools (5.2.4))

... have been used along with implementation of the two interfaces GraphQLQueryResolver and GraphQLMutationResolver.
Both are not required/supported since Spring Boot 2.7.0 and replaced with Annotations.  

Also see [blog.devgenius.io](https://blog.devgenius.io/graphql-with-spring-boot-starter-graphql-7b406998c0b5)
where migration to 2.7.0 from earlier versions is described.

### Example Queries
Navigate to http://localhost:8080/graphiql and place following queries:
```
{
    findAllDogs {
        name
        breed
    }
}
```
```
{
  findDogById(id: "1") {
    name
    breed
  }
}
```
```
mutation
{
  deleteDogBreed(breed: "Pit Bull")
  
}
```
```
mutation
{
    updateDogName(newName: "Rex", id:"3") {
        id
    }
}
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

