package com.sb.sample.application.service;

import java.util.List;

import com.sb.sample.application.entity.Test;

public interface TestSvc {

	Test addTest(Test request);

	List<Test> getTests();

	Test updateTest(Test request);

	String deleteTest(Integer id);

}
