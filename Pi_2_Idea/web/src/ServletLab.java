import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletLab extends HttpServlet implements Servlet {

  public ServletLab() {
    super();
    System.out.println("ServletLab:constructor");

  }

  public void init(ServletConfig sc) throws ServletException {
// инициализация сервлета
    super.init();
    System.out.println("ServletLab:init");

  }

  public void destroy() {
// перед уничтожением сервлета
    super.destroy();
    System.out.println("ServletLab:destroy");

  }

 /* protected void service(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {
// обработка http-запроса
    PrintWriter out = rs.getWriter();
    System.out.println("ServletLab:service: " + rq.getMethod());
    out.println("ServletLab: service: " + rq.getMethod());
    out.println("ServletLab: remoteHost: " + rq.getRemoteHost());
    out.println("ServletLab: serverName: " + rq.getServerName());
  }*/


  protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {
    String firstname = rq.getParameter("firstname");
    String lastname = rq.getParameter("lastname");

    rs.setContentType("text/html");
    PrintWriter pw = rs.getWriter();

    pw.println("ServletLab:constructor");
    pw.println("ServletLab:init");
    pw.println("ServletLab:destroy");

    System.out.println("Servlet : doGet : firstname = " + firstname);
    System.out.println("Servlet : doGet : lastname= " + lastname);

    StringBuffer requestURL = rq.getRequestURL();
    if (rq.getQueryString() != null) {
      requestURL.append("?").append(rq.getQueryString());
    }
    String completeURL = requestURL.toString();

    pw.println("<html><body>"
        + "<br>servlet : doGet : firstname = " + firstname
        + "<br>servlet : doGet : lastname = " + lastname
        + "<br>servlet : " + completeURL
        + "<br>servlet : getRemoteHost: " + rq.getRemoteHost()
        + "<br>servlet : getServletPath: " + rq.getServletPath()
        + "<br>servlet : getServerName: " + rq.getServerName()
        + "<br>servelt : rq.getContextPath: " + rq.getContextPath()
        + "</body></html>");
    pw.close();
  }


  protected void doPost(HttpServletRequest rq, HttpServletResponse rs)
      throws ServletException, IOException {
    String firstname = rq.getParameter("firstname");
    String lastname = rq.getParameter("lastname");

    rs.setContentType("text/html");
    PrintWriter pw = rs.getWriter();

    pw.println("ServletLab:constructor");
    pw.println("ServletLab:init");
    pw.println("ServletLab:destroy");

    System.out.println("Servlet : doPost : firstname = " + firstname);
    System.out.println("Servlet : doPost : lastname= " + lastname);

    pw.println("<html><body>"
        + "<br>servlet : doPost : firstname = " + firstname
        + "<br>servlet : doPost : lastname = " + lastname
        + "<br>servlet : getRemoteHost: " + rq.getRemoteHost()
        + "<br>servlet : getServletPath: " + rq.getServletPath()
        + "<br>servlet : getServerName: " + rq.getServerName()
        + "<br>servelt : rq.getContextPath: " + rq.getContextPath()
        + "</body></html>");
    pw.close();
  }
}
