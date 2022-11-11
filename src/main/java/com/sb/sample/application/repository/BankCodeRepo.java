package com.sb.sample.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.sample.application.entity.BankCode;

@Repository
public interface BankCodeRepo extends JpaRepository<BankCode, Integer>{

}
