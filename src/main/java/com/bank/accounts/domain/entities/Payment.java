package com.bank.accounts.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "payment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Payment extends EnabledEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "date_payment", nullable = false)
    private OffsetDateTime datePayment;

    @Column(name = "type_payment", nullable = false)
    private Integer typePayment;

    @Column(name = "charge", precision = 19, scale = 2, nullable = false)
    private BigDecimal charge;

    @Column(name = "card_id", nullable = false)
    private Long cardId;

    @Column(name = "fee", precision = 19, scale = 2, nullable = false)
    private BigDecimal fee;

    @Column(name = "service_point_id")
    private Long servicePointId;

    @Column(name = "currency")
    private Integer currency;

}

