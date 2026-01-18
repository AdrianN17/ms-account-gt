package com.bank.accounts.application.schemas.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * DebitAccountRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-18T07:29:52.914264900-05:00[America/Lima]")
public class DebitAccountRequest {

    private BigDecimal amount;

    private String currency;

    private String debitAccountType;

    public DebitAccountRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DebitAccountRequest(BigDecimal amount, String currency, String debitAccountType) {
        this.amount = amount;
        this.currency = currency;
        this.debitAccountType = debitAccountType;
    }

    public DebitAccountRequest amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @NotNull
    @Valid
    @Schema(name = "amount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("amount")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public DebitAccountRequest currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     */
    @NotNull
    @Pattern(regexp = "^(PEN|USD)$")
    @Schema(name = "currency", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public DebitAccountRequest debitAccountType(String debitAccountType) {
        this.debitAccountType = debitAccountType;
        return this;
    }

    /**
     * Get debitAccountType
     *
     * @return debitAccountType
     */
    @NotNull
    @Pattern(regexp = "^(AHORROS|CORRIENTE)$")
    @Schema(name = "debitAccountType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("debitAccountType")
    public String getDebitAccountType() {
        return debitAccountType;
    }

    public void setDebitAccountType(String debitAccountType) {
        this.debitAccountType = debitAccountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DebitAccountRequest debitAccountRequest = (DebitAccountRequest) o;
        return Objects.equals(this.amount, debitAccountRequest.amount) &&
                Objects.equals(this.currency, debitAccountRequest.currency) &&
                Objects.equals(this.debitAccountType, debitAccountRequest.debitAccountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, debitAccountType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebitAccountRequest {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    debitAccountType: ").append(toIndentedString(debitAccountType)).append("\n");
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

