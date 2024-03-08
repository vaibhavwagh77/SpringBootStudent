package com.winabale.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winabale.sms.model.student;

@Repository
public interface StudentRepository extends JpaRepository<student, Long>{

}
