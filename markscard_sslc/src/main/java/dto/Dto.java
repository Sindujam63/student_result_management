package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.servlet.http.HttpServlet;
@Entity
public class Dto extends HttpServlet
{
	@Id
	 private int University_seat_number;
	 private String Student_name;
	 private String Date_of_birth;
	 private String Father_name;
	 private int English;
	 private int Kannada;
	 private int Hindi;
	 private int Mathematics;
	 private int Social_science;
	 private int Science;
	 private int Total_marks;
	 private float Percentage;
	public int getUniversity_seat_number() {
		return University_seat_number;
	}
	public void setUniversity_seat_number(int university_seat_number) {
		University_seat_number = university_seat_number;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getDate_of_birth() {
		return Date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		Date_of_birth = date_of_birth;
	}
	public String getFather_name() {
		return Father_name;
	}
	public void setFather_name(String father_name) {
		Father_name = father_name;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getKannada() {
		return Kannada;
	}
	public void setKannada(int kannada) {
		Kannada = kannada;
	}
	public int getHindi() {
		return Hindi;
	}
	public void setHindi(int hindi) {
		Hindi = hindi;
	}
	public int getMathematics() {
		return Mathematics;
	}
	public void setMathematics(int mathematics) {
		Mathematics = mathematics;
	}
	public int getSocial_science() {
		return Social_science;
	}
	public void setSocial_science(int social_science) {
		Social_science = social_science;
	}
	public int getScience() {
		return Science;
	}
	public void setScience(int science) {
		Science = science;
	}
	public int getTotal_marks() {
		return Total_marks;
	}
	public void setTotal_marks(int total_marks) {
		Total_marks = total_marks;
	}
	public float getPercentage() {
		return Percentage;
	}
	public void setPercentage(float percentage) {
		Percentage = percentage;
	}
	
	
}
