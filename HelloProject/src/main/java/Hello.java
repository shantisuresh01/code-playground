import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Hello extends HttpServlet implements Servlet {
       
    public Hello() {}

/*
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Just a Simple Servlet</title></head>");
        out.println("<body>Hello from a simple Java Servlet</body>");
        out.println("</html>");
        out.close();
    }
*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
	String pageTitle = "Just a Simple Servlet";
	request.setAttribute("title", pageTitle);
	request.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
//	getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);
    }

}
