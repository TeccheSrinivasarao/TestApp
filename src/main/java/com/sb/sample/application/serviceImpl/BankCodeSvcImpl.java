package com.sb.sample.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sb.sample.application.entity.BankCode;
import com.sb.sample.application.repository.BankCodeRepo;
import com.sb.sample.application.service.BankCodeSvc;

@Service
public class BankCodeSvcImpl implements BankCodeSvc {

	@Autowired
	private BankCodeRepo repo;

	@Transactional
	public BankCode addBankCode(BankCode request) {
		BankCode response = repo.save(request);

		return response;
	}

	@Transactional(readOnly = true)
	public List<BankCode> getBankCodes() {
		return repo.findAll();
	}

	@Transactional
	public BankCode updateBankCode(BankCode request) {
		BankCode bankCode = null;
		if (repo.findById(request.getId()).isPresent()) {
			bankCode = repo.save(request);
		} else {
			System.out.println("Record not exists in DB");
		}
		return bankCode;
	}

	@Transactional
	public String deleteBankCode(Integer id) {
		if (repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return "Record Deleted Successfully";
		} else {
			return "record not found in DB";
		}

	}

}
