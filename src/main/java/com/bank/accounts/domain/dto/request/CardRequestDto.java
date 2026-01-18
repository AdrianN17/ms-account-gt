package com.bank.accounts.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardRequestDto {
    private String numberCard;
    private String cvc;
    private String date;
    private String cardType;
}
