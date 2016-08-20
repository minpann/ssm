package com.cuit.mvnssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuit.mvnssm.dao.StudentDao;
import com.cuit.mvnssm.pojo.StudentEntity;
import com.cuit.mvnssm.service.StudentService;

@Service(value="studentService")
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentDao studentDao;

	public StudentEntity selectById(int id) {
		// TODO Auto-generated method stub
		return studentDao.selectById(id);
	}
}
