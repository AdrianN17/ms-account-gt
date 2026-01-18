package com.bank.accounts.domain.entities;

import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDate;

import com.bank.accounts.domain.entities.enums.CardType;
import com.bank.accounts.domain.converter.CardTypeConverter;

@Entity
@Table(name = "card")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Card extends EnabledEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "number_card")
    private String numberCard;

    @Column(name = "cvc", length = 4)
    private String cvc;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Convert(converter = CardTypeConverter.class)
    @Column(name = "card_type")
    private CardType cardType;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "card_id", insertable = false, updatable = false)
    private CreditAccount creditAccount;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "card_id", insertable = false, updatable = false)
    private DebitAccount debitAccount;

}
