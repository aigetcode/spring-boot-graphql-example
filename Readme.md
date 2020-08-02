# Demo project - Spring Boot and GraphQL

This simple project of GraphQL API implemented in Java with Spring Boot.

For GraphiQL call http://localhost:8080/graphiql, when you start application


## Query implementation

Query example in GraphiQL 
```
query {
  getUsers {
    username
  }
}
```

## Mutation implementation

Mutation example in GraphiQL
```
mutation {
  addUser(nameCity: "Oklahoma", username: "Jack", isMarried: true) {
    username
    city {
      id
      name
    }
  }
}
```

## Subscription implementation

Subscription example in GraphiQL
```
subscription {
  data
}
```