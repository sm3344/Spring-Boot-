
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding = "ISO-8859-1"%>

<!DOCTYPE html>
<!-- Home Page -->
<html>
<head>
    <meta charset="ISO-8859-1">
    <title >
        League Student DataBase
    </title>
    <link href="view/index.css" rel="stylesheet">
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
    Welcome, I am a League player ever since 2012 and I have taught a total of 6 students to start and progress in this game.
    This website is created so I can organize all the students I have taught because I am thinking of helping more people
    get into this game that isn't just my friends. This database is useful when I have too many students to remember and
    need to organize or search my students by name, id or roles.

</p>



<main>

    <form action="/saveData" method ="post">
        <label>Add New Player </label><br>
        <label>Input name: </label>
        <input type="text" name="name"><br>
        <label>Input role: </label>
        <input type="text" name="role"><br>
        <input type="submit" value ="Save">
    </form>
    <br>
    <form action="/searchData" method ="post">
        <label>Search Player </label><br>
        <label>Input name: </label>
        <input type="text" name="id"><br>
        <input type="submit" value ="Save">
    </form>
    <br>

    <form action="/deleteData" method ="post">
        <label>Delete Player </label><br>
        <label>Input ID: </label>
        <input type="text" name="id"><br>
        <input type="submit" value ="Delete">
    </form>
    <br>
    <form action="/updateData" method ="post">
        <label>Update Player </label><br>
        <label>Input name: </label>
        <input type="text" name="name"><br>
        <label>Update Role</label>
        <input type="text" name="role"><br>
        <input type="submit" value ="Update">
    </form>
</main>

</body>
</html>