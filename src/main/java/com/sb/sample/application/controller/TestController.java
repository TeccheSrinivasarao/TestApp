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

import com.sb.sample.application.entity.Test;
import com.sb.sample.application.service.TestSvc;

@RestController
public class TestController {

	@Autowired
	private TestSvc svc;

	@PostMapping(path = "/addTest")
	public Test addTest(@RequestBody Test request) {

		Test result = svc.addTest(request);

		return result;
	}

	@GetMapping(path = "/getTests")
	public List<Test> getTests() {

		List<Test> result = svc.getTests();
		return result;
	}

	@PutMapping(path = "/updateTest")
	public Test updateTest(@RequestBody Test request) {

		Test result = svc.updateTest(request);

		return result;
	}
	
	@DeleteMapping(path = "/deleteTest/{id}")
	public String deleteTest(@PathVariable Integer id) {
		
		return svc.deleteTest(id);
		
	}
}
