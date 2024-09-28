<!-- TOC -->
* [Part_1_Java_Techie - Spring Boot Interview Mastery](#part_1_java_techie---spring-boot-interview-mastery)
  * [1. Why choose spring boot over spring Framework?](#1-why-choose-spring-boot-over-spring-framework)
  * [2. What all spring boot starter you have used ?](#2-what-all-spring-boot-starter-you-have-used-)
  * [3. How you run spring boot application?](#3-how-you-run-spring-boot-application)
  * [4. Purpose of `@SpringBootApplication`?](#4-purpose-of-springbootapplication)
  * [5. Can you use above 3 annotations instead of @SpringBootApplication?](#5-can-you-use-above-3-annotations-instead-of-springbootapplication)
  * [6. What is auto configuration ?](#6-what-is-auto-configuration-)
  * [7. How to disable specific auto-configuration class in spring boot?](#7-how-to-disable-specific-auto-configuration-class-in-spring-boot)
  * [8. How to customize default configuration in Spring Boot ?](#8-how-to-customize-default-configuration-in-spring-boot-)
  * [9. How Spring Boot run() method works internally ?](#9-how-spring-boot-run-method-works-internally-)
  * [10. What is command line runner in Spring Boot?](#10-what-is-command-line-runner-in-spring-boot)
<!-- TOC -->

# Part_1_Java_Techie - Spring Boot Interview Mastery

- https://youtu.be/-_tPeb3VE6w?si=v4Lwxuc1NfKiy12m
- https://drive.google.com/file/d/1BFPKjUhe-lueVdvFKm0mmh9A0jwlOsSU/view?usp=sharing

## 1. Why choose spring boot over spring Framework?

- Dependency Resolution/Avoid version conflict
- Avoid additional configuration
- Embed Tomcat,Jetty ( no need to deploy WAR files)
- Provide production-ready features such as metrics,health checks.

## 2. What all spring boot starter you have used ?

- spring-boot-starter-web
- spring-boot-starter-data-jpa
- spring-boot-starter-hateoas
- spring-boot-starter-validation
- spring-boot-starter-security
- spring-boot-starter-actuator

## 3. How you run spring boot application?

- `mvn spring-boot-run`
  - If java + maven - then jar file will be in target folder

## 4. Purpose of `@SpringBootApplication`?

- Equivalent to
  - `@EnableAutoConfiguration` - Automatically configure dependencies
  - `@ComponentScan` - Enable components scanning in main class and sub packages
  - `@Configuration` - Allow to register extra bean in the context or input additional configuration classes.

## 5. Can you use above 3 annotations instead of @SpringBootApplication?

- Yes

## 6. What is auto configuration ?

- in application.properties file, add following line -
  `debug=true`
- Then, run your application
- It lists positive matches and negative matches
  - positive matches will have chance to be enabled by spring boot for us
- In auto configuration class, if all the conditions are satisfied then only spring boot will autoconfigure for
  application

## 7. How to disable specific auto-configuration class in spring boot?

- from main app - `@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})`
  OR
- from application.properties -
  `spring.autoconfigure.exclude = org.springframework.boot.autoconfigure.aop.AopAutoconfiguration`

## 8. How to customize default configuration in Spring Boot ?

- we can do through application.properties file

## 9. How Spring Boot run() method works internally ?

- Check application type from environment properties
- Create ApplicationContext
- Register bean into context
- Kicked up embedded Tomcat container to run your jar/war

## 10. What is command line runner in Spring Boot?

- Any preprocessing logic can be placed here
