# core-interfaces-java
This project contains the abstract layer for APIMatic's core-lib and Apimatic's JAVA SDK. 

## Interfaces
| Name                                                                    | Description                                                        |
|-------------------------------------------------------------------------|--------------------------------------------------------------------|
| [`Context`](/src/main/java/io/apimatic/core_interfaces/http/Context.java)                     | To save both Request and Response after the completion of response |
| [`HttpCallback`](src\main\java\io\apimatic\core_interfaces\http\HttpCallback.java)                     | To perform action before Request and after the completion of response |
| [`HttpClient`](src\main\java\io\apimatic\core_interfaces\http\HttpClient.java)                     | To provide abstraction to execute API call in HttpClient |
| [`HttpHeaders`](src\main\java\io\apimatic\core_interfaces\http\HttpHeaders.java)                     | To save additional information about the request and response |
| [`ClientConfiguration`](src\main\java\io\apimatic\core_interfaces\http\ClientConfiguration.java)                     | To hold the default configurations for HttpClient |
| [`Authentication`](src\main\java\io\apimatic\core_interfaces\authentication\Authentication.java)            | To Provide abstraction for all Authentications                        |
| [`Request`](src\main\java\io\apimatic\core_interfaces\http\request\Request.java)             | To get the properties from the instance of Request                 |
| [`Multipart`](src\main\java\io\apimatic\core_interfaces\http\request\Multipart.java) | To wrap byteArray and headers to be sent as part of a multipart request                              |
| [`MultipartFile`](src\main\java\io\apimatic\core_interfaces\http\request\MultipartFile.java) | To wrap file and headers to be sent as part of a multipart request                                  |
| [`EndpointSetting`](src\main\java\io\apimatic\core_interfaces\http\request\configuration/EndpointSetting.java)                 | To Provide endpoint level setting      |
| [`Response`](src\main\java\io\apimatic\core_interfaces\http\response\Response.java)          | To get the properties from the instance of Response                |
| [`DynamicType`](src\main\java\io\apimatic\core_interfaces\http\response\DynamicType.java)          | To get the properties from the instance of Dynamic Response Type                |
| [`ApiResponseType`](src\main\java\io\apimatic\core_interfaces\http\response\ApiResponseType.java)          | To get the properties from the instance of ApiResponseType                |
| [`CompatibilityFactory`](src\main\java\io\apimatic\core_interfaces\compatibility\CompatibilityFactory.java)                  | Holds required converter methods to create SDK classes             |
| [`FileWrapper`](src\main\java\io\apimatic\core_interfaces\type\FileWrapper.java)                  | To wrap file and contentType to be sent as part of a HTTP request.            |
| [`HttpApiException`](src\main\java\io\apimatic\core_interfaces\type\HttpApiException.java)                  | Default interface for all the exception models in SDK              |
| [`Deserializer`](src\main\java\io\apimatic\core_interfaces\type\functional\Deserializer.java)                  | Functional interface to  apply the deserialization function           |
| [`ExceptionCreator`](src\main\java\io\apimatic\core_interfaces\type\functional\ExceptionCreator.java)                  | Functional interface to  create the SDK exception             |
| [`Serializer`](src\main\java\io\apimatic\core_interfaces\type\functional\Serializer.java)                  | Functional interface to  apply the serialization function              |

## Enumerations
| Name                                                                          | Description                                                     |
|-------------------------------------------------------------------------------|-----------------------------------------------------------------|
| [`Method`](src\main\java\io\apimatic\core_interfaces\http\Method.java)                         | Enumeration for all possible types of requests                  |
| [`HttpMethodType`](src\main\java\io\apimatic\core_interfaces\http\HttpMethodType.java)                                               | HTTP methods enumeration. |
| [`RetryOption`](src\main\java\io\apimatic\core_interfaces\http\request\configuration/RetryOption.java)                                     | Enumeration for RetryingOption of each API call                 |
| [`ArraySerializationFormat`](src\main\java\io\apimatic\core_interfaces\http\request\ArraySerializationFormat.java)                                     | Enumeration  for all ArraySerialization formats       |
| [`MutliPartRequestType`](src\main\java\io\apimatic\core_interfaces\http\request\MutliPartRequestType.java)                                     | Enumeration for multipart request       |
| [`ResponseClassType`](src\main\java\io\apimatic\core_interfaces\http\request\ResponseClassType.java)                                     | Enumeration for Response class type    |

