<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>pagina de login</h2>
    <form method="POST" action="LoginServlet">
        <p>
                <label for="txtUsername">Nombre de usuario</label>
                <input type="txt" id="txtUsername" name="txtUsername">
        </p>
   <p>
       <label for="txtPassword">Contraseña</label>
       <input type="password" id="txtPassword" name="txtPassword">
   </p>
   <p>
        <input type="submit" value="login">
   </p>
       
    </form>
</body>
</html>