package com.bank.accounts.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServicePointResponseDto {
    private Long servicePointId;
    private String name;
    private AccountResponseDto accountOwner;
}
