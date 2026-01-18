package com.bank.accounts.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountResponseDto {
    private Long accountId;
    private String documentType;
    private String documentNumber;
    private String phone;
    private String email;
    private String names;
    private String lastNames;
    private LocalDate dateOfBirth;
    private List<CardResponseDto> cards;
}
