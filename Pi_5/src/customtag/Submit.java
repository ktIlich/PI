package customtag;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Submit extends TagSupport {

  static String htmlWrapStart = "<div class=\"row\">";
  static String htmlBtnSubmit = "<button id=\"btnSub\" type=\"submit\" class=\"btn_link submit_btn\">Submit</button>";
  static String htmlBtnReset = "<button id=\"btnRes\" type=\"reset\" class=\"btn_link reset_btn\">Reset</button>";
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
      out.print(htmlWrapStart + htmlBtnSubmit + htmlBtnReset + htmlWrapEnd);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return SKIP_BODY;
  }
}
