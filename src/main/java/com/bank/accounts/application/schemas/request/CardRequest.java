package com.bank.accounts.application.schemas.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

/**
 * CardRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-18T07:29:52.914264900-05:00[America/Lima]")
public class CardRequest {

    private String numberCard;

    private String cvc;

    private String date;

    private String cardType;

    public CardRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CardRequest(String numberCard, String cvc, String date, String cardType) {
        this.numberCard = numberCard;
        this.cvc = cvc;
        this.date = date;
        this.cardType = cardType;
    }

    public CardRequest numberCard(String numberCard) {
        this.numberCard = numberCard;
        return this;
    }

    /**
     * Get numberCard
     *
     * @return numberCard
     */
    @NotNull
    @NotBlank
    @Pattern(regexp = "^\\d{13,19}$")
    @Schema(name = "numberCard", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("numberCard")
    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public CardRequest cvc(String cvc) {
        this.cvc = cvc;
        return this;
    }

    /**
     * Get cvc
     *
     * @return cvc
     */
    @NotNull
    @NotBlank
    @Pattern(regexp = "^\\d{3,4}$")
    @Schema(name = "cvc", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cvc")
    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public CardRequest date(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     *
     * @return date
     */
    @NotNull
    @NotBlank
    @Pattern(regexp = "^(0[1-9]|1[0-2])/\\d{2}$")
    @Schema(name = "date", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CardRequest cardType(String cardType) {
        this.cardType = cardType;
        return this;
    }

    /**
     * Get cardType
     *
     * @return cardType
     */
    @NotNull
    @NotBlank
    @Pattern(regexp = "^(CREDIT|DEBIT)$")
    @Schema(name = "cardType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cardType")
    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CardRequest cardRequest = (CardRequest) o;
        return Objects.equals(this.numberCard, cardRequest.numberCard) &&
                Objects.equals(this.cvc, cardRequest.cvc) &&
                Objects.equals(this.date, cardRequest.date) &&
                Objects.equals(this.cardType, cardRequest.cardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberCard, cvc, date, cardType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CardRequest {\n");
        sb.append("    numberCard: ").append(toIndentedString(numberCard)).append("\n");
        sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
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
