package com.bank.accounts.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionResponseDto {
    private Long transactionId;
    private OffsetDateTime dateTransaction;
    private String typeTransaction;
    private String amount;
    private Long debitAccountSourceId;
    private Long debitAccountDestinyId;
    private String currency;
}
