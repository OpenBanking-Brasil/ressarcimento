/*
 * Plataforma de Ressarcimento do Open Banking Brasil
 * APIs da plataforma de Ressarcimento do Open Banking Brasil para a comunicação online com a plaforma. Através da documentação das APIs abaixo é possível realizar os devidos testes de integração.
 *
 * OpenAPI spec version: beta-0.0.1
 * Contact: suporte-ressarcimento@openbankingbrasil.org.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.27
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from "../ApiClient";
import {RefundNotification} from '../model/RefundNotification';
import {RefundProcess} from '../model/RefundProcess';

/**
* RefundAPIV1 service.
* @module api/RefundAPIV1Api
* @version beta-0.0.1
*/
export class RefundAPIV1Api {

    /**
    * Constructs a new RefundAPIV1Api. 
    * @alias module:api/RefundAPIV1Api
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the findNotificationById operation.
     * @callback moduleapi/RefundAPIV1Api~findNotificationByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RefundProcess{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Operação de consulta de processos de transações
     * Método da API de Consulta de processos de transações de APIs do Open Banking Brasil. O sistema utilizará essas informações para consultar processos que podem ter uma ou mais transações dentro da plataformas dos participantes. &lt;br&gt; Para a utilização deste método é necessário gerar um Token de Acesso na plataforma central do Diretório do Open Banking Brasil.
     * @param {String} processId 
     * @param {module:api/RefundAPIV1Api~findNotificationByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    findNotificationById(processId, callback) {
      
      let postBody = null;
      // verify the required parameter 'processId' is set
      if (processId === undefined || processId === null) {
        throw new Error("Missing the required parameter 'processId' when calling findNotificationById");
      }

      let pathParams = {
        'processId': processId
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = RefundProcess;

      return this.apiClient.callApi(
        '/apis/v1/refund/notifications/{processId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the healthcheck operation.
     * @callback moduleapi/RefundAPIV1Api~healthcheckCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RefundProcess{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Operação de consulta de monitoramento de processos de transações
     * Método da API de Consulta de Monitoramento de processos de transações para verificar o status das APIs do Open Banking Brasil.O sistema utilizará essas informações para monitorar os processos e transações dentro das plataformas dos participantes. &lt;br&gt; Para a utilização deste método é necessário gerar um Token de Acesso na plataforma central do Diretório do Open Banking Brasil.
     * @param {module:api/RefundAPIV1Api~healthcheckCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    healthcheck(callback) {
      
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = RefundProcess;

      return this.apiClient.callApi(
        '/apis/v1/refund/notifications/healthcheck', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the notification operation.
     * @callback moduleapi/RefundAPIV1Api~notificationCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RefundProcess{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Operação de registro unitário de transação 
     * Método da API de Reporte unitário de consumo de APIs do Open Banking Brasil. O sistema utilizará essas informações para conciliar e contabilizar os custos das plataformas dos participantes. &lt;br&gt; Para a utilização deste método é necessário gerar um Token de Acesso na plataforma central do Diretório do Open Banking Brasil.
     * @param {module:model/RefundNotification} body 
     * @param {module:api/RefundAPIV1Api~notificationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    notification(body, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling notification");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = RefundProcess;

      return this.apiClient.callApi(
        '/apis/v1/refund/notifications/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the notifications operation.
     * @callback moduleapi/RefundAPIV1Api~notificationsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RefundProcess{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Operação de registro em massa de uma transação
     * Método da API de Reporte de atualização em massa de APIs do Open Banking Brasil. O sistema utilizará essas informações para conciliar e contabilizar os custos das plataformas dos participantes. &lt;br&gt; Para a utilização deste método é necessário gerar um Token de Acesso na plataforma central do Diretório do Open Banking Brasil.
     * @param {Array.<module:model/RefundNotification>} body 
     * @param {module:api/RefundAPIV1Api~notificationsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    notifications(body, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling notifications");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = RefundProcess;

      return this.apiClient.callApi(
        '/apis/v1/refund/notifications/', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}