package com.feedback;

import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;


@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String message=request.getParameter("message");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306:/studentdb?useSSL=false","root","root");
			PreparedStatement st=con.prepareStatement("insert into feedbacks value(?,?,?)");
			st.setString(1, name);
			st.setString(2, email);
			st.setString(3, message);
			st.executeUpdate();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		request.setAttribute("name", name);
		RequestDispatcher rd=request.getRequestDispatcher("ThankYou.jsp");
		rd.forward(request, response);
		
	}

}



