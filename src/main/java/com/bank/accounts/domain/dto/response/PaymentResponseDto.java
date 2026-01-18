package com.bank.accounts.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentResponseDto {
    private Long paymentId;
    private OffsetDateTime datePayment;
    private String typePayment;
    private BigDecimal charge;
    private Long cardId;
    private BigDecimal fee;
    private Long servicePointId;
    private String currency;
}
