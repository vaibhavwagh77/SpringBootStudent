package com.winabale.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winabale.sms.model.student;
import com.winabale.sms.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository StudentRepository;
	@Override
	public List<student> getAllstudent(){
		return StudentRepository.findAll();

}
}
