<%@page import="lab4.Person"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 5</title>
    </head>   
    
    <body>
        <table border = "1">
          <tr>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>email</th>
          </tr>
<%
    try {
        List<Person> studentsList = (List<Person>) session.getAttribute("studentsList");

        for(Person student : studentsList) { %>
            <tr>
              <td><%=student.getFirstName()%></td>
              <td><%=student.getLastName()%></td>
              <td><%=student.getEmailAddress()%></td>
            </tr>    
    <%  }   
    } catch (Exception ex) { 
    }
    %>
        </table>
        
        <br /><br />
        <form action='/lab5/lista' method='post'>
            
            Imie: <input type='text' name='firstName'> <br />
            Nazwisko <input type='text' name='lastName'><br />
            email<input type='text' name='email'>
            <input type='submit'>
        </form>
    </body>   
</html>