package org.kevin.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servletParametros")

public class ParametrosGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        String saludo= req.getParameter("saludo");
        String edad= req.getParameter("saludo");
        double iva = Double.parseDouble(req.getParameter("iva"));
        boolean status = Boolean.parseBoolean(req.getParameter("status"));
      //  Double valor= Double.parseDouble("valor");S
        out.println("<h1>Parametro get</h1>"+saludo+" "+edad);
        out.println("<h2>Parametro get</h2>"+edad+iva);
        out.println("<h3>Parametro get</h3>"+status);
    }

    
}
