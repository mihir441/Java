import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class Ass4Seta1 extends HttpServlet
{
    public void doGet(HttpServletRequest req , HttpServletResponse res)throws IOException , ServletException
    { 
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html><body><h2>Information About Http Request </h2>");
        pw.println("<br>Server Name:"+req.getServerName());
        pw.println("<br>Port Number:"+req.getServerPort());
        pw.println("<br>IP Address:"+req.getRemoteAddr());
        pw.println("<br>Servlet Path:"+req.getServletPath());
        pw.println("<br>Client Browser:"+req.getHeader("User-Agent"));
        pw.println("</body></html>");
        pw.close();
     }
}
