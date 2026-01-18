package com.bank.accounts.domain.repository;

import com.bank.accounts.domain.entities.CreditAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditAccountRepository extends JpaRepository<CreditAccount, Long> {

}
