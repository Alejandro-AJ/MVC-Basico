import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;


public class Controlador1 extends HttpServlet
{

  public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {

    String nombre=request.getParameter("nombre");
    String proc=request.getParameter("proc");
    String peso=request.getParameter("peso");
    double pesoD=Double.parseDouble(peso);
    String altura=request.getParameter("altura");
    double alturaD=Double.parseDouble(altura);
    double imc=pesoD/(alturaD*alturaD);
    request.setAttribute("NOMBRE",nombre+".");
    request.setAttribute("PROCEDENCIA",proc);
    request.setAttribute("IMC",imc);
    RequestDispatcher vista=request.getRequestDispatcher("./Salida.jsp");
    vista.forward(request,response);

  }

}
