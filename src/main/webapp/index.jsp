<%@ page import="vn.edu.iuh.fit.www_lab_week_02_2.services.EmployeeService" %>
<%@ page import="vn.edu.iuh.fit.www_lab_week_02_2.services.EmployeeService" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1> Ngô Ngọc Vũ_20047731_week_02
</h1>
<br/>

    <a href="controller?action=product_lists">Danh sách sản phẩm</a>
<%
    EmployeeService employeeService = new EmployeeService();
%>
</body>
</html>