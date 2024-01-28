package ejemplos.servlet.curso;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String fecha = request.getParameter("date");

        // send HTML page to client
        out.println("<html>");
        out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"/resources/css/estilos.css\">");
        out.println("<body>");
        out.println("<h3>" + fecha + "</h3>");
        out.println("<h1>Bienvenida " + name + "!</h1>");
        out.println("</body></html>");
    }

}