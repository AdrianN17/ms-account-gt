package com.bank.accounts.entities;

import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Account extends EnabledEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "document_type", nullable = false)
    private Integer documentType;

    @Column(name = "document_number")
    private String documentNumber;

    @Column(name = "phone", length = 9)
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "names")
    private String names;

    @Column(name = "last_names")
    private String lastNames;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<Card> cards = new ArrayList<>();

}
