<%@page import="dto.Dto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    padding: 20px;
  }

  form {
    max-width: 400px;
    margin: 0 auto;
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  }

 <%-- input[type="number"],
  input[type="text"] {
    width: 100%;
    padding: 5px;
    margin-bottom: 10px;
    border-radius: 3px;
    border: 1px solid #ccc;
  }--%>

  button {
    background-color: #4CAF50;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 3px;
    cursor: pointer;
  }

  button:hover {
    background-color: #45a049;
  }
  .container h1 {
      text-align: center;
    }
</style>
<body style="margin-right: 400px; margin-left: 200px">
<%Dto dt=(Dto) request.getAttribute("Dto"); %>


     <tr>
     <td> KANNADA</td>
     <td align="center"> <b><%=dt.getKannada() %></b>
     </tr>
     
     <tr>
     <td> ENGLISH</td>
     <td align="center"><b><%=dt.getEnglish() %></b>
     </tr>
     
     <tr>
     <td>HINDI:</td>
     <td align="center"><b><%=dt.getHindi() %></b>
     </tr>
     
     <tr>
     <td>MATHEMATICS:</td>
     <td align="center"><b><%=dt.getEnglish() %></b>
     </tr>
     
     <tr>
     <td>SOCIAL SCIENCE:</td>
     <td align="center"><b><%=dt.getEnglish() %></b>
     </tr>
     
     <tr>
     <td>SCIENCE:</td>
     <td align="center"><b><%=dt.getEnglish() %></b>
     </tr>
     
     

</form>

</body>
</html>