package com.leader.spring07.test02.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {
	@Autowired
	private DataSource datasource;
	public void addNewUser(String name, int age) throws SQLException {
		Connection conn = DataSourceUtils.getConnection(datasource);
		try {
			String sql = "insert into users(name,age) values(?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.executeUpdate();
			ps.close();
		} finally
		{
			DataSourceUtils.releaseConnection(conn, datasource);
		}
		
	}

	public void queryUser() throws SQLException {
		Connection conn = DataSourceUtils.getConnection(datasource);
		String sql = "select * from users";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet ret = ps.executeQuery();
		while (ret.next()) {
			System.out.println(ret.getString(2) + "=" + ret.getInt(3));
		}
		ps.close();
		DataSourceUtils.releaseConnection(conn, datasource);
	}
}
