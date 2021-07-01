/*
 * Plataforma de Ressarcimento do Open Banking Brasil
 * APIs da plataforma de Ressarcimento do Open Banking Brasil para a comunicação online com a plaforma. Através da documentação das APIs abaixo é possível realizar os devidos testes de integração.
 *
 * OpenAPI spec version: beta-0.0.1
 * Contact: suporte-ressarcimento@openbankingbrasil.org.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.auth;

import io.swagger.client.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
