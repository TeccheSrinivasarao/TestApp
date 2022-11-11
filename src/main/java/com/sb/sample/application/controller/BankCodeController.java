package com.sb.sample.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sb.sample.application.entity.BankCode;
import com.sb.sample.application.service.BankCodeSvc;

@RestController
public class BankCodeController {
	
	@Autowired
	private BankCodeSvc svc;
	
	@PostMapping(path = "/addBankCode")
	public BankCode addBankCode(@RequestBody BankCode request) {

		BankCode result = svc.addBankCode(request);

		return result;
	}

	@GetMapping(path = "/getBankCodes")
	public List<BankCode> getBankCodes() {

		List<BankCode> result = svc.getBankCodes();
		return result;
	}

	@PutMapping(path = "/updateBankCode")
	public BankCode updateBankCode(@RequestBody BankCode request) {

		BankCode result = svc.updateBankCode(request);

		return result;
	}
	
	@DeleteMapping(path = "/deleteBankCode/{id}")
	public String deleteBankCode(@PathVariable Integer id) {
		
		return svc.deleteBankCode(id);
		
	}

}
