package com.bank.accounts.domain.repository;

import com.bank.accounts.domain.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
