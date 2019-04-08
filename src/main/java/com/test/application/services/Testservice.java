package com.test.application.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.application.interfaces.TestInterface;

@Service
@SuppressWarnings("all")
public class Testservice {
	@Autowired
	private TestInterface mapper;
	
	public Map getUserByName(String name){
		return mapper.selectUser(name);
	}
	public List<Map> getAllUser(){
		return mapper.getAllUser();
	}
}
