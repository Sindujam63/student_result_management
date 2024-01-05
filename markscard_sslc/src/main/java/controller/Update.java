package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Dto;
import javassist.runtime.DotClass;
@WebServlet("/update")
public class Update extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		 

		String usn=req.getParameter("University_seat_number");
		int usn1=Integer.parseInt(usn);

		String sname=req.getParameter("Student_name");
		String dob=req.getParameter("Date_of_birth");
		String fname=req.getParameter("Father_name");
		
		
		String kannada=req.getParameter("Kannada");
		int kan=Integer.parseInt(kannada);
		
		String english=req.getParameter("English");
		int eng=Integer.parseInt(english);
		
		String hindi=req.getParameter("Hindi");
		int hin=Integer.parseInt(hindi);
		
		String maths=req.getParameter("Mathematics");
		int math=Integer.parseInt(maths);
		
		String science=req.getParameter("Science");
		int science1=Integer.parseInt(science);
		
		String socialscience=req.getParameter("Social_science");
		int ss=Integer.parseInt(socialscience);
		
		
		int Total_marks=kan+eng+hin+math+science1+ss;
		
		float percentage=(Total_marks*100)/650;


		Dto dto=new Dto();
		dto.setUniversity_seat_number(usn1);
		dto.setStudent_name(sname);
		dto.setDate_of_birth(dob);
		dto.setFather_name(fname);
		dto.setKannada(kan);
		dto.setEnglish(eng);
		dto.setHindi(hin);
		dto.setMathematics(math);
		dto.setSocial_science(ss);
		dto.setScience(science1);
        dto.setTotal_marks(Total_marks);
        dto.getPercentage();
       
        
        Dao dao=new Dao();
        dao.update(dto);
        resp.getWriter().print("<h1>data updated sucessfully</h1>");
	  
	}

}
