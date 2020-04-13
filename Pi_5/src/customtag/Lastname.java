package customtag;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Lastname extends TagSupport {

  static String htmlWrapStart = "<div class=\"row\">\n";
  static String htmlLabel = "<label for=\"lastname\">Last name</label>\n";
  static String htmlInput = "<input type=\"text\" id=\"lastname\" name=\"lastname\" class=\"input_field\" placeholder=\"Kot\" value=\"";
  static String htmlWrapEnd = "</div>";

  String value = "";

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public int doStartTag() {
    JspWriter out = pageContext.getOut();

    try {
      out.print(htmlWrapStart + htmlLabel + htmlInput + value + "\">" + htmlWrapEnd);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return SKIP_BODY;
  }
}
