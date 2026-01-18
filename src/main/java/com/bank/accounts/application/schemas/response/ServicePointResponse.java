package com.bank.accounts.application.schemas.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ServicePointResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-18T07:29:52.914264900-05:00[America/Lima]")
public class ServicePointResponse {

    private Long servicePointId;

    private String name;

    private AccountResponse accountOwner;

    public ServicePointResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ServicePointResponse(Long servicePointId, String name, AccountResponse accountOwner) {
        this.servicePointId = servicePointId;
        this.name = name;
        this.accountOwner = accountOwner;
    }

    public ServicePointResponse servicePointId(Long servicePointId) {
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

    public ServicePointResponse name(String name) {
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

    public ServicePointResponse accountOwner(AccountResponse accountOwner) {
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
        ServicePointResponse servicePointResponse = (ServicePointResponse) o;
        return Objects.equals(this.servicePointId, servicePointResponse.servicePointId) &&
                Objects.equals(this.name, servicePointResponse.name) &&
                Objects.equals(this.accountOwner, servicePointResponse.accountOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servicePointId, name, accountOwner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServicePointResponse {\n");
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

