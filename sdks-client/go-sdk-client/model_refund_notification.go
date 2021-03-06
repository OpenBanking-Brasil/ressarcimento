/*
 * Plataforma de Ressarcimento do Open Banking Brasil
 *
 * APIs da plataforma de Ressarcimento do Open Banking Brasil para a comunicação online com a plaforma. Através da documentação das APIs abaixo é possível realizar os devidos testes de integração.
 *
 * API version: beta-0.0.1
 * Contact: suporte-ressarcimento@openbankingbrasil.org.br
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type RefundNotification struct {
	Timestamp string `json:"timestamp"`
	SessionToken string `json:"sessionToken"`
	ClientId string `json:"clientId"`
	ReceiverId string `json:"receiverId"`
	TransmitterId string `json:"transmitterId"`
	Uri string `json:"uri"`
	StatusCode int32 `json:"statusCode"`
	PayloadSize int64 `json:"payloadSize"`
	ProcessTimespan int64 `json:"processTimespan"`
}
