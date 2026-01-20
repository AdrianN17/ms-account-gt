package com.bank.accounts.application.schemas.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

/**
 * BalanceSchemaResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-20T01:45:15.001779300-05:00[America/Lima]")
public class BalanceSchemaResponse {

    private String month;

    private String amount;

    public BalanceSchemaResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BalanceSchemaResponse(String month, String amount) {
        this.month = month;
        this.amount = amount;
    }

    public BalanceSchemaResponse month(String month) {
        this.month = month;
        return this;
    }

    /**
     * Get month
     *
     * @return month
     */
    @NotNull
    @Pattern(regexp = "^\\d{4}-(0[1-9]|1[0-2])$")
    @Schema(name = "month", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("month")
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BalanceSchemaResponse amount(String amount) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BalanceSchemaResponse balanceSchemaResponse = (BalanceSchemaResponse) o;
        return Objects.equals(this.month, balanceSchemaResponse.month) &&
                Objects.equals(this.amount, balanceSchemaResponse.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BalanceSchemaResponse {\n");
        sb.append("    month: ").append(toIndentedString(month)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

