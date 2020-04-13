package customtag;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Dossier extends TagSupport {

  static String htmlFormStart_1 = "<form action=\"";
  static String htmlFormStart_2 = "\" class=\"form\" method=\"POST\">";
  static String htmlFieldsetStart = "<fieldset>";
  static String htmlLeg = "<legend class=\"form_header\">Pi lab 5</legend>";
  static String htmlFormEnd = "</fieldset>" +
      "</form>";

  String action = "";

  public String getAction() {
    return action;
  }

  public void setAction(String value) {
    this.action = value;
  }

  @Override
  public int doStartTag() {
    JspWriter out = pageContext.getOut();

    try {
      out.print(htmlFormStart_1 + action + htmlFormStart_2 + htmlFieldsetStart + htmlLeg);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return EVAL_BODY_INCLUDE;
  }

  @Override
  public int doEndTag() {
    JspWriter out = pageContext.getOut();

    try {
      out.print(htmlFormEnd);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return EVAL_BODY_INCLUDE;
  }
}
