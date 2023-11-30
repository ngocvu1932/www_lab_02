<%@ page import="vn.edu.iuh.fit.www_lab_week_02_2.backend.models.Employee" %>
<%@ page import="vn.edu.iuh.fit.www_lab_week_02_2.backend.models.Product" %>
<%@ page import="vn.edu.iuh.fit.www_lab_week_02_2.backend.services.ProductService" %>
<%@ page import="java.util.Optional" %>
<%@ page import="vn.edu.iuh.fit.www_lab_week_02_2.backend.enums.EnumProduct" %><%--
  Created by IntelliJ IDEA.
  User: Ngoc Vu
  Date: 30/11/2023
  Time: 4:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cập nhật sản phẩm</title>
</head>
<body>
    <h1> Cập nhật sản phẩm </h1>

    <%
        long id =Long.parseLong(request.getParameter("id"));
        ProductService productService = new ProductService();
        Optional<Product> op= productService.findbyId(id);
        if (op.isPresent()) {
            Product productEdit = op.get();

    %>

    <form action="controller?action=updatePro" method="post" accept-charset="UTF-8">
        <input type="hidden" name="id" value="<%=productEdit.getProductID()%>">
        <label> Name: <input name="name" value="<%=productEdit.getName()%>"> </label> <br> <br>
        <label> Description: <input name="description" value="<%=productEdit.getDescription()%>">  </label> <br> <br>
        <label> Manufacturer Name: <input name="manufacturerName" value="<%=productEdit.getManufacturerName()%>"> </label> <br><br>
        <label> Unit: <input name="unit" value="<%=productEdit.getUnit()%>"> </label> <br><br>
        <label>
            Status:
            <input type="radio" name="status" value="ACTIVE" <%=productEdit.getStatus() ==EnumProduct.ACTIVE ? "checked" : "" %> > ACTIVE
            <input type="radio" name="status" value="IN_ACTIVE" <%=productEdit.getStatus() ==EnumProduct.IN_ACTIVE ? "checked" : "" %> > IN_ACTIVE
            <input type="radio" name="status" value="TERMINATED" <%=productEdit.getStatus() ==EnumProduct.TERMINATED ? "checked" : "" %> > TERMINATED
        </label> <br> <br>
        <input type="reset" value="Reset">
        <input type="submit" value="Submit">
    </form>

    <%}%>

</body>
</html>
