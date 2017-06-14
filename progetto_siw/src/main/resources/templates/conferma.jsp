<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Conferma</h1>
<form action="controllerQuadro" method="get">
<br><li>Titolo:${titolo}</li><br/>
<br><li>Anno:${anno}</li><br/>
<br><li>Tecnica:${tecnica}</li><br/>
<br>Lunghezza:${lunghezza} ${luUnita}<br/>
<br><li>Larghezza:${larghezza}${laUnita}</li><br/>
<br><li>Autore:${autore}</li><br/>

<input type="submit" value="conferma" name="conferma">
</form>
</body>
</html>