package com.bank.accounts.application.schemas.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * TrackingResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-18T07:29:52.914264900-05:00[America/Lima]")
public class TrackingResponse {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime operationDate;

    private UUID trackingId;

    public TrackingResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TrackingResponse(OffsetDateTime operationDate, UUID trackingId) {
        this.operationDate = operationDate;
        this.trackingId = trackingId;
    }

    public TrackingResponse operationDate(OffsetDateTime operationDate) {
        this.operationDate = operationDate;
        return this;
    }

    /**
     * Get operationDate
     *
     * @return operationDate
     */
    @NotNull
    @Valid
    @Schema(name = "operationDate", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("operationDate")
    public OffsetDateTime getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(OffsetDateTime operationDate) {
        this.operationDate = operationDate;
    }

    public TrackingResponse trackingId(UUID trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get trackingId
     *
     * @return trackingId
     */
    @NotNull
    @Valid
    @Schema(name = "trackingId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("trackingId")
    public UUID getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(UUID trackingId) {
        this.trackingId = trackingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrackingResponse trackingResponse = (TrackingResponse) o;
        return Objects.equals(this.operationDate, trackingResponse.operationDate) &&
                Objects.equals(this.trackingId, trackingResponse.trackingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationDate, trackingId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrackingResponse {\n");
        sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
        sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
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

