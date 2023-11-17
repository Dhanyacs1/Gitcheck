package com.infinite.corporation.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.infinite.corporation.Hikari;
import com.infinite.log4j.Log4j;
@Controller
public class LoginController {
	private static final Logger logger = Logger.getLogger(Log4j.class);
	@RequestMapping("/insert")
	public String insert(HttpServletRequest request, HttpServletResponse response) {
		PropertyConfigurator.configure("log4j.properties");
		String Name = request.getParameter("Name");
		String Emailid = request.getParameter("Emailid");
		String Password = request.getParameter("Password");
		String ConfirmPassword = request.getParameter("Confirm Password");
		String DateofBirth = request.getParameter("Date of Birth");
		logger.info("inserted");
		Connection connection = null;
		PreparedStatement pstmt = null;
		try {
			DataSource dataSource = Hikari.getDataSource();
			connection = dataSource.getConnection();
			pstmt = connection.prepareStatement("insert into corporation values(?,?,?,?,?)");
			pstmt.setString(1, Name);
			pstmt.setString(2, Emailid);
			pstmt.setString(3, Password);
			pstmt.setString(4, ConfirmPassword);
			pstmt.setString(5, DateofBirth);
			int a = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return "failure";
		}
		return "success";
	}
}