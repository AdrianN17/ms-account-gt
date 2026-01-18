package com.bank.accounts.application.schemas.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AccountResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-18T07:29:52.914264900-05:00[America/Lima]")
public class AccountResponse {

    private Long accountId;

    private String documentType;

    private String documentNumber;

    private String phone;

    private String email;

    private String names;

    private String lastNames;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;

    @Valid
    private List<@Valid CardResponse> cards = new ArrayList<>();

    public AccountResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public AccountResponse(Long accountId, String documentType, String documentNumber, String phone, String email, String names, String lastNames, LocalDate dateOfBirth, List<@Valid CardResponse> cards) {
        this.accountId = accountId;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.phone = phone;
        this.email = email;
        this.names = names;
        this.lastNames = lastNames;
        this.dateOfBirth = dateOfBirth;
        this.cards = cards;
    }

    public AccountResponse accountId(Long accountId) {
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

    public AccountResponse documentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * Get documentType
     *
     * @return documentType
     */
    @NotNull
    @Pattern(regexp = "^(DNI|CE|PS|RUC)$")
    @Schema(name = "documentType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("documentType")
    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public AccountResponse documentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Get documentNumber
     *
     * @return documentNumber
     */
    @NotNull
    @Schema(name = "documentNumber", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public AccountResponse phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get phone
     *
     * @return phone
     */
    @NotNull
    @Pattern(regexp = "^9\\d{8}$")
    @Schema(name = "phone", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AccountResponse email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     */
    @NotNull
    @Email
    @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AccountResponse names(String names) {
        this.names = names;
        return this;
    }

    /**
     * Get names
     *
     * @return names
     */
    @NotNull
    @Schema(name = "names", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("names")
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public AccountResponse lastNames(String lastNames) {
        this.lastNames = lastNames;
        return this;
    }

    /**
     * Get lastNames
     *
     * @return lastNames
     */
    @NotNull
    @Schema(name = "lastNames", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("lastNames")
    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public AccountResponse dateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * Get dateOfBirth
     *
     * @return dateOfBirth
     */
    @NotNull
    @Valid
    @Schema(name = "dateOfBirth", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public AccountResponse cards(List<@Valid CardResponse> cards) {
        this.cards = cards;
        return this;
    }

    public AccountResponse addCardsItem(CardResponse cardsItem) {
        if (this.cards == null) {
            this.cards = new ArrayList<>();
        }
        this.cards.add(cardsItem);
        return this;
    }

    /**
     * Get cards
     *
     * @return cards
     */
    @NotNull
    @Valid
    @Schema(name = "cards", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cards")
    public List<@Valid CardResponse> getCards() {
        return cards;
    }

    public void setCards(List<@Valid CardResponse> cards) {
        this.cards = cards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountResponse accountResponse = (AccountResponse) o;
        return Objects.equals(this.accountId, accountResponse.accountId) &&
                Objects.equals(this.documentType, accountResponse.documentType) &&
                Objects.equals(this.documentNumber, accountResponse.documentNumber) &&
                Objects.equals(this.phone, accountResponse.phone) &&
                Objects.equals(this.email, accountResponse.email) &&
                Objects.equals(this.names, accountResponse.names) &&
                Objects.equals(this.lastNames, accountResponse.lastNames) &&
                Objects.equals(this.dateOfBirth, accountResponse.dateOfBirth) &&
                Objects.equals(this.cards, accountResponse.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, documentType, documentNumber, phone, email, names, lastNames, dateOfBirth, cards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountResponse {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
        sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    lastNames: ").append(toIndentedString(lastNames)).append("\n");
        sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
        sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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

