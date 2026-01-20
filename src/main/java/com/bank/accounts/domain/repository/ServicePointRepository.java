package com.bank.accounts.domain.repository;

import com.bank.accounts.domain.entities.ServicePoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicePointRepository extends JpaRepository<ServicePoint, Long> {
}
