package com.bank.accounts.domain.entities;

import lombok.*;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "debit_account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class DebitAccount extends EnabledEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id", nullable = false)
    private Card card;

    @Column(name = "amount", precision = 19, scale = 2)
    private BigDecimal amount = BigDecimal.ZERO;

    @Column(name = "debit_account_type")
    private Integer debitAccountType;

    @Column(name = "currency")
    private Integer currency;

}
