# Go SDK Client - Plataforma de Ressarcimento do Open Banking Brasil

APIs da plataforma de Ressarcimento do Open Banking Brasil para a comunicação online com a plaforma. Através da documentação das APIs abaixo é possível realizar os devidos testes de integração.

## Overview
This API client was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  By using the [swagger-spec](https://github.com/swagger-api/swagger-spec) from a remote server, you can easily generate an API client.

- API version: beta-0.0.1
- Package version: 1.0.0
- Build package: io.swagger.codegen.v3.generators.go.GoClientCodegen
For more information, please visit [http://suporte.ressarcimento.openbankingbrasil.org.br](http://suporte.ressarcimento.openbankingbrasil.org.br)

## Installation
Put the package under your project folder and add the following in import:
```golang
import "./swagger"
```

## Documentation for API Endpoints

All URIs are relative to *https://ressarcimento.opbkdev.smartfylabs.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*RefundAPIV1Api* | [**FindNotificationById**](docs/RefundAPIV1Api.md#findnotificationbyid) | **Get** /apis/v1/refund/notifications/{processId} | Operação de consulta de processos de transações
*RefundAPIV1Api* | [**Healthcheck**](docs/RefundAPIV1Api.md#healthcheck) | **Get** /apis/v1/refund/notifications/healthcheck | Operação de consulta de monitoramento de processos de transações
*RefundAPIV1Api* | [**Notification**](docs/RefundAPIV1Api.md#notification) | **Post** /apis/v1/refund/notifications/ | Operação de registro unitário de transação 
*RefundAPIV1Api* | [**Notifications**](docs/RefundAPIV1Api.md#notifications) | **Patch** /apis/v1/refund/notifications/ | Operação de registro em massa de uma transação

## Documentation For Models

 - [RefundNotification](docs/RefundNotification.md)
 - [RefundProcess](docs/RefundProcess.md)

## Documentation For Authorization
 Endpoints do not require authorization.


## Author

suporte-ressarcimento@openbankingbrasil.org.br
