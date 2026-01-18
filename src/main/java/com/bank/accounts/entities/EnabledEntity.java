package com.bank.accounts.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public abstract class EnabledEntity {

    @Column(name = "enabled")
    private Boolean enabled = Boolean.TRUE;

}

