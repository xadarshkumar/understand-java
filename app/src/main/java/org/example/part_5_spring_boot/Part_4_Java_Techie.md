# Part_4_Java_Techie - Spring Boot Interview Mastery

- https://youtu.be/8lXV2S31pHU?si=V-C-2_Du_srs3SB4
- https://drive.google.com/file/d/1pZXXKtIw0ldPXX3ozgVbfoDXAQX4H_UM/view?usp=sharing

## 31. Have you worked on Restful Webservices? If yes, what all HTTP methods have you used in your project?



## 32. How can you specify the HTTP method type for your REST endpoint?

- `@GetMapping()`
- `@PostMapping()`
- `@PutMapping()`
- `@PatchMapping()`
- `@DeleteMapping()`
Note - parent is `@RequestMapping()`

## 33. Design REST endpoint - GET /search/{productTypes}

- Use `@PathParameter`

## 34. Design REST endpoint - GET /search?productTypes=car

- Use `@RequestParam`

## 35. Difference between `@PathVariable` & `@RequestParam`



## 36. Why `@RestController` not `@Controller`



## 37. How can we deserialize a JSON JSON request payload into an object within a Spring MVC controller?



## 38. Can we perform update operation in POST method? If yes, why do we need PUT method?



## 39. Can we pass RequestBody in GET method?

- Technically - yes! It's not a recommended practice.

## 40. How can we perform content negotiation (XML/JSON) in Rest endpoint? (endpoint returning different MediaType)



## 41. What all status codes you've observed?



## 42. Customize status code for your endpoint?



## 43. How can you enable cross origin?



## 44. How can you upload a file in Spring?



## 45. How do you maintain versioning of your REST API?

Ensure backward compatibility
- Define version in path uri
  - `@PostMapping("/v1/bookNow")`
  - `@PostMapping("/v2/bookNow")`
- Define request parameter
  - `@RequestParam(name="version") int version`
- Define header parameter
  - `@RequestHeader(name="Api-version") int version`

## 46. How will you document your REST API?

- Swagger <-> OpenAPI

- Add dependency
  - `springdoc-openapi-starter-webmvc-ui`
- access at
  - `localhost:8000/swagger-ui/index.html`
  - `localhost:8000/api-docs`

## 47. How can you hide certain RESt endpoints to prevent them from being exposed externally?

- `@Hidden`

## 48. How will you consume restful API?
- RestTemplate
- FeignClient
- WebClient
- AdvanceRestClient