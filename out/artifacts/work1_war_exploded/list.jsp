<%--
  Created by IntelliJ IDEA.
  User: 崖子
  Date: 2020/10/11
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <style>
        .q
        {
            position: relative;
            width: 100px;
            left: 717px;
            top: 10px;
            border: black;
            text-align: center;
            background-color: antiquewhite;

        }
    </style>
    <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<%--    <script type="text/javascript" src="js/no1.js"></script>--%>
</head>

<body>
<form>
    <table border="1px" align="center" width="400px">
        <tr height="50px"><td colspan="5" align="center"><h1>关键词信息列表</h1></td></tr>
        <c:forEach var="us" items="${list}">
            <tr height="40" align="center">
                <td>${us.id}</td>
                <td>${us.name}</td>
                <td>${us.type}</td>
                <td>${us.createDate}</td>
                <td>
<%--                <a href="keywordServlet?name=${us.name}&comm=del">删除</a>&nbsp;--%>
                    <a href="javascript:del('${us.name}')">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div class="q">
    <a href="add.jsp">添加关键词</a>&nbsp;
    </div>
</form>
<script type="text/javascript">

    function del(name) {
            alert(name);
            const aa = confirm("你确定要删除吗？");
            if (aa) {
                    location.href = "keywordServlet?&name=" + name + "&comm=del";
                }
        }
</script>
</body>
</html>
