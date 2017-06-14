<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>inserimento Quadro</title>
</head>
<body>

<h1><strong>Inserisci quadro</strong></h1>
	<form action="controllerQuadro" method="get">
		<br><li>    Titolo:<input type="text" name="titolo" value="${quadro.titolo}">${erroreTitolo}</li><br/>
		<br><li>      Anno:<input type="text" name="anno" value="${quadro.anno}">${erroreAnno}</li><br/>
		<br><li>   Tecnica:<input type="text" name="tecnica" value="${quadro.tecnica }">${erroreTecnica}<li><br/>
		<br><li>Lunghezza:<input type="text" name="lunghezza" value= "${quadro.lunghezza}">
								<select name ="luUnita">
											<option value="mm" >mm</option>
											<option value="cm" >cm</option>
											<option value="dm" >dm</option>
											<option value="m" >m</option>
		</select>${erroreLunghezza}</li><br/>
		<br><li>Larghezza:<input type="text" name="larghezza" value= "${quadro.larghezza}">
							<select name ="laUnita">
											<option value="mm" >mm</option>
											<option value="cm" >cm</option>
											<option value="dm" >dm</option>
											<option value="m" >m</option>
											
		</select>${erroreLarghezza}</li><br/>
		<br><li>    Autore:<input  type="text" name="autore" value= "${quadro.autore}">${erroreAutore}</li><br/>
		<input type="submit" value="inserisci" name="inserisci">	
	</form>

</body>
</html>