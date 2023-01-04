<%@page import="com.example.demo.entities.PlayerData"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding = "ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>

    </title>
    <link href="view/view.css" rel="stylesheet">
</head>
<header>
    Welcome to League Student DataBase
</header>

<body>
<div class="nav-container">
    <nav class="main-nav">
        <div class="home">
            <a href=".">Home</a>
        </div>
        <div class="show-data">
            <a href="showData">All Students</a>
        </div>

    </nav>
</div>

<p>
    Welcome to your student database.

</p>
<h1>
    Current Students
</h1>
<main>
    <%
    List<PlayerData> dataList = (List<PlayerData>)request.getAttribute("data");
        for(int i=0; i<dataList.size(); i++)
            {
            out.print("ID: " + dataList.get(i).getId() + "<br>");
            out.print("Name:" + dataList.get(i).getName() + "<br>");
            out.print("Role: " + dataList.get(i).getRole() + "<br>");
            out.print("<br>");
            }
    %>
</main>
</body>
</html>