package com.bank.accounts.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardResponseDto {
    private Long cardId;
    private String numberCard;
    private String cvc;
    private String date;
    private Long accountId;
    private String cardType;
    private CardResponseCreditDebitAccountDto creditDebitAccount;
}
