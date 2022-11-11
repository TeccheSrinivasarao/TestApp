package com.sb.sample.application.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sb.sample.application.entity.BankCode;

@Repository
public interface BankCodeSvc {

	BankCode addBankCode(BankCode request);

	List<BankCode> getBankCodes();

	BankCode updateBankCode(BankCode request);

	String deleteBankCode(Integer id);


}
