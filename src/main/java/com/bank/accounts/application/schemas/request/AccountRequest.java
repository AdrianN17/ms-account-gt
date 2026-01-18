package com.bank.accounts.application.schemas.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Objects;

/**
 * AccountRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-18T07:29:52.914264900-05:00[America/Lima]")
public class AccountRequest {

    private String documentType;

    private String documentNumber;

    private String phone;

    private String email;

    private String names;

    private String lastNames;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;

    public AccountRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public AccountRequest(String documentType, String documentNumber, String phone, String email, String names, String lastNames, LocalDate dateOfBirth) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.phone = phone;
        this.email = email;
        this.names = names;
        this.lastNames = lastNames;
        this.dateOfBirth = dateOfBirth;
    }

    public AccountRequest documentType(String documentType) {
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

    public AccountRequest documentNumber(String documentNumber) {
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

    public AccountRequest phone(String phone) {
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

    public AccountRequest email(String email) {
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

    public AccountRequest names(String names) {
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

    public AccountRequest lastNames(String lastNames) {
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

    public AccountRequest dateOfBirth(LocalDate dateOfBirth) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountRequest accountRequest = (AccountRequest) o;
        return Objects.equals(this.documentType, accountRequest.documentType) &&
                Objects.equals(this.documentNumber, accountRequest.documentNumber) &&
                Objects.equals(this.phone, accountRequest.phone) &&
                Objects.equals(this.email, accountRequest.email) &&
                Objects.equals(this.names, accountRequest.names) &&
                Objects.equals(this.lastNames, accountRequest.lastNames) &&
                Objects.equals(this.dateOfBirth, accountRequest.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentType, documentNumber, phone, email, names, lastNames, dateOfBirth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountRequest {\n");
        sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
        sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    lastNames: ").append(toIndentedString(lastNames)).append("\n");
        sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

