<%@page import="dto.Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="margin-right: 400px; margin-left: 200px;">
<% List<Dto>l1=(List<Dto>) request.getAttribute("student_list"); %>
<table border="">
<td>
<tr>
<th>University_seat_number: </th>
<th>Student name:</th>
<th>Date of birth: </th>
<th>father name: </th>
<th>Kannada Marks</th>
<th>English Marks: </th>
<th>Hindi Marks: </th>
<th>Mathematics Marks: </th>
<th>Social science Marks: </th>
<th>Social Marks: </th>
<th>Total Marks: </th>
<th>Percentage: </th>

</tr>
<% for(Dto a:l1) { %>

<tr>
<td><%=a.getUniversity_seat_number() %></td>
<td><%=a.getStudent_name() %></td>
<td><%=a.getDate_of_birth() %></td>
<td><%=a.getFather_name() %></td>
<td><%=a.getKannada() %></td>
<td><%=a.getEnglish() %></td>
<td><%=a.getHindi() %></td>
<td><%=a.getMathematics() %></td>
<td><%=a.getSocial_science() %></td>
<td><%=a.getScience() %></td>
<td><%=a.getTotal_marks() %></td>
<td><%=a.getPercentage() %></td>

</tr>
<%}%>
<td>
</table>
</body>
</html>