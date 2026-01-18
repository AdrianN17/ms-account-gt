package com.bank.accounts.domain.dto;

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
public class CardResponseCreditDebitAccountDto {
    private Long debitAccountId;
    private String cardId;
    private BigDecimal amount;
    private String currency;
    private String debitAccountType;
    private Long creditAccountId;
    private BigDecimal maxAccount;
    private LocalDate facturationDate;
    private LocalDate lastPaymentDate;
}
