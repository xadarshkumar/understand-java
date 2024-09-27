package org.example.part_4_practice._2024_09_24_deloitte;

/*
 * Listen to the recording and extract summary points, improvements etc
 * Introduction
 * Java, REST API, Spring Boot, Microservices,
 * What you've worked on AWS
 * CI/CD services
 * Lambda
 * CloudFormation
 * DynamoDB
 * ECR,ECS
 * Cognito
 * CloudFormation - Intrinsic Functions
 *      - Use intrinsic functions in your templates to assign values to properties that are not available until runtime.
 *      - e.g - Ref, Sub, GetAtt
 *      - read more - https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference.html
 * template.yml
 *  contains
 *      1. Properties
 *      2. Resources
 *          2.1 Type
 *          2.2 Properties
 *          2.3 TemplateURL
 *
 * How to export ARN in cloudformation?
 *      Outputs:
 *          NameOfOutput:
 *              Value: !GetAtt ResourceName.Arn
 *      In the parent template:
 *          pass it under Properties like - UserAccessTableArn: !GetAtt ResourceName.Outputs.NameOfOutput
 *
 * purpose of creating mappings in cloudformation
 * how can we create mappings in cloudformation
 *      - create key-value pairs that can be used to specify values based on certain conditions or dependencies
 *      - !FindInMap [SecurityGroupMap, !Ref "AWS::Region", !Ref EnvironmentType]
 *      - read more - https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/mappings-section-structure.html
 *
 *
 * Design patterns - java
 *  - 3 main types
 *      - Creational - Builder, Factory, Prototype - Purpose of Builder Pattern
 *      - Structural
 *      - Behavioral
 *  - read more - https://refactoring.guru/design-patterns/java
 *
 * Bean Scopes present in Spring
 *      - read more - https://docs.spring.io/spring-framework/reference/core/beans/factory-scopes.html
 *      - Singleton(Default), Prototype, Request, Session, Application, Web Socket
 *      -
 *
 * read this - https://www.baeldung.com/spring-boot-change-request-body-before-controller
 * Browser - Filter - DispatcherServlet - interceptors - Controller
 *
 * https://coralogix.com/blog/spring-boot-logging-best-practices-guide/
 *
 *
 * text area validations
 *  https://www.digitalocean.com/community/tutorials/sql-injection-in-java
 *  https://stackoverflow.com/a/77698224
 *  comment box - inputs can't be validated. they are very open.
 *
 *
 * SQL- BULK INSERT
 *  BATCH + BULK
 *
 *
 * Design Pattern -
 *  (CQRS) - Why CQRS?
 *
 * https://www.openlegacy.com/blog/microservices-architecture-patterns/
 * https://www.geeksforgeeks.org/top-microservices-patterns/
 *
 *
 * Monitoring - in Spring - Actuators
 * Multithreading Scenario in real world applications
 *
 *
 * unit testing
 *  learn testing - read the theory part little bit
 *
 * java 17 new features
 * - updated switch
 * - records
 *
 * Serialisation
 *  - Jackson objectmapper
 *  - what happens when you won't serialise?
 *
 * When you get some request in some data types like json/xml,
 * the Spring MVC platform will try to deserialize this request
 * attributes in some model object of your project.
 * But the platform itself don't provide a des-serialize implementation out of the box.
 * So it will try to use some des-serializer provider in the classpath like jackson, jersey, gson, etc.
 *
 * volatile, transient
 *
 * CI/CD
 * Docker
 *  Dockerfile
 *  docker-compose.yml
 *
 * DynamoDB
 *  GlobalSecondaryIndex, and its purpose
 *
 * Cognito
 * IAM Policy
 * Provisioned concurrency
 *
 *
 * Why do you want to switch?
 * Your role and scope in current org?
 *
 *
 *
 * Improve in core java concepts
 *  - Multithreading
 *  - Collections
 *
 * Learn end-to-end completely first, before jumping to next
 *
 *  Everyday or once in a week go through these learnings
 * Features in java collections
 *
 * JUnit - @Before, @BeforeEach, @After, @AfterEach
 * Explain in details with more confidence
 *  Don't show that you don't know anything. Don't show emotions in interview - no frustration.
 *  Focus on camera.
 * `How do you present to the interviewer is the main thing.
 *      Explain technical
 *      Energy in the voice from start till end
 *
 * Entire development life cycle, from start till end.
 * No one will expect you to answer 100%. You need to get over 60% and use behavioral aspects to pass the threshold.
 *
 * Speak fluently, don't speak and break. Just go once completely - don't hold the line.
 * I have to thing explaining concepts to a non-technical manager.
 *
 * - Improve presenting and scenarios
 *
 * Whatever you put in resume, always have an answer for those points, else simply don't put it.
 *      -e,g - CI/CD - what you've done in ci/cd by yourself
 *              If you created a pipeline, you should be confident in explaining the pipeline.
 *
 * Rollback strategy in pipeline
 *      Red-Green deployment vs canary deployment
 *
 *
 * Honestly, this is what I've done - I'm a quick learner, will pick up skills as required.
 */

public class Interview {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
