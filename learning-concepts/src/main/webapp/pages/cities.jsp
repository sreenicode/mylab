<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>City</title>
</head>
<body>
<form action="/betting">
List of users:
    <br />
    <table>
        <c:forEach items="${cityList}" var="City">
            <tr>
                <td>${City.id}</td>
            </tr>
              <tr>
                <td>${City.name}</td>
            </tr>
              <tr>
                <td>${City.population}</td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>