import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Servlet_2 extends HttpServlet implements Servlet {

/*
  //zad 1
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {
    System.out.println("Servlet_2 doGet ");
    PrintWriter pw = rs.getWriter();
    String param = rq.getParameter("name");
    pw.println("Servlet_2 doGet");
    pw.println(param);
    pw.close();
  }
*/

/*
  //zad 2 / 6-2
  protected void doPost(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {
    String name = rq.getParameter("name");
    String password = rq.getParameter("password");
    String sex = rq.getParameter("sex");

    rs.setContentType("text/html");
    PrintWriter pw = rs.getWriter();

    System.out.println("Servlet_2: doPost : name = " + name);
    System.out.println("Servlet_2: doPost : password = " + password);
    System.out.println("Servlet_2: doPost : sex = " + sex);

    pw.println("<html><body>"
        + "<br>servlet_2 : doPost : name = " + name
        + "<br>servlet_2 : doPost : password = " + password
        + "<br>servlet_2 : doPost : sex = " + sex
        + "<br>servlet_2 : getServletPath: " + rq.getServletPath()
        + "</body></html>");
    pw.close();
  }
*/

/*
  //zad 4
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    System.out.println("Servlet_2 doGet ");
    RequestDispatcher rd = null;
    rd = rq.getRequestDispatcher("/address.html");
    rd.forward(rq, rs);
  }
*/

/*
  //zad 5 / 6-5
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {
    System.out.println("Servlet_2 doGet ");
    PrintWriter pw = rs.getWriter();
    pw.println("Servlet_2 doGet");
    pw.println("Servlet_2 before");
    String param = rq.getParameter("name");
    pw.println("Servlet_2 after");
    pw.println(param);
    pw.close();
  }*/

/*  //zad 6-1
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {
    System.out.println("Servlet_2 doGet ");
    PrintWriter pw = rs.getWriter();
    String param = rq.getParameter("name");
    pw.println("Servlet_2 doGet");
    pw.println(param);
    pw.close();
  }*/


  /*//zad 6-4
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    System.out.println("Servlet_2 doGet ");
    String path = rq.getContextPath() + "/address.html";
    rs.sendRedirect(path);
  }*/

  /*//zad 7
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {
    System.out.println("Servlet_2 doGet ");
    PrintWriter pw = rs.getWriter();
    String param = rq.getParameter("name");

    pw.println(param);
    pw.close();
  }*/

  //zad 8
  protected void doPost(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {
    String name = rq.getParameter("name");
    String password = rq.getParameter("password");
    String sex = rq.getParameter("sex");

    PrintWriter pw = rs.getWriter();
    System.out.println("Servlet_2: doPost : name = " + name);
    System.out.println("Servlet_2: doPost : password = " + password);
    System.out.println("Servlet_2: doPost : sex = " + sex);

    pw.println("name = " + name);
    pw.println("password = " + password);
    pw.println("sex = " + sex);

    pw.close();
  }
}