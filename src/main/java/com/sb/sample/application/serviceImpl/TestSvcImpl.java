package com.sb.sample.application.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sb.sample.application.entity.Test;
import com.sb.sample.application.repository.TestRepo;
import com.sb.sample.application.service.TestSvc;

@Service
public class TestSvcImpl implements TestSvc {

	@Autowired
	private TestRepo repo;

	@Transactional
	public Test addTest(Test request) {

		Test response = repo.save(request);

		return response;
	}

	@Transactional(readOnly = true)
	public List<Test> getTests() {
		return repo.findAll();
	}

	@Transactional
	public Test updateTest(Test request) {
		Test test = null;
		if (repo.findById(request.getId()).isPresent()) {
			test = repo.save(request);
		} else {
			System.out.println("Record not exists in DB");
		}
		return new Test();
	}

	@Transactional
	public String deleteTest(Integer id) {
		Optional<Test> test =  repo.findById(id);
		if (test.isPresent()) {
			repo.deleteById(id);
			return "Record Deleted Successfully";
		} else {
			return "record not found in DB";
		}

	}

}
