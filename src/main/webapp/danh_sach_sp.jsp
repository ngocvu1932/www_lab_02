<%@ page import="vn.edu.iuh.fit.www_lab_week_02_2.backend.services.ProductService" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.www_lab_week_02_2.backend.models.Product" %>
<%@ page import="vn.edu.iuh.fit.www_lab_week_02_2.frontend.models.ProductModel" %><%--
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
    <link rel="stylesheet" href="webjars/bootstrap/5.3.2/css/bootstrap.min.css">
    <style>
        table, th, td {
            border: 1px solid;
        }

        table {
            width: 100%;
        }

        tr:hover {
            background-color: antiquewhite;
        }

        th {
            background-color: #04AA6D;
            color: white;
            text-align: left;
        }
    </style>

    <script>
        function deleteProduct(id) {
            if (confirm("Chắc muốn xóa?")) {
                var xhr = new XMLHttpRequest();
                xhr.open("DELETE", "controller?action=deletePro&id="+id, true);
                xhr.onreadystatechange= function () {
                    if (xhr.readyState===4 && xhr.status===200) {
                        location.reload();
                    }
                }
                xhr.send();
            }
        }
    </script>
</head>
<body>

    <h1> Danh sách sản phẩm </h1>

    <%
//        ProductModel productModel = new ProductModel();
        ProductService productService = new ProductService();
        List<Product> productList = productService.getAllPro();
    %>


    <table >
        <tr>
            <th > <h4> Product_id </h4> </th>
            <th > <h4> Name </h4> </th>
            <th > <h4> Manufacturer Name </h4> </th>
            <th > <h4> Status </h4> </th>
            <th > <h4> Unit </h4> </th>
            <th > <h4> Description </h4> </th>
            <th > <a class="btn btn-primary" href="controller?action=add_product">Thêm sản phẩm</a>  </th>
        </tr>

        <%
            if (!productList.isEmpty()) {
                for (Product productL: productList ) {
                    if (productL.getStatus().getValue() != 2) {
        %>

        <tr>
            <td> <%=productL.getProductID()%> </td>
            <td> <%=productL.getName()%> </td>
            <td> <%=productL.getManufacturerName()%> </td>
            <td> <%=productL.getStatus()%> </td>
            <td> <%=productL.getUnit()%> </td>
            <td> <%=productL.getDescription()%> </td>
            <td>
                <a class="btn btn-danger" href="javascript:void(0)" onclick="deleteProduct(<%=productL.getProductID()%>)" >Delete</a>
                <a class="btn btn-info" href="cap_nhat_sanpham.jsp?id=<%=productL.getProductID()%>">Update</a>
            </td>
        </tr>
        <% }}
        }%>
    </table>

</body>
</html>
