# APIMatic JAVA Core Library Interfaces
[![Maven Central][maven-badge]][maven-url]
[![Tests][test-badge]][test-url]
[![Lint Code][lint-badge]][lint-url]
[![Maintainability][maintainability-url]][code-climate-url]
[![Licence][license-badge]][license-url]
## Introduction
This project contains the abstract layer for APIMatic's core library and Apimatic's JAVA SDK. 

## Prerequisites
* The JRE flavor requires `JDK 1.8`.
## Install the maven package
Core Interfaces's Maven group ID is `io.apimatic`, and its artifact ID is `core-interfaces`.

## Interfaces
| Name                                                                    | Description                                                        |
|-------------------------------------------------------------------------|--------------------------------------------------------------------|
| [`Context`](./src/main/java/io/apimatic/coreinterfaces/http/Context.java)                     | To save both Request and Response after the completion of response |
| [`Callback`](./src/main/java/io/apimatic/coreinterfaces/http/Callback.java)                     | To perform action before Request and after the completion of response |
| [`HttpClient`](./src/main/java/io/apimatic/coreinterfaces/http/HttpClient.java)                     | To provide abstraction to execute API call in HttpClient |
| [`HttpHeaders`](./src/main/java/io/apimatic/coreinterfaces/http/HttpHeaders.java)                     | To save additional information about the request and response |
| [`ClientConfiguration`](./src/main/java/io/apimatic/coreinterfaces/http/ClientConfiguration.java)                     | To hold the default configurations for HttpClient |
| [`Authentication`](./src/main/java/io/apimatic/coreinterfaces/authentication/Authentication.java)            | To Provide abstraction for all Authentications                        |
| [`Request`](./src/main/java/io/apimatic/coreinterfaces/http/request/Request.java)             |  To create and manage HTTP Requests                 |
| [`Multipart`](./src/main/java/io/apimatic/coreinterfaces/http/request/Multipart.java) | To wrap byteArray and headers to be sent as part of a multipart request                              |
| [`MultipartFile`](./src/main/java/io/apimatic/coreinterfaces/http/request/MultipartFile.java) | To wrap file and headers to be sent as part of a multipart request                                  |
| [`CoreEndpointConfiguration`](./src/main/java/io/apimatic/coreinterfaces/http/request/configuration/CoreEndpointConfiguration.java)                 | To Provide endpoint level configuration      |
| [`Response`](./src/main/java/io/apimatic/coreinterfaces/http/response/Response.java)          | To get the properties from the instance of Response                |
| [`DynamicType`](./src/main/java/io/apimatic/coreinterfaces/http/response/DynamicType.java)          | To get the properties from the instance of Dynamic Response Type                |
| [`ApiResponseType`](./src/main/java/io/apimatic/coreinterfaces/http/response/ApiResponseType.java)          | To get the properties from the instance of ApiResponseType                |
| [`CompatibilityFactory`](./src/main/java/io/apimatic/coreinterfaces/compatibility\CompatibilityFactory.java)                  | Holds required converter methods to create SDK classes             |
| [`CoreFileWrapper`](./src/main/java/io/apimatic/coreinterfaces/type/CoreFileWrapper.java)                  | To wrap file and contentType to be sent as part of a HTTP request.            |
| [`HttpApiException`](./src/main/java/io/apimatic/coreinterfaces/type/HttpApiException.java)                  | Default interface for all the exception models in SDK              |
| [`ApiLogger`](./src/main/java/io/apimatic/coreinterfaces/logger/ApiLogger.java)                  | Interface for Loggin Api Calls.              |
| [`Logger`](./src/main/java/io/apimatic/coreinterfaces/logger/Logger.java)                  | Interface for logging at different levels.              |
| [`ReadonlyLoggingConfiguration`](./src/main/java/io/apimatic/coreinterfaces/logger/configuration/ReadonlyLoggingConfiguration.java)                  | To hold logging configuration              |
| [`ReadonlyLogOptions`](./src/main/java/io/apimatic/coreinterfaces/logger/configuration/ReadonlyLogOptions.java)                  | To hold base options for logging configuration              |
| [`ReadonlyRequestLogging`](./src/main/java/io/apimatic/coreinterfaces/logger/configuration/ReadonlyRequestLogging.java)                  | To hold Request options for logging configuration              |
| [`ReadonlyResponseLogging`](./src/main/java/io/apimatic/coreinterfaces/logger/configuration/ReadonlyResponseLogging.java)                  | To hold Response options for logging configuration              |
| [`Deserializer`](./src/main/java/io/apimatic/coreinterfaces/type/functional/Deserializer.java)                  | Functional interface to  apply the deserialization function           |
| [`ExceptionCreator`](./src/main/java/io/apimatic/coreinterfaces/type/functional/ExceptionCreator.java)                  | Functional interface to  create the SDK exception             |
| [`Serializer`](./src/main/java/io/apimatic/coreinterfaces/type/functional/Serializer.java)                  | Functional interface to  apply the serialization function              |
| [`ContextInitializer`](./src/main/java/io/apimatic/coreinterfaces/type/functional/ContextInitializer.java)                  | Functional Interface to apply the context initialization function for the response models             |

