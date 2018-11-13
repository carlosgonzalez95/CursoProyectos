<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="header.jsp"%>

<%
	if (session.getAttribute("Usuario") != null) {
		out.print("Bienvenido");
	}
%>

<%
	session.getAttribute("Usuario");
%>

<p>
	Usuario:<%=request.getParameter("username")%>
</p>
<p>
	Idioma:<%=request.getParameter("idioma")%>
</p>
<%@ include file="footer.jsp"%>