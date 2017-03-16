<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
hello

${headerMessage}
<form action="/AdmissionForm" method="post">
    <p>
        Student name: <input type="text" name="name"/>
    </p>
    <p>
        Student hobby: <input type="text" name="hobby"/>
    </p>

    <p>
        Student phone number: <input type="number" name="number"/>
    </p>
    <input type="submit" value="To submit click here"/>
</form>
</body>
</html>
