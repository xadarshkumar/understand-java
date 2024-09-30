<!-- TOC -->
* [Part_5_Java_Techie - Spring Boot Interview Mastery](#part_5_java_techie---spring-boot-interview-mastery)
  * [49. How will you handle exceptions in your project?](#49-how-will-you-handle-exceptions-in-your-project)
  * [50. How can you avoid defining handlers for multiple exceptions, or what ia the best practice for handling exceptions?](#50-how-can-you-avoid-defining-handlers-for-multiple-exceptions-or-what-ia-the-best-practice-for-handling-exceptions)
  * [51. How will you validate or sanitize your input payload?](#51-how-will-you-validate-or-sanitize-your-input-payload)
  * [52. How can you populate validation error message to the end users?](#52-how-can-you-populate-validation-error-message-to-the-end-users)
  * [53. How can you define custom bean validation?](#53-how-can-you-define-custom-bean-validation)
<!-- TOC -->

# Part_5_Java_Techie - Spring Boot Interview Mastery

- https://youtu.be/FDowW7NAjmw?si=Ed25B6gdJ-Ct1HMA
- https://drive.google.com/file/d/1PGtwcSy-L13CMgcVyDR_vng-GJwcJ3Dm/view?usp=sharing

## 49. How will you handle exceptions in your project?

- We need to populate the correct error message to the end user
- Extend exception class from either -
  - RunTimeException - (unchecked)
  - Exception - (checked)
- `@RestControllerAdvice`
- `@ExceptionHandler`

- in Spring Boot 3.0+
  - no need to define custom error data class i.e define your own class to map error message
  - `ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, ex.getMassage());`

## 50. How can you avoid defining handlers for multiple exceptions, or what ia the best practice for handling exceptions?

- Wrap around in a try-catch statement and throw your own custom exception
- Handle this exception only

## 51. How will you validate or sanitize your input payload?

- dependency - `spring-boot-starter-validation`
- use annotations - `@NotNull`, `@NotEmpty`, `@NotBlank`, `@Max`, `@Min`

## 52. How can you populate validation error message to the end users?

- handler for error

## 53. How can you define custom bean validation?

- Define annotation
- Define validator
