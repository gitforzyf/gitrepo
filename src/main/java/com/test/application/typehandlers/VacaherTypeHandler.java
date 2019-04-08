package com.test.application.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(value=String.class)
public class VacaherTypeHandler extends BaseTypeHandler<String>{

	@Override
	public String getNullableResult(ResultSet arg0, String arg1) throws SQLException {
		// TODO Auto-generated method stub
		return arg0.getString(arg1);
	}

	@Override
	public String getNullableResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return arg0.getString(arg1);
	}

	@Override
	public String getNullableResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return arg0.getString(arg1);
	}

	@Override
	public void setNonNullParameter(PreparedStatement arg0, int arg1, String arg2, JdbcType arg3) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(00000);
	}

}
