package com.bank.accounts.application.schemas.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * TransactionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-18T07:29:52.914264900-05:00[America/Lima]")
public class TransactionResponse {

    private Long transactionId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime dateTransaction;

    private String typeTransaction;

    private String amount;

    private Long debitAccountSourceId;

    private Long debitAccountDestinyId;

    private String currency;

    public TransactionResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TransactionResponse(Long transactionId, OffsetDateTime dateTransaction, String typeTransaction, String amount, Long debitAccountSourceId, Long debitAccountDestinyId, String currency) {
        this.transactionId = transactionId;
        this.dateTransaction = dateTransaction;
        this.typeTransaction = typeTransaction;
        this.amount = amount;
        this.debitAccountSourceId = debitAccountSourceId;
        this.debitAccountDestinyId = debitAccountDestinyId;
        this.currency = currency;
    }

    public TransactionResponse transactionId(Long transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Get transactionId
     *
     * @return transactionId
     */
    @NotNull
    @Schema(name = "transactionId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("transactionId")
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionResponse dateTransaction(OffsetDateTime dateTransaction) {
        this.dateTransaction = dateTransaction;
        return this;
    }

    /**
     * Get dateTransaction
     *
     * @return dateTransaction
     */
    @NotNull
    @Valid
    @Schema(name = "dateTransaction", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dateTransaction")
    public OffsetDateTime getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(OffsetDateTime dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public TransactionResponse typeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
        return this;
    }

    /**
     * Get typeTransaction
     *
     * @return typeTransaction
     */
    @NotNull
    @Pattern(regexp = "^(DIRECTA|DIFERIDA)$")
    @Schema(name = "typeTransaction", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("typeTransaction")
    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public TransactionResponse amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @NotNull
    @Schema(name = "amount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public TransactionResponse debitAccountSourceId(Long debitAccountSourceId) {
        this.debitAccountSourceId = debitAccountSourceId;
        return this;
    }

    /**
     * Get debitAccountSourceId
     *
     * @return debitAccountSourceId
     */
    @NotNull
    @Schema(name = "debitAccountSourceId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("debitAccountSourceId")
    public Long getDebitAccountSourceId() {
        return debitAccountSourceId;
    }

    public void setDebitAccountSourceId(Long debitAccountSourceId) {
        this.debitAccountSourceId = debitAccountSourceId;
    }

    public TransactionResponse debitAccountDestinyId(Long debitAccountDestinyId) {
        this.debitAccountDestinyId = debitAccountDestinyId;
        return this;
    }

    /**
     * Get debitAccountDestinyId
     *
     * @return debitAccountDestinyId
     */
    @NotNull
    @Schema(name = "debitAccountDestinyId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("debitAccountDestinyId")
    public Long getDebitAccountDestinyId() {
        return debitAccountDestinyId;
    }

    public void setDebitAccountDestinyId(Long debitAccountDestinyId) {
        this.debitAccountDestinyId = debitAccountDestinyId;
    }

    public TransactionResponse currency(String currency) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionResponse transactionResponse = (TransactionResponse) o;
        return Objects.equals(this.transactionId, transactionResponse.transactionId) &&
                Objects.equals(this.dateTransaction, transactionResponse.dateTransaction) &&
                Objects.equals(this.typeTransaction, transactionResponse.typeTransaction) &&
                Objects.equals(this.amount, transactionResponse.amount) &&
                Objects.equals(this.debitAccountSourceId, transactionResponse.debitAccountSourceId) &&
                Objects.equals(this.debitAccountDestinyId, transactionResponse.debitAccountDestinyId) &&
                Objects.equals(this.currency, transactionResponse.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, dateTransaction, typeTransaction, amount, debitAccountSourceId, debitAccountDestinyId, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionResponse {\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    dateTransaction: ").append(toIndentedString(dateTransaction)).append("\n");
        sb.append("    typeTransaction: ").append(toIndentedString(typeTransaction)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    debitAccountSourceId: ").append(toIndentedString(debitAccountSourceId)).append("\n");
        sb.append("    debitAccountDestinyId: ").append(toIndentedString(debitAccountDestinyId)).append("\n");
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

