package com.vishu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishu.dao.StudentDAO;
import com.vishu.model.Student;
@Service
public class StudentManagerImpl implements StudentManager{
	@Autowired
	StudentDAO st;
	public List<Student> getallstudents() {
		// TODO Auto-generated method stub
		return st.getallstudents();
		
		
	}

}
