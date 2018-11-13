<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet" href="css/header.css" type="text/css">
<link>
<h3>Login</h3>
<%
	session.setAttribute("nombre", null);
%>
<p align="right">
<FORM NAME="FORMlog" METHOD="POST" ACTION="DemoServlets">
	NOMBRE USUARIO: <INPUT TYPE=text NAME="username" SIZE="25">
	CONTRASEÑA: <INPUT TYPE=password NAME="pwd" SIZE="25"> <select
		name="idioma">
		<option value="EspaNol">Espanol</option>
		<option value="Ingles">Ingles</option>
	</select> <INPUT TYPE=SUBMIT VALUE="Iniciar sesion">
</FORM>
</p>
