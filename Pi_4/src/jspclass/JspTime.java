package jspclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JspTime {

  protected SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
  protected Date date = new Date();

  Calendar calendar;

  public JspTime() {
    this.calendar = Calendar.getInstance();
  }

  public JspTime(Calendar calendar) {
    this.calendar = calendar;
  }

  public Integer getHour() {
    return ((Integer) calendar.get(Calendar.HOUR_OF_DAY));
  }

  public String getCurrentDate() {
    return simpleDateFormat.format(calendar.getTime());
  }

  public Integer getDayOfWeek() {
    int day = calendar.get(Calendar.DAY_OF_WEEK) - 1;
    if (day == 0) {
      return 7;
    } else {
      return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }
  }

  public String addDays(int i) {
    calendar.add(Calendar.DAY_OF_WEEK, i);
    return simpleDateFormat.format(calendar.getTime());
  }
}
