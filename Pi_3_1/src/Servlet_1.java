import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servlet_1 extends HttpServlet implements Servlet {

/*  //zad 1
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    String name = rq.getParameter("name");
    System.out.println("Servlet_1 doGet ");
    RequestDispatcher rd = null;
    PrintWriter pw = rs.getWriter();
    String param = "name=" + name;
    rd = rq.getRequestDispatcher("/servlet_2?" + param);
    rd.forward(rq, rs);
  }*/


/*  //zad 2
  protected void service(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    if( rq.getMethod().equals( "POST" ) ) {
      System.out.println("Servlet_1 post ");

      String name = rq.getParameter("name");
      String password = rq.getParameter("password");
      String sex = rq.getParameter("sex");

      System.out.println("Servlet_1: doPost : name = " + name);
      System.out.println("Servlet_1: doPost : password = " + password);
      System.out.println("Servlet_1: doPost : sex = " + sex);

      RequestDispatcher rd = null;
      String param = "name=" + name + "&password=" + password + "&sex=" + sex;
      rd = rq.getRequestDispatcher("/servlet_2?" + param);
      rd.forward(rq, rs);
    }
  }*/


 /* //zad 3
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    System.out.println("Servlet_1 doGet ");
    RequestDispatcher rd = null;
    rd = rq.getRequestDispatcher("/address.html");
    rd.forward(rq, rs);
  }*/

/*  //zad 4
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    String name = rq.getParameter("name");
    System.out.println("Servlet_1 doGet ");
    RequestDispatcher rd = null;
    PrintWriter pw = rs.getWriter();
    String param = "name=" + name;
    rd = rq.getRequestDispatcher("/servlet_2?" + param);
    rd.forward(rq, rs);
  }*/


/*
  //zad 5
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    String name = rq.getParameter("name");
    System.out.println("Servlet_1 doGet ");
    RequestDispatcher rd = null;
    PrintWriter pw = rs.getWriter();
    String param = "name=" + name;
    pw.println("Servlet_1 before");
    rd = rq.getRequestDispatcher("/servlet_2?" + param);
    rd.forward(rq, rs);
    pw.println("Servlet_1 after");
  }
*/


/*
  //zad 6-1
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    String name = rq.getParameter("name");
    System.out.println("Servlet_1 doGet ");


    PrintWriter pw = rs.getWriter();
    String param = "name=" + name;

    String path = rq.getContextPath() + "/servlet_2?" + param;
    rs.sendRedirect(path);
  }*/


/*
  //zad 6-2
  protected void service(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    String path = "";

    if (rq.getMethod().equals("POST")) {
      System.out.println("Servlet_1 post ");

      String name = rq.getParameter("name");
      String password = rq.getParameter("password");
      String sex = rq.getParameter("sex");

      System.out.println("Servlet_1: doPost : name = " + name);
      System.out.println("Servlet_1: doPost : password = " + password);
      System.out.println("Servlet_1: doPost : sex = " + sex);

      path = "http://localhost:8080/Pi_3_1_war_exploded/servlet_2";
      rs.sendRedirect(path);
    }
  }
*/


  /*//zad 6-3
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    System.out.println("Servlet_1 doGet ");

    String path = rq.getContextPath() + "/address.html";
    rs.sendRedirect(path);
  }*/


   /*//zad 6-4
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    String name = rq.getParameter("name");
    System.out.println("Servlet_1 doGet ");
    RequestDispatcher rd = null;
    PrintWriter pw = rs.getWriter();
    String param = "name=" + name;

    String path = rq.getContextPath() + "/servlet_2?" + param;
    rs.sendRedirect(path);
  }*/


  /*//zad 6-5
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    String name = rq.getParameter("name");
    System.out.println("Servlet_1 doGet ");
    PrintWriter pw = rs.getWriter();
    String param = "name=" + name;
    pw.println("Servlet_1 before");
    String path = rq.getContextPath() + "/servlet_2?" + param;
    rs.sendRedirect(path);
    pw.println("Servlet_1 after");
  }*/

/*  //zad 7
  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {

    String name = rq.getParameter("name");
    System.out.println("Servlet_1 doGet httpclient");
    String param = "name=" + name;

    PrintWriter pw = rs.getWriter();
    pw.println("Servlet_1 doGet httpclient");

    String uri =  "http://localhost:8080/Pi_3_0_war_exploded/servlet_2?" + param;

    CloseableHttpClient httpclient = HttpClients.createDefault();
    HttpGet httpget = new HttpGet(uri);

    HttpResponse httpresponse = httpclient.execute(httpget);

    Scanner sc = new Scanner(httpresponse.getEntity().getContent());

    pw.println(httpresponse.getStatusLine());
    while(sc.hasNext()) {
      pw.println(sc.nextLine());
    }

    pw.close();
  }*/


  //zad 8
  protected void doPost(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {
    PrintWriter pw = rs.getWriter();
    pw.println("Servlet_1 post httpclient");
    System.out.println("Servlet_1 post");

    String name = rq.getParameter("name");
    String password = rq.getParameter("password");
    String sex = rq.getParameter("sex");

    System.out.println("Servlet_1: doPost : name = " + name);
    System.out.println("Servlet_1: doPost : password = " + password);
    System.out.println("Servlet_1: doPost : sex = " + sex);

    String uri = "http://localhost:8080/Pi_3_0_war_exploded/servlet_2";

    CloseableHttpClient httpclient = HttpClients.createDefault();
    HttpPost httppost = new HttpPost(uri);

    List<NameValuePair> nameValuePairList = new ArrayList<>();
    nameValuePairList.add(new BasicNameValuePair("name",name));
    nameValuePairList.add(new BasicNameValuePair("password",password));
    nameValuePairList.add(new BasicNameValuePair("sex",sex));

    httppost.setEntity(new UrlEncodedFormEntity(nameValuePairList));

    HttpResponse httpresponse = httpclient.execute(httppost);

    Scanner sc = new Scanner(httpresponse.getEntity().getContent());

    pw.println(httpresponse.getStatusLine());
    while(sc.hasNext()) {
      pw.println(sc.nextLine());
    }

    pw.close();
  }

}
