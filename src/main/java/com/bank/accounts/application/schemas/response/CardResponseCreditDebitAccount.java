package com.bank.accounts.application.schemas.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * CardResponseCreditDebitAccount
 */

@JsonTypeName("CardResponse_creditDebitAccount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-18T07:29:52.914264900-05:00[America/Lima]")
public class CardResponseCreditDebitAccount {

    private Long debitAccountId;

    private String cardId;

    private BigDecimal amount;

    private String currency;

    private String debitAccountType;

    private Long creditAccountId;

    private BigDecimal maxAccount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate facturationDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate lastPaymentDate;

    public CardResponseCreditDebitAccount() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CardResponseCreditDebitAccount(Long debitAccountId, String cardId, BigDecimal amount, String currency, String debitAccountType, Long creditAccountId, BigDecimal maxAccount, LocalDate facturationDate, LocalDate lastPaymentDate) {
        this.debitAccountId = debitAccountId;
        this.cardId = cardId;
        this.amount = amount;
        this.currency = currency;
        this.debitAccountType = debitAccountType;
        this.creditAccountId = creditAccountId;
        this.maxAccount = maxAccount;
        this.facturationDate = facturationDate;
        this.lastPaymentDate = lastPaymentDate;
    }

    public CardResponseCreditDebitAccount debitAccountId(Long debitAccountId) {
        this.debitAccountId = debitAccountId;
        return this;
    }

    /**
     * Get debitAccountId
     *
     * @return debitAccountId
     */
    @NotNull
    @Schema(name = "debitAccountId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("debitAccountId")
    public Long getDebitAccountId() {
        return debitAccountId;
    }

    public void setDebitAccountId(Long debitAccountId) {
        this.debitAccountId = debitAccountId;
    }

    public CardResponseCreditDebitAccount cardId(String cardId) {
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
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public CardResponseCreditDebitAccount amount(BigDecimal amount) {
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

    public CardResponseCreditDebitAccount currency(String currency) {
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

    public CardResponseCreditDebitAccount debitAccountType(String debitAccountType) {
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

    public CardResponseCreditDebitAccount creditAccountId(Long creditAccountId) {
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

    public CardResponseCreditDebitAccount maxAccount(BigDecimal maxAccount) {
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

    public CardResponseCreditDebitAccount facturationDate(LocalDate facturationDate) {
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

    public CardResponseCreditDebitAccount lastPaymentDate(LocalDate lastPaymentDate) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CardResponseCreditDebitAccount cardResponseCreditDebitAccount = (CardResponseCreditDebitAccount) o;
        return Objects.equals(this.debitAccountId, cardResponseCreditDebitAccount.debitAccountId) &&
                Objects.equals(this.cardId, cardResponseCreditDebitAccount.cardId) &&
                Objects.equals(this.amount, cardResponseCreditDebitAccount.amount) &&
                Objects.equals(this.currency, cardResponseCreditDebitAccount.currency) &&
                Objects.equals(this.debitAccountType, cardResponseCreditDebitAccount.debitAccountType) &&
                Objects.equals(this.creditAccountId, cardResponseCreditDebitAccount.creditAccountId) &&
                Objects.equals(this.maxAccount, cardResponseCreditDebitAccount.maxAccount) &&
                Objects.equals(this.facturationDate, cardResponseCreditDebitAccount.facturationDate) &&
                Objects.equals(this.lastPaymentDate, cardResponseCreditDebitAccount.lastPaymentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(debitAccountId, cardId, amount, currency, debitAccountType, creditAccountId, maxAccount, facturationDate, lastPaymentDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CardResponseCreditDebitAccount {\n");
        sb.append("    debitAccountId: ").append(toIndentedString(debitAccountId)).append("\n");
        sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    debitAccountType: ").append(toIndentedString(debitAccountType)).append("\n");
        sb.append("    creditAccountId: ").append(toIndentedString(creditAccountId)).append("\n");
        sb.append("    maxAccount: ").append(toIndentedString(maxAccount)).append("\n");
        sb.append("    facturationDate: ").append(toIndentedString(facturationDate)).append("\n");
        sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
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

