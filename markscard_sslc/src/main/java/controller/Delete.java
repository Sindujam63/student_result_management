package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
@WebServlet("/delete")
public class Delete extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		 String University_seat_number=req.getParameter("university_seat_number");
		 int usn1=Integer.parseInt(University_seat_number);
		 
		 Dao dao=new Dao();
		 String d1=dao.delete(usn1);
		 
		 resp.getWriter().print(d1);
		 resp.getWriter().print("<h1>Data deleted</h1>");
	}

}
