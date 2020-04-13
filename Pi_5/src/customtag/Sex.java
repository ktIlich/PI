package customtag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Sex extends TagSupport {

  static String htmlRowStart = "<div class=\"row row_rad\">";
  static String htmlWrapStart = "<div class=\"radio_wrapper\">";
  static String htmlRadBtn_1 = "<input type=\"radio\" id=\"male\"\n name=\"sex\" value=\"male\" class=\"radio_btn\" checked>";
  static String htmlLabel_1 = "<label for=\"male\">Male</label>";
  static String htmlWrapEnd = "</div>";
  static String htmlRowEnd = "</div>";

  static String htmlRadBtn_2 = "<input type=\"radio\" id=\"female\"\n name=\"sex\" value=\"female\" class=\"radio_btn\">";
  static String htmlLabel_2 = "<label for=\"female\">Female</label>";

  public int doStartTag() {
    JspWriter out = pageContext.getOut();

    try {
      out.print( htmlRowStart + htmlRowStart + htmlRadBtn_1 + htmlLabel_1 + htmlWrapEnd + htmlWrapStart + htmlRadBtn_2 + htmlLabel_2 + htmlWrapEnd + htmlRowEnd );
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return SKIP_BODY;
  }
}
