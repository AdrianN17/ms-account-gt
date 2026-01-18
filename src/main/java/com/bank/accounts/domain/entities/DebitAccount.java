package com.bank.accounts.domain.entities;

import com.bank.accounts.domain.converter.CurrencyConverter;
import com.bank.accounts.domain.converter.DebitAccountTypeConverter;
import com.bank.accounts.domain.entities.enums.Currency;
import com.bank.accounts.domain.entities.enums.DebitAccountType;
import jakarta.persistence.*;
import lombok.*;

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

    @Convert(converter = DebitAccountTypeConverter.class)
    @Column(name = "debit_account_type")
    private DebitAccountType debitAccountType;

    @Convert(converter = CurrencyConverter.class)
    @Column(name = "currency")
    private Currency currency;

}
