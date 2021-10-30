package com.study.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.jpa.domain.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

}
