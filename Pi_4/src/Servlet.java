import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Scanner;


public class Servlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //Task 11
    /*  Calendar calendar = Calendar.getInstance();
    int hour = calendar.get(Calendar.HOUR_OF_DAY);

    String page = hour < 6 ? "night.jsp" : hour < 12 ? "morning.jsp" : hour < 18 ? "afternoon.jsp" : "evening.jsp";


    RequestDispatcher rd = null;
    rd = request.getRequestDispatcher("/"+page);
    rd.forward(request, response);*/

    //Task 12
    /*Calendar calendar = Calendar.getInstance();
    int hour = calendar.get(Calendar.HOUR_OF_DAY);

    String page = hour < 6 ? "night.jsp" : hour < 12 ? "morning.jsp" : hour < 18 ? "afternoon.jsp" : "evening.jsp";

    PrintWriter pw = response.getWriter();

    String uri =  "http://localhost:8080/Pi_4_war_exploded/" + page;

    CloseableHttpClient httpclient = HttpClients.createDefault();
    HttpGet httpget = new HttpGet(uri);

    HttpResponse httpresponse = httpclient.execute(httpget);

    Scanner sc = new Scanner(httpresponse.getEntity().getContent());

    pw.println(httpresponse.getStatusLine());
    while(sc.hasNext()) {
      pw.println(sc.nextLine());
    }

    pw.close();*/


    //Task 13
    Calendar calendar = Calendar.getInstance();
    int hour = calendar.get(Calendar.HOUR_OF_DAY);

    String page = hour < 6 ? "night.jsp" : hour < 12 ? "morning.jsp" : hour < 18 ? "afternoon.jsp" : "evening.jsp";

    PrintWriter pw = response.getWriter();

    String uri =  "http://localhost:8080/Pi_4_war_exploded/" + page;

    CloseableHttpClient httpclient = HttpClients.createDefault();
    HttpPost httppost = new HttpPost(uri);

    pw.println(httppost.getMethod());

    HttpResponse httpresponse = httpclient.execute(httppost);

    Scanner sc = new Scanner(httpresponse.getEntity().getContent());

    pw.println(httpresponse.getStatusLine());
    while(sc.hasNext()) {
      pw.println(sc.nextLine());
    }

    pw.close();
  }
}
