package ejemplos.servlet.curso;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // send HTML page to client
        out.println("<html>");
        out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"/resources/css/estilos.css\">");
        out.println("<body>");
        out.println("<h1>Ejemplo Servlet</h1>");
        out.println("<p>Este es un ejemplo en el curso de Java para generar HTML desde un Servlet.</p>");
        out.println("<form action=\"/myServlet2\" method=\"get\">");
        out.println("<label for=\"name\">Nombre:</label><br>");
        out.println("<input type=\"text\" id=\"name\" name=\"name\"><br>");
        out.println("<label for=\"date\">Fecha:</label><br>");
        out.println("<input type=\"date\" id=\"date\" name=\"date\"><br>");
        out.println("<input type=\"submit\" value=\"Enviar\">");
        out.println("</form>");
        out.println("</body></html>");
    }

}