<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" rel="stylesheet">
<title>Calculo Formas Geometrica</title>
</head>
<body>
	<body>
    <div class="container">
        <div class="calculadora">
            <div class="row">
                <div class="titulo col-12">
                    <strong>Calculadora Geométrica</strong>
                </div>
            </div>

             <form method="post" action="MMRExercicio5">
                <div class="row">
                    <div class="calculo col-12">
                        <div class="col-12">Lado A:</div>
                        <input type="number" name="ladoA"> <br><br>
                        <div class="col-12">Lado B:</div>
                        <input type="number" name="ladoB"> <br><br>
    					<div class="col-12">Lado C:</div>
                        <input type="number" name="ladoC">
                        <div>
                            <button type="reset"  style="background-color: rgb(110, 120, 255)">Limpar</button>
                            <button type="submit">Enviar</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
	
</body>
</html>