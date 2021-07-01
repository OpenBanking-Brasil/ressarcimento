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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RefundNotification
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-01T00:17:59.641Z[GMT]")
public class RefundNotification {
  @SerializedName("timestamp")
  private String timestamp = null;

  @SerializedName("sessionToken")
  private String sessionToken = null;

  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("receiverId")
  private String receiverId = null;

  @SerializedName("transmitterId")
  private String transmitterId = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("payloadSize")
  private Long payloadSize = null;

  @SerializedName("processTimespan")
  private Long processTimespan = null;

  public RefundNotification timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(required = true, description = "")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public RefundNotification sessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

   /**
   * Get sessionToken
   * @return sessionToken
  **/
  @Schema(required = true, description = "")
  public String getSessionToken() {
    return sessionToken;
  }

  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }

  public RefundNotification clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(required = true, description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public RefundNotification receiverId(String receiverId) {
    this.receiverId = receiverId;
    return this;
  }

   /**
   * Get receiverId
   * @return receiverId
  **/
  @Schema(required = true, description = "")
  public String getReceiverId() {
    return receiverId;
  }

  public void setReceiverId(String receiverId) {
    this.receiverId = receiverId;
  }

  public RefundNotification transmitterId(String transmitterId) {
    this.transmitterId = transmitterId;
    return this;
  }

   /**
   * Get transmitterId
   * @return transmitterId
  **/
  @Schema(required = true, description = "")
  public String getTransmitterId() {
    return transmitterId;
  }

  public void setTransmitterId(String transmitterId) {
    this.transmitterId = transmitterId;
  }

  public RefundNotification uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @Schema(required = true, description = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public RefundNotification statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @Schema(required = true, description = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public RefundNotification payloadSize(Long payloadSize) {
    this.payloadSize = payloadSize;
    return this;
  }

   /**
   * Get payloadSize
   * @return payloadSize
  **/
  @Schema(required = true, description = "")
  public Long getPayloadSize() {
    return payloadSize;
  }

  public void setPayloadSize(Long payloadSize) {
    this.payloadSize = payloadSize;
  }

  public RefundNotification processTimespan(Long processTimespan) {
    this.processTimespan = processTimespan;
    return this;
  }

   /**
   * Get processTimespan
   * @return processTimespan
  **/
  @Schema(required = true, description = "")
  public Long getProcessTimespan() {
    return processTimespan;
  }

  public void setProcessTimespan(Long processTimespan) {
    this.processTimespan = processTimespan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundNotification refundNotification = (RefundNotification) o;
    return Objects.equals(this.timestamp, refundNotification.timestamp) &&
        Objects.equals(this.sessionToken, refundNotification.sessionToken) &&
        Objects.equals(this.clientId, refundNotification.clientId) &&
        Objects.equals(this.receiverId, refundNotification.receiverId) &&
        Objects.equals(this.transmitterId, refundNotification.transmitterId) &&
        Objects.equals(this.uri, refundNotification.uri) &&
        Objects.equals(this.statusCode, refundNotification.statusCode) &&
        Objects.equals(this.payloadSize, refundNotification.payloadSize) &&
        Objects.equals(this.processTimespan, refundNotification.processTimespan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, sessionToken, clientId, receiverId, transmitterId, uri, statusCode, payloadSize, processTimespan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundNotification {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    receiverId: ").append(toIndentedString(receiverId)).append("\n");
    sb.append("    transmitterId: ").append(toIndentedString(transmitterId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    payloadSize: ").append(toIndentedString(payloadSize)).append("\n");
    sb.append("    processTimespan: ").append(toIndentedString(processTimespan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
