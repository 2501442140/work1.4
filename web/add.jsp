<%--
  Created by IntelliJ IDEA.
  User: 崖子
  Date: 2020/10/11
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="keywordServlet" method="post" name="myform">
    <table align="center" width="500px" border="1">
        <tr height="40px" align="center">
            <td colspan="2"><strong>添加关键词</strong></td>
        </tr>
        <tr height="40px">
            <td align="right">关键词（*）</td>
            <td>
                <input type="text" name="name" value="" />
            </td>
        </tr>
        <tr height="40px">
            <td align="right">业务类型（*）</td>
            <td>
                <input type="text" name="type" value="" />
            </td>
        </tr>
        <tr height="40px">
            <td align="right">创建时间：</td>
            <td>
                <input type="text" name="createDate" value=""/>
            </td>
        </tr>
        <tr height="40px">
            <td></td>
            <td>
                <input type="submit" name="comm" value="添加"/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
