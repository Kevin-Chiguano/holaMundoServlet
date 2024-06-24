

package org.kevin.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//path o llave para poder enlazar al servlet
@WebServlet("/servlet")

public class Servlet extends HttpServlet {

    //Indicamos el metodo a utilizar en el servlet
    //si enviamos los datos mediante un link utilizamos get <a>,botones
    //si enviamos los datos por post si enviamos la invormacion por un formulario
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        //obtener parametros
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("kevin");
        String age = req.getParameter("123");

        //defino una variable de tipo PrintWriter
        //para mostrar contenido en pantalla
        out.println("!DOCTYPE html");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>HOLA MUNDO DESDE SERVLET</h1>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Age: " + age + "</p>");
        out.println("</body>");
        out.println("</html>");

    }
}
