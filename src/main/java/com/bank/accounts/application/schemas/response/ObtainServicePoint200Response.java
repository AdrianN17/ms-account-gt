package com.bank.accounts.application.schemas.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ObtainServicePoint200Response
 */

@JsonTypeName("obtainServicePoint_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-18T07:29:52.914264900-05:00[America/Lima]")
public class ObtainServicePoint200Response {

    private Long servicePointId;

    private String name;

    private AccountResponse accountOwner;

    public ObtainServicePoint200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ObtainServicePoint200Response(Long servicePointId, String name, AccountResponse accountOwner) {
        this.servicePointId = servicePointId;
        this.name = name;
        this.accountOwner = accountOwner;
    }

    public ObtainServicePoint200Response servicePointId(Long servicePointId) {
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

    public ObtainServicePoint200Response name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObtainServicePoint200Response accountOwner(AccountResponse accountOwner) {
        this.accountOwner = accountOwner;
        return this;
    }

    /**
     * Get accountOwner
     *
     * @return accountOwner
     */
    @NotNull
    @Valid
    @Schema(name = "accountOwner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("accountOwner")
    public AccountResponse getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(AccountResponse accountOwner) {
        this.accountOwner = accountOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObtainServicePoint200Response obtainServicePoint200Response = (ObtainServicePoint200Response) o;
        return Objects.equals(this.servicePointId, obtainServicePoint200Response.servicePointId) &&
                Objects.equals(this.name, obtainServicePoint200Response.name) &&
                Objects.equals(this.accountOwner, obtainServicePoint200Response.accountOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servicePointId, name, accountOwner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObtainServicePoint200Response {\n");
        sb.append("    servicePointId: ").append(toIndentedString(servicePointId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
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

