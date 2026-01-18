package com.bank.accounts.application.schemas.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * PaymentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-18T07:29:52.914264900-05:00[America/Lima]")
public class PaymentRequest {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime datePayment;

    private String typePayment;

    private BigDecimal charge;

    private Long cardId;

    private BigDecimal fee;

    private Long servicePointId;

    private String currency;

    public PaymentRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PaymentRequest(OffsetDateTime datePayment, String typePayment, BigDecimal charge, Long cardId, BigDecimal fee, Long servicePointId, String currency) {
        this.datePayment = datePayment;
        this.typePayment = typePayment;
        this.charge = charge;
        this.cardId = cardId;
        this.fee = fee;
        this.servicePointId = servicePointId;
        this.currency = currency;
    }

    public PaymentRequest datePayment(OffsetDateTime datePayment) {
        this.datePayment = datePayment;
        return this;
    }

    /**
     * Get datePayment
     *
     * @return datePayment
     */
    @NotNull
    @Valid
    @Schema(name = "datePayment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("datePayment")
    public OffsetDateTime getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(OffsetDateTime datePayment) {
        this.datePayment = datePayment;
    }

    public PaymentRequest typePayment(String typePayment) {
        this.typePayment = typePayment;
        return this;
    }

    /**
     * Get typePayment
     *
     * @return typePayment
     */
    @NotNull
    @NotBlank
    @Pattern(regexp = "^(PRODUCT|SERVICE)$")
    @Schema(name = "typePayment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("typePayment")
    public String getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(String typePayment) {
        this.typePayment = typePayment;
    }

    public PaymentRequest charge(BigDecimal charge) {
        this.charge = charge;
        return this;
    }

    /**
     * Get charge
     *
     * @return charge
     */
    @NotNull
    @Valid
    @Schema(name = "charge", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("charge")
    public BigDecimal getCharge() {
        return charge;
    }

    public void setCharge(BigDecimal charge) {
        this.charge = charge;
    }

    public PaymentRequest cardId(Long cardId) {
        this.cardId = cardId;
        return this;
    }

    /**
     * Get cardId
     *
     * @return cardId
     */
    @NotNull
    @Schema(name = "cardId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cardId")
    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public PaymentRequest fee(BigDecimal fee) {
        this.fee = fee;
        return this;
    }

    /**
     * Get fee
     *
     * @return fee
     */
    @NotNull
    @Valid
    @Schema(name = "fee", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("fee")
    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public PaymentRequest servicePointId(Long servicePointId) {
        this.servicePointId = servicePointId;
        return this;
    }

    /**
     * Get servicePointId
     *
     * @return servicePointId
     */
    @NotNull
    @Schema(name = "servicePointId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("servicePointId")
    public Long getServicePointId() {
        return servicePointId;
    }

    public void setServicePointId(Long servicePointId) {
        this.servicePointId = servicePointId;
    }

    public PaymentRequest currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     */
    @NotNull
    @NotBlank
    @Pattern(regexp = "^(PEN|USD)$")
    @Schema(name = "currency", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentRequest paymentRequest = (PaymentRequest) o;
        return Objects.equals(this.datePayment, paymentRequest.datePayment) &&
                Objects.equals(this.typePayment, paymentRequest.typePayment) &&
                Objects.equals(this.charge, paymentRequest.charge) &&
                Objects.equals(this.cardId, paymentRequest.cardId) &&
                Objects.equals(this.fee, paymentRequest.fee) &&
                Objects.equals(this.servicePointId, paymentRequest.servicePointId) &&
                Objects.equals(this.currency, paymentRequest.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datePayment, typePayment, charge, cardId, fee, servicePointId, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentRequest {\n");
        sb.append("    datePayment: ").append(toIndentedString(datePayment)).append("\n");
        sb.append("    typePayment: ").append(toIndentedString(typePayment)).append("\n");
        sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
        sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
        sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
        sb.append("    servicePointId: ").append(toIndentedString(servicePointId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
