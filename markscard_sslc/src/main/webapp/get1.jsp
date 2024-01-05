<%@page import="dto.Dto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="margin-right: 400px; margin-left: 200px;">
<% Dto a=(Dto) request.getAttribute("marks_card"); %>
<form style="width: 900px; padding: 10px; border: 4px solid black; background-color: grey;">
<h1 align="center" style="word-spacing: 5px">Karnataka Secondary Education Examination Board</h1>
<h2 align="center" style="word-spacing: 5px">Bangalore, Karnataka</h2>
<b><h2 align="center" style="color: black;">Secondary School Leaving Certificate</h2></b>
<h3 align="center" >This is to certify that the below mentioned candidate has passed S.S.L.C. Examination.</h3>
<hr style="height: 5px; color: green;">
<h3><span style="color: purpule;">University Seat Number:</span><%=a.getUniversity_seat_number() %></h3>
<h3><span style="color: purpule;">Name: </span><%=a.getStudent_name() %></h3>
<h3><span style="color: purpule;">Date Of Birth:</span><%=a.getDate_of_birth() %></h3>
<h3><span style="color: purpule;">Father Name:</span><%=a.getFather_name() %></h3><br><br>


<table border="3px" style="width: 850px; height: 300px;">

<tr allign="center" style="">
<th>Scholostic Subjects</th>
</tr>
 
 <tr allign="center" style="">
<th>Marks Scored</th>
</tr>
 
<tr allign="center" style="">
<th>Kannada marks</th>
<td><%=a.getKannada() %></td>
</tr>

<tr allign="center" style="">
<th>Hindi marks</th>
<td><%=a.getHindi() %></td>
</tr>

<tr allign="center" style="">
<th>Mathematics marks</th>
<td><%=a.getMathematics() %></td>
</tr>

<tr allign="center" style="">
<th>Social science_marks</th>
<td><%=a.getSocial_science() %></td>
</tr>

<tr allign="center" style="">
<th>Science marks</th>
<td><%=a.getScience() %>
</tr>

<tr allign="center" style="">
<th>Total Marks</th>
<td><%=a.getTotal_marks() %></td>
</tr>

<tr allign="center" style="">
<th>Percentage</th>
<td><%=a.getPercentage() %></td>
</tr>

</table>
</form>
</body>
</html>