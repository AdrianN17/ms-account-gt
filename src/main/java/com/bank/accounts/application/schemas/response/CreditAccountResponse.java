package com.bank.accounts.application.schemas.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * CreditAccountResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-18T07:29:52.914264900-05:00[America/Lima]")
public class CreditAccountResponse {

    private Long creditAccountId;

    private BigDecimal amount;

    private BigDecimal maxAccount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate facturationDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate lastPaymentDate;

    private String currency;

    public CreditAccountResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CreditAccountResponse(Long creditAccountId, BigDecimal amount, BigDecimal maxAccount, LocalDate facturationDate, LocalDate lastPaymentDate, String currency) {
        this.creditAccountId = creditAccountId;
        this.amount = amount;
        this.maxAccount = maxAccount;
        this.facturationDate = facturationDate;
        this.lastPaymentDate = lastPaymentDate;
        this.currency = currency;
    }

    public CreditAccountResponse creditAccountId(Long creditAccountId) {
        this.creditAccountId = creditAccountId;
        return this;
    }

    /**
     * Get creditAccountId
     *
     * @return creditAccountId
     */
    @NotNull
    @Schema(name = "creditAccountId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("creditAccountId")
    public Long getCreditAccountId() {
        return creditAccountId;
    }

    public void setCreditAccountId(Long creditAccountId) {
        this.creditAccountId = creditAccountId;
    }

    public CreditAccountResponse amount(BigDecimal amount) {
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

    public CreditAccountResponse maxAccount(BigDecimal maxAccount) {
        this.maxAccount = maxAccount;
        return this;
    }

    /**
     * Get maxAccount
     *
     * @return maxAccount
     */
    @NotNull
    @Valid
    @Schema(name = "maxAccount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("maxAccount")
    public BigDecimal getMaxAccount() {
        return maxAccount;
    }

    public void setMaxAccount(BigDecimal maxAccount) {
        this.maxAccount = maxAccount;
    }

    public CreditAccountResponse facturationDate(LocalDate facturationDate) {
        this.facturationDate = facturationDate;
        return this;
    }

    /**
     * Get facturationDate
     *
     * @return facturationDate
     */
    @NotNull
    @Valid
    @Schema(name = "facturationDate", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("facturationDate")
    public LocalDate getFacturationDate() {
        return facturationDate;
    }

    public void setFacturationDate(LocalDate facturationDate) {
        this.facturationDate = facturationDate;
    }

    public CreditAccountResponse lastPaymentDate(LocalDate lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
        return this;
    }

    /**
     * Get lastPaymentDate
     *
     * @return lastPaymentDate
     */
    @NotNull
    @Valid
    @Schema(name = "lastPaymentDate", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("lastPaymentDate")
    public LocalDate getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(LocalDate lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public CreditAccountResponse currency(String currency) {
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
        CreditAccountResponse creditAccountResponse = (CreditAccountResponse) o;
        return Objects.equals(this.creditAccountId, creditAccountResponse.creditAccountId) &&
                Objects.equals(this.amount, creditAccountResponse.amount) &&
                Objects.equals(this.maxAccount, creditAccountResponse.maxAccount) &&
                Objects.equals(this.facturationDate, creditAccountResponse.facturationDate) &&
                Objects.equals(this.lastPaymentDate, creditAccountResponse.lastPaymentDate) &&
                Objects.equals(this.currency, creditAccountResponse.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditAccountId, amount, maxAccount, facturationDate, lastPaymentDate, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreditAccountResponse {\n");
        sb.append("    creditAccountId: ").append(toIndentedString(creditAccountId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    maxAccount: ").append(toIndentedString(maxAccount)).append("\n");
        sb.append("    facturationDate: ").append(toIndentedString(facturationDate)).append("\n");
        sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
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

