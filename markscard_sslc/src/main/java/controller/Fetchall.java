package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.Dao;
import dto.Dto;
@WebServlet("/fetchall")
public class Fetchall extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		Dao dao=new Dao();
		List<Dto> d1=dao.fetchall();
		
		for(Dto a:d1)
		{
		resp.getWriter().print(a.getUniversity_seat_number());	
		resp.getWriter().print(a.getStudent_name());
		resp.getWriter().print(a.getDate_of_birth());
		resp.getWriter().print(a.getFather_name());
//		resp.getWriter().print(a.getKannada());
		}
		
		req.setAttribute("student_list", d1);
		RequestDispatcher rd=req.getRequestDispatcher("fetchall1.jsp");
		rd.forward(req, resp);
		
	}

}
