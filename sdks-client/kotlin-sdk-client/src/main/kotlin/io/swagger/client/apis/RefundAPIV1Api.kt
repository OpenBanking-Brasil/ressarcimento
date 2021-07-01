/**
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
package io.swagger.client.apis

import io.swagger.client.models.RefundNotification
import io.swagger.client.models.RefundProcess

import io.swagger.client.infrastructure.*

class RefundAPIV1Api(basePath: kotlin.String = "https://ressarcimento.opbkdev.smartfylabs.com") : ApiClient(basePath) {

    /**
     * Operação de consulta de processos de transações
     * Método da API de Consulta de processos de transações de APIs do Open Banking Brasil. O sistema utilizará essas informações para consultar processos que podem ter uma ou mais transações dentro da plataformas dos participantes. &lt;br&gt; Para a utilização deste método é necessário gerar um Token de Acesso na plataforma central do Diretório do Open Banking Brasil.
     * @param processId  
     * @return RefundProcess
     */
    @Suppress("UNCHECKED_CAST")
    fun findNotificationById(processId: kotlin.String): RefundProcess {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/apis/v1/refund/notifications/{processId}".replace("{" + "processId" + "}", "$processId")
        )
        val response = request<RefundProcess>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as RefundProcess
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Operação de consulta de monitoramento de processos de transações
     * Método da API de Consulta de Monitoramento de processos de transações para verificar o status das APIs do Open Banking Brasil.O sistema utilizará essas informações para monitorar os processos e transações dentro das plataformas dos participantes. &lt;br&gt; Para a utilização deste método é necessário gerar um Token de Acesso na plataforma central do Diretório do Open Banking Brasil.
     * @return RefundProcess
     */
    @Suppress("UNCHECKED_CAST")
    fun healthcheck(): RefundProcess {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/apis/v1/refund/notifications/healthcheck"
        )
        val response = request<RefundProcess>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as RefundProcess
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Operação de registro unitário de transação 
     * Método da API de Reporte unitário de consumo de APIs do Open Banking Brasil. O sistema utilizará essas informações para conciliar e contabilizar os custos das plataformas dos participantes. &lt;br&gt; Para a utilização deste método é necessário gerar um Token de Acesso na plataforma central do Diretório do Open Banking Brasil.
     * @param body  
     * @return RefundProcess
     */
    @Suppress("UNCHECKED_CAST")
    fun notification(body: RefundNotification): RefundProcess {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/apis/v1/refund/notifications/"
        )
        val response = request<RefundProcess>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as RefundProcess
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Operação de registro em massa de uma transação
     * Método da API de Reporte de atualização em massa de APIs do Open Banking Brasil. O sistema utilizará essas informações para conciliar e contabilizar os custos das plataformas dos participantes. &lt;br&gt; Para a utilização deste método é necessário gerar um Token de Acesso na plataforma central do Diretório do Open Banking Brasil.
     * @param body  
     * @return RefundProcess
     */
    @Suppress("UNCHECKED_CAST")
    fun notifications(body: kotlin.Array<RefundNotification>): RefundProcess {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.PATCH,
                "/apis/v1/refund/notifications/"
        )
        val response = request<RefundProcess>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as RefundProcess
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}