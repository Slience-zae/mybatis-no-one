<%--
  Created by IntelliJ IDEA.
  User: Zae
  Date: 2020/3/23
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>HELLO WORD</h2>
    <!-- 由于上传文件，数据类型是复合类型，所以enctype="multipart/form-data -->
    单文件上传<br/><br/>
    <form action="/uploadFile" method="post" enctype="multipart/form-data">
        <input type="file" name="multipartFile">
        <input type="submit" value="上传">
    </form>

    多文件上传<br/><br/>
    <form action="/uploadFiles" method="post" enctype="multipart/form-data">
        <!-- 上传多个文件，用List<MultipartFile> pic接收 -->
        <input type="file" name="pic[0]"><br/><br/>
        <input type="file" name="pic[1]"><br/><br/>
        <input type="file" name="pic[2]"><br/><br/>
        <input type="file" name="pic[3]"><br/><br/>
        <input type="submit" value="多文件上传">
    </form>

    文件下载<br/>
    <a href="/download?filename=19088572-7e11-4a83-aa08-b006327e607f.jpg">点击下载资源</a>
</body>
</html>
