<%@ page import="java.util.*, java.io.*, javax.servlet.*, javax.servlet.http.*" %>

<html>

	<b><%out.println("Today's Date:");%> <%= new Date() %></b><br>
	<b><%out.println("Browser: ");%><%=request.getHeader("User-Agent")%></b><br>
	<b><%Cookie c1=new Cookie("c1","1");response.addCookie(c1);%><%out.println("Cookie is added");%></b><br>
	<b><%out.println("Config: ");%><%out.println(config.getServletName());%></b><br>
	<b><%out.println("sessionID: ");%><%out.println(session.getId());%></b><br>
	<b><%out.println("Aplication: ");%><%out.println(application.getServerInfo());%></b><br>
</html>
