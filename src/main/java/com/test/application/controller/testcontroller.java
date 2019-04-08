package com.test.application.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.test.application.services.Testservice;
@RestController
@SuppressWarnings("all")
public class testcontroller {
	@Autowired
	private Testservice service;
	@RequestMapping("/query")
	@ResponseBody
	public String getcontroller(){
		Map map= service.getUserByName("lilei");
		JSONObject jsonobject=new JSONObject();
		String str=jsonobject.toJSONString(map);
		return str;
	}
	@RequestMapping("/queryAll")
	@ResponseBody
	public String getcontroller2(){
		List<Map> list= service.getAllUser();
		JSONObject jsonobject=new JSONObject();
		String str=jsonobject.toJSONString(list);
		return str;
	}
	@RequestMapping("/getUpdate")
	@ResponseBody
	public String getcontroller3(){
		Map map= service.getUserByName("lilei");
		JSONObject jsonobject=new JSONObject();
		String str=jsonobject.toJSONString(map);
		return str;
	}
}
