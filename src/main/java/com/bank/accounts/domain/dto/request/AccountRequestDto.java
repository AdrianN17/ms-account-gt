package com.bank.accounts.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountRequestDto {
    private String documentType;
    private String documentNumber;
    private String phone;
    private String email;
    private String names;
    private String lastNames;
    private LocalDate dateOfBirth;
}
