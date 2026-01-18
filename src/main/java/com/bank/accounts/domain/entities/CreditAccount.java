package com.bank.accounts.domain.entities;

import lombok.*;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "credit_account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class CreditAccount extends EnabledEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "card_id")
    private Long cardId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id", insertable = false, updatable = false)
    private Card card;

    @Column(name = "amount", precision = 19, scale = 2)
    private BigDecimal amount = BigDecimal.ZERO;

    @Column(name = "max_amount", precision = 19, scale = 2)
    private BigDecimal maxAmount;

    @Column(name = "facturation_date")
    private LocalDate facturationDate;

    @Column(name = "last_payment_date")
    private LocalDate lastPaymentDate;

    @Column(name = "currency")
    private Integer currency;

}
