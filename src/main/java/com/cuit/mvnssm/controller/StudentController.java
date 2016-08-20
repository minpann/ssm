package com.cuit.mvnssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cuit.mvnssm.pojo.StudentEntity;
import com.cuit.mvnssm.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/student/showStudent")
	public String toIndex(HttpServletRequest request,Model model){
		int id = Integer.parseInt(request.getParameter("id"));
		StudentEntity student = this.studentService.selectById(id);
		model.addAttribute("student", student);
		return "showStudent";
	}
}
