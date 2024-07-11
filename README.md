Spring Demo API with Kotlin
==============================

Table of contents:

- [Description](#description)
- [Documentation](#documentation)
- [Set up database](#setup)
- [Start up](#startup)

Description
------------------------------

This is a simple project that covers the basics of API development using the Spring framework with the Kotlin
programming language.

Documentation
------------------------------

You can find the documentation for these two technologies here:

- [Kotlin Documentation](https://kotlinlang.org/docs/home.html)
- [Spring Boot](https://docs.spring.io/spring-boot/index.html)

Startup
------------------------------
To start clone the project using the following command

```bash
git clone https://github.com/hangalito/demo-kotlin-api
```

Then you will have to create the database (the project uses originally Postgres database, if you use MySQL instead,
switch to mysql branch). You may need to update the credentials
at [application.yaml](src/main/resources/application.yaml) to match yours.

After creating the database you can run the following command to run the project

```bash
./gradlew bootRun
```

and then open the browser at [http://localhost:8080/api/customers](http://localhost:8080/api/customers)
