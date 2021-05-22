<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1>Create</h1>
<div class="w3-container">
    <form action="/create" method="post">
        <div>
            <label>Name</label>
            <input name="name" type="text">
        </div>
        <div>
            <label>Wage</label>
            <input name="wage" type="text">
        </div>
        <input type="submit" class="btn btn-success" value="Save"/>
    </form>
</div>

</body>
</html>