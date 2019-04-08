package com.test.application.interfaces;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
@SuppressWarnings("all")
public interface TestInterface {
	@Select("select * from tb_user where name=#{name}")
	Map selectUser(@Param("name")String name);
	@Select("select * from tb_user")
	List<Map> getAllUser();
}
