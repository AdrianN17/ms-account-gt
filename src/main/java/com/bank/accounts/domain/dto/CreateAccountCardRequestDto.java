package com.bank.accounts.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateAccountCardRequestDto {
    private DebitAccountRequestDto debitCreditAccount;
    private CardRequestDto card;
}
