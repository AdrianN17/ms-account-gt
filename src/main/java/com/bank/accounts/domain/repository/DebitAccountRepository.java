package com.bank.accounts.domain.repository;

import com.bank.accounts.domain.entities.DebitAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitAccountRepository extends JpaRepository<DebitAccount, Long> {

}
