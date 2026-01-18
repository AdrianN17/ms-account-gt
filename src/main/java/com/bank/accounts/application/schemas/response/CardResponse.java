package com.bank.accounts.application.schemas.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

/**
 * CardResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-18T07:29:52.914264900-05:00[America/Lima]")
public class CardResponse {

    private Long cardId;

    private String numberCard;

    private String cvc;

    private String date;

    private Long accountId;

    private String cardType;

    private CardResponseCreditDebitAccount creditDebitAccount;

    public CardResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CardResponse(Long cardId, String numberCard, String cvc, String date, Long accountId, String cardType, CardResponseCreditDebitAccount creditDebitAccount) {
        this.cardId = cardId;
        this.numberCard = numberCard;
        this.cvc = cvc;
        this.date = date;
        this.accountId = accountId;
        this.cardType = cardType;
        this.creditDebitAccount = creditDebitAccount;
    }

    public CardResponse cardId(Long cardId) {
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

    public CardResponse numberCard(String numberCard) {
        this.numberCard = numberCard;
        return this;
    }

    /**
     * Get numberCard
     *
     * @return numberCard
     */
    @NotNull
    @Pattern(regexp = "^\\d{13,19}$")
    @Schema(name = "numberCard", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("numberCard")
    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public CardResponse cvc(String cvc) {
        this.cvc = cvc;
        return this;
    }

    /**
     * Get cvc
     *
     * @return cvc
     */
    @NotNull
    @Pattern(regexp = "^\\d{3,4}$")
    @Schema(name = "cvc", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cvc")
    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public CardResponse date(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     *
     * @return date
     */
    @NotNull
    @Pattern(regexp = "^(0[1-9]|1[0-2])/\\d{2}$")
    @Schema(name = "date", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CardResponse accountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     */
    @NotNull
    @Schema(name = "accountId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("accountId")
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public CardResponse cardType(String cardType) {
        this.cardType = cardType;
        return this;
    }

    /**
     * Get cardType
     *
     * @return cardType
     */
    @NotNull
    @Pattern(regexp = "^(CREDIT|DEBIT)$")
    @Schema(name = "cardType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cardType")
    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public CardResponse creditDebitAccount(CardResponseCreditDebitAccount creditDebitAccount) {
        this.creditDebitAccount = creditDebitAccount;
        return this;
    }

    /**
     * Get creditDebitAccount
     *
     * @return creditDebitAccount
     */
    @NotNull
    @Valid
    @Schema(name = "creditDebitAccount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("creditDebitAccount")
    public CardResponseCreditDebitAccount getCreditDebitAccount() {
        return creditDebitAccount;
    }

    public void setCreditDebitAccount(CardResponseCreditDebitAccount creditDebitAccount) {
        this.creditDebitAccount = creditDebitAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CardResponse cardResponse = (CardResponse) o;
        return Objects.equals(this.cardId, cardResponse.cardId) &&
                Objects.equals(this.numberCard, cardResponse.numberCard) &&
                Objects.equals(this.cvc, cardResponse.cvc) &&
                Objects.equals(this.date, cardResponse.date) &&
                Objects.equals(this.accountId, cardResponse.accountId) &&
                Objects.equals(this.cardType, cardResponse.cardType) &&
                Objects.equals(this.creditDebitAccount, cardResponse.creditDebitAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, numberCard, cvc, date, accountId, cardType, creditDebitAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CardResponse {\n");
        sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
        sb.append("    numberCard: ").append(toIndentedString(numberCard)).append("\n");
        sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
        sb.append("    creditDebitAccount: ").append(toIndentedString(creditDebitAccount)).append("\n");
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

