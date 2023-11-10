<%@ page import="vn.edu.iuh.fit.www_lab_week_02_2.services.ProductService" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.www_lab_week_02_2.models.Product" %><%--
  Created by IntelliJ IDEA.
  User: Ngoc Vu
  Date: 10/11/2023
  Time: 11:06 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Danh sách sản phẩm </title>
    <style>
        table, th, td {
            border: 1px solid;
        }

        table {
            width: 100%;
        }

        tr:hover {
            background-color: coral;
        }

        th {
            background-color: #04AA6D;
            color: white;
            text-align: left;
        }

        /*.grid-container {*/
        /*    display: grid;*/
        /*    grid-template-columns: auto auto;*/
        /*    gap: 10px;*/
        /*    !*background-color: #2196F3;*!*/
        /*    padding: 10px;*/
        /*}*/

        /*.grid-container > div {*/
        /*    !*background-color: rgba(255, 255, 255, 0.8);*!*/
        /*    text-align: center;*/
        /*    padding: 20px 0;*/
        /*    font-size: 30px;*/
        /*}*/
    </style>
</head>
<body>

    <h1> Danh sách sản phẩm </h1>

    <%
        ProductService productService = new ProductService();
        List<Product> productList = productService.getAllPro();
    %>
<%--    <div class="grid-container">--%>
<%--        <%--%>
<%--            if (!productList.isEmpty()) {--%>
<%--                for (Product productL: productList ) {--%>
<%--        %>--%>

<%--        <div>--%>

<%--            <label> <%=productL.getName()%>  </label>--%>

<%--        </div>--%>

<%--        <%--%>
<%--            }--%>
<%--        }%>--%>
<%--    </div>--%>

<%--    <div>--%>
<%--        <img src="img/tesst.png">--%>
<%--    </div>--%>

    <table >
        <tr>
            <th > <h4> Product_id </h4> </th>
            <th > <h4> Name </h4> </th>
            <th > <h4> Manufacturer Name </h4> </th>
            <th > <h4> Status </h4> </th>
            <th > <h4> Unit </h4> </th>
            <th > <h4> Description </h4> </th>
        </tr>

        <%
            if (!productList.isEmpty()) {
                for (Product productL: productList ) {
        %>

        <tr>
            <td> <%=productL.getProductID()%> </td>
            <td> <%=productL.getName()%> </td>
            <td> <%=productL.getManufacturerName()%> </td>
            <td> <%=productL.getStatus()%> </td>
            <td> <%=productL.getUnit()%> </td>
            <td> <%=productL.getDescription()%> </td>
        </tr>
        <% }
        }%>
    </table>

</body>
</html>
