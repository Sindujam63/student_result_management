package controller;
//
import java.io.IOException;
//
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Dto;

@WebServlet("/fetchbyid")
public class Fetchbyid extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String usn=req.getParameter("University_seat_number");
		int usn1=Integer.parseInt(usn);
		
		String dob=req.getParameter("Date_of_birth");
		 
		Dao dao=new Dao();
		Dto s1=dao.student_marks(usn1);
		  
		if(s1!=null)
		{	
			
				if(dob.equals(s1.getDate_of_birth()) )
				{
					
			req.setAttribute("marks_card", s1);
			RequestDispatcher rd=req.getRequestDispatcher("get1.jsp");
			rd.forward(req, resp);
		}
		else
		{
			resp.getWriter().print("<h1>incorrect date of birth,try again!</h1>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("fetchbyid.html");
			dispatcher.include(req, resp);
		}
		}
		else
		{
			resp.getWriter().print("<h1>incorrect University seat number,try again!</h1>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("fetchbyid.html");
			dispatcher.include(req, resp);
		}
	
	}
	}
	

