package com.bank.accounts.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "transaction")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Transaction extends IdEnabledEntity {

    @Column(name = "date_transaction", nullable = false)
    private OffsetDateTime dateTransaction;

    @Column(name = "type_transaction", nullable = false)
    private Integer typeTransaction;

    @Column(name = "amount", precision = 19, scale = 2, nullable = false)
    private BigDecimal amount;

    @Column(name = "debit_account_source_id", nullable = false)
    private Long debitAccountSourceId;

    @Column(name = "debit_account_destiny_id", nullable = false)
    private Long debitAccountDestinyId;

    @Column(name = "currency")
    private Integer currency;

}

