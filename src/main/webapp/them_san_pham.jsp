<%--
  Created by IntelliJ IDEA.
  User: Ngoc Vu
  Date: 30/11/2023
  Time: 10:06 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm sản phẩm</title>
</head>
<body>
    <h1> Thêm sản phẩm </h1>
    <form action="controller?action=insertPro" method="post" accept-charset="UTF-8" >
        <label> Name: <input name="name"> </label> <br> <br>
        <label> Description: <input name="description"> </label> <br> <br>
        <label> Manufacturer name: <input name="manufacturerName"> </label> <br> <br>
        <label> Unit: <input name="unit"> </label> <br> <br>
        <label>
            Status:
                <label> <input type="radio" name="status" value="ACTIVE"> ACTIVE </label>
                <label> <input type="radio" name="status" value="IN_ACTIVE"> IN_ACTIVE </label>
                <label> <input type="radio" name="status" value="TERMINATED"> TERMINATED </label>
        </label> <br> <br>

        <input type="submit" value="Submit">
        <input type="reset" value="Reset">
    </form>

</body>
</html>
