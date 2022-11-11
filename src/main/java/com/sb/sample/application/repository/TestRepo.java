package com.sb.sample.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.sample.application.entity.Test;

@Repository
public interface TestRepo extends JpaRepository<Test, Integer>{

}
