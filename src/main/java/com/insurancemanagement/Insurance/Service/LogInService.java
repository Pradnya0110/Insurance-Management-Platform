package com.insurancemanagement.Insurance.Service;

import java.sql.SQLException;

import com.insurancemanagement.Insurance.Bean.Officer;
import com.insurancemanagement.Insurance.DAO.LogInDAO;

public class LogInService {
	
	public String checkLoginService(Officer officer) throws SQLException, ClassNotFoundException
	{
		String type=LogInDAO.checkLogin(officer);
		return type;
	}

}