## Enumerations
| Name                                                                          | Description                                                     |
|-------------------------------------------------------------------------------|-----------------------------------------------------------------|
| [`Method`](./src/main/java/io/apimatic/coreinterfaces/http/Method.java)                         | Enumeration for all possible types of requests                  |
| [`HttpMethodType`](./src/main/java/io/apimatic/coreinterfaces/http/HttpMethodType.java)                                               | HTTP methods enumeration. |
| [`RetryOption`](./src/main/java/io/apimatic/coreinterfaces/http/request/configuration/RetryOption.java)                                     | Enumeration for RetryingOption of each API call                 |
| [`ArraySerializationFormat`](./src/main/java/io/apimatic/coreinterfaces/http/request/ArraySerializationFormat.java)                                     | Enumeration  for all ArraySerialization formats       |
| [`MutliPartRequestType`](./src/main/java/io/apimatic/coreinterfaces/http/request/MutliPartRequestType.java)                                     | Enumeration for multipart request       |
| [`ResponseClassType`](./src/main/java/io/apimatic/coreinterfaces/http/request/ResponseClassType.java)                                     | Enumeration for Response class type    |
| [`HeaderLoggingPolicyLevel`](./src/main/java/io/apimatic/coreinterfaces/http/HeaderLoggingPolicyLevel.java)                     | Enumeration of Header Logging ploicy  |
| [`LoggingLevel`](./src/main/java/io/apimatic/coreinterfaces/http/LoggingLevel.java)                     | Enumeration of all the possible Logging Level  |
| [`LoggingLevelType`](./src/main/java/io/apimatic/coreinterfaces/http/LoggingLevelType.java)                     | Enumeration of Logging Level  |

[license-badge]: https://img.shields.io/badge/licence-MIT-blue
[license-url]: LICENSE
[maven-badge]: https://img.shields.io/maven-central/v/io.apimatic/core-interfaces?color=green
[maven-url]: https://central.sonatype.dev/artifact/io.apimatic/core-interfaces/0.1.1
[test-badge]: https://github.com/apimatic/core-interfaces-java/actions/workflows/build-and-test.yml/badge.svg
[test-url]: https://github.com/apimatic/core-interfaces-java/actions/workflows/build-and-test.yml
[code-climate-url]: https://codeclimate.com/github/apimatic/core-interfaces-java
[maintainability-url]: https://api.codeclimate.com/v1/badges/71332f9af318d309c3dc/maintainability
[lint-badge]: https://github.com/apimatic/core-interfaces-java/actions/workflows/linter.yml/badge.svg
[lint-url]: https://github.com/apimatic/core-interfaces-java/actions/workflows/linter.yml

