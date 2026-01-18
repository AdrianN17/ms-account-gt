package com.bank.accounts.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditAccountResponseDto {
    private Long creditAccountId;
    private BigDecimal amount;
    private BigDecimal maxAccount;
    private LocalDate facturationDate;
    private LocalDate lastPaymentDate;
    private String currency;
}
