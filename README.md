# hands-on-spring

- [hands-on-spring](#hands-on-spring)
  - [Quick Start](#quick-start)
  - [REST service](#rest-service)
  - [Spring Boot](#spring-boot)
  - [Accessing Data JPA](#accessing-data-jpa)
  - [Accessing Data REST](#accessing-data-rest)
  - [Managing Transactions](#managing-transactions)
  - [Handling Form Submission](#handling-form-submission)
  - [Messaging Stomp Websocket](#messaging-stomp-websocket)
  - [REST Service CORS](#rest-service-cors)
  - [Spring Boot Docker](#spring-boot-docker)
  - [Accessing Data MySQL](#accessing-data-mysql)
  - [Accessing Data MongoDB](#accessing-data-mongodb)

## Quick Start

Hands-on the [tutorial](https://spring.io/quickstart).

**Dependencies:**

- Spring Web

You will build a classic “Hello World!” endpoint which any browser can connect to. You can even tell it your name, and it will respond in a more friendly way.

## REST service

Hands-on the [tutorial](https://spring.io/guides/gs/rest-service/#scratch). Building a RESTful Web Service.

**Dependencies:**

- Spring Web

This guide walks you through the process of creating a “Hello, World” RESTful web service with Spring.

- Create a Resource Representation Class
- Create a Resource Controller

## Spring Boot

Hands-on the [tutorial](https://spring.io/guides/gs/spring-boot/#scratch). Building an Application with Spring Boot.

**Dependencies:**

- Spring Web

This guide is meant to give you a quick taste of Spring Boot.

- Create a Simple Web Application
- Create an Application Class
- Add Unit Test
- Add Production-grade Services

## Accessing Data JPA

Hands-on the [tutorial](https://spring.io/guides/gs/accessing-data-jpa/). Accessing Data with JPA.

**Dependencies:**

- Spring Data JPA
- H2 Database

This guide walks you through the process of building an application that uses Spring Data JPA to store and retrieve data in a relational database.

- Define a Simple Entity
- Create Simple Queries
- Create an Application Class

## Accessing Data REST

Hands-on the [tutorial](https://spring.io/guides/gs/accessing-data-rest/). Accessing JPA Data with REST.

**Dependencies:**

- H2 Database
- Spring Data JPA
- Rest Repositories

This guide walks you through the process of creating an application that accesses relational JPA data through a hypermedia-based RESTful front end.

- Create a Domain Object
- Create a Person Repository
- Test the Application (with curl)

## Managing Transactions

Hands-on the [tutorial](https://spring.io/guides/gs/managing-transactions/). Managing Transactions.

**Dependencies:**

- Spring Data JDBC
- H2 Database

This guide walks you through the process of wrapping database operations with non-intrusive transactions.

- Create a Booking Service
- Build an Application

## Handling Form Submission

Hands-on the [tutorial](https://spring.io/guides/gs/handling-form-submission/). Handling Form Submission.

**Dependencies:**

- Spring Web
- Thymeleaf

This guide walks you through the process of using Spring to create and submit a web form.

- Create a Web Controller

## Messaging Stomp Websocket

Hands-on the [tutorial](https://spring.io/guides/gs/messaging-stomp-websocket/). Using WebSocket to build an interactive web application.

**Dependencies:**

- WebSocket

This guide walks you through the process of creating a “Hello, world” application that sends messages back and forth between a browser and a server.

- Create a Resource Representation Class
- Create a Message-handling Controller
- Configure Spring for STOMP messaging

## REST Service CORS

Hands-on the [tutorial](https://spring.io/guides/gs/rest-service-cors/). Enabling Cross Origin Requests for a RESTful Web Service.

**Dependencies:**

- Spring Web
- httpclient

This guide walks you through the process of creating a “Hello, World” RESTful web service with Spring that includes headers for Cross-Origin Resource Sharing (CORS) in the response.

- Create a Resource Representation Class
- Enabling CORS

## Spring Boot Docker

Hands-on the [tutorial](https://spring.io/guides/gs/spring-boot-docker/). Spring Boot with Docker.

**Dependencies:**

- Spring Web

This guide walks you through the process of building a Docker image for running a Spring Boot application.

## Accessing Data MySQL

Hands-on the [tutorial](https://spring.io/guides/gs/accessing-data-mysql/). Create a MySQL database, build a Spring application, and connect it to the newly created database.

Use MySQL Commond Line Client on windows 10.

[@RequestBody 和@RequestParam 的请求方式 get 和 post 关系](https://blog.csdn.net/qfikh/article/details/88553603)

## Accessing Data MongoDB

Hands-on the [tutorial](https://spring.io/guides/gs/accessing-data-mongodb/). This guide walks you through the process of using Spring Data MongoDB to build an application that stores data in and retrieves it from MongoDB, a document-based database.

> Warning: the "mongo" shell has been superseded by "mongosh"
