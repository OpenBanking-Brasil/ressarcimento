# Java SDK Client - Plataforma de Ressarcimento do Open Banking Brasil

Plataforma de Ressarcimento do Open Banking Brasil
- API version: beta-0.0.1
  - Build date: 2021-07-01T00:17:59.641Z[GMT]

APIs da plataforma de Ressarcimento do Open Banking Brasil para a comunicação online com a plaforma. Através da documentação das APIs abaixo é possível realizar os devidos testes de integração.

  For more information, please visit [http://suporte.ressarcimento.openbankingbrasil.org.br](http://suporte.ressarcimento.openbankingbrasil.org.br)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RefundApiV1Api;

import java.io.File;
import java.util.*;

public class RefundApiV1ApiExample {

    public static void main(String[] args) {
        
        RefundApiV1Api apiInstance = new RefundApiV1Api();
        String processId = "processId_example"; // String | 
        try {
            RefundProcess result = apiInstance.findNotificationById(processId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefundApiV1Api#findNotificationById");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RefundApiV1Api;

import java.io.File;
import java.util.*;

public class RefundApiV1ApiExample {

    public static void main(String[] args) {
        
        RefundApiV1Api apiInstance = new RefundApiV1Api();
        try {
            RefundProcess result = apiInstance.healthcheck();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefundApiV1Api#healthcheck");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RefundApiV1Api;

import java.io.File;
import java.util.*;

public class RefundApiV1ApiExample {

    public static void main(String[] args) {
        
        RefundApiV1Api apiInstance = new RefundApiV1Api();
        RefundNotification body = new RefundNotification(); // RefundNotification | 
        try {
            RefundProcess result = apiInstance.notification(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefundApiV1Api#notification");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RefundApiV1Api;

import java.io.File;
import java.util.*;

public class RefundApiV1ApiExample {

    public static void main(String[] args) {
        
        RefundApiV1Api apiInstance = new RefundApiV1Api();
        List<RefundNotification> body = Arrays.asList(new RefundNotification()); // List<RefundNotification> | 
        try {
            RefundProcess result = apiInstance.notifications(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefundApiV1Api#notifications");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://ressarcimento.opbkdev.smartfylabs.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*RefundApiV1Api* | [**findNotificationById**](docs/RefundApiV1Api.md#findNotificationById) | **GET** /apis/v1/refund/notifications/{processId} | Operação de consulta de processos de transações
*RefundApiV1Api* | [**healthcheck**](docs/RefundApiV1Api.md#healthcheck) | **GET** /apis/v1/refund/notifications/healthcheck | Operação de consulta de monitoramento de processos de transações
*RefundApiV1Api* | [**notification**](docs/RefundApiV1Api.md#notification) | **POST** /apis/v1/refund/notifications/ | Operação de registro unitário de transação 
*RefundApiV1Api* | [**notifications**](docs/RefundApiV1Api.md#notifications) | **PATCH** /apis/v1/refund/notifications/ | Operação de registro em massa de uma transação

## Documentation for Models

 - [RefundNotification](docs/RefundNotification.md)
 - [RefundProcess](docs/RefundProcess.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

suporte-ressarcimento@openbankingbrasil.org.br
