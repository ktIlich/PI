<%@ page import="jspclass.JspTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%!

    /*Task 1*/
    String pageTitle = "Pi Lab 4";
    JspTime jspTime = new JspTime();
    int hour = jspTime.getHour();

    protected String salutation(int hour) {
        String result = "Good ";
        if ((hour > 0) && (hour <= 5))
            result += "night";
        else if ((hour > 5) && (hour <= 12))
            result += "morning";
        else if ((hour > 12) && (hour <= 17))
            result += "afternoon";
        else
            result += "evening";
        return result;
    }

    /*Task 2*/
    String table = null;

    protected String nextWeekTable(Integer CountString) {
        table = "<table class=\"timeTable\">";
        table += "<tr> <td>" + jspTime.getCurrentDate() + "</td>";
        table += " <td>" + jspTime.getDayOfWeek() + "</td></tr>";

        for (int i = 1; i < CountString; i++) {
            table += "<tr> <td>" + jspTime.addDays(1) + "</td>";
            table += " <td>" + jspTime.getDayOfWeek() + "</td></tr>";
        }
        table += "</table>";
        return table;
    }
%>

<html lang="en">
<head>
    <title><%= pageTitle %>
    </title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
    <h1 class="header"><%=salutation(hour)%>
    </h1>
    <%= nextWeekTable(7)%>

    <form>
        <button type="submit" name="task_5" class="btn_link" value="press(include)">include</button>

        <button type="submit" name="task_6" class="btn_link" value="press(jsp:include)">jsp:include</button>

        <button type="submit" name="task_8" class="btn_link" value="press(jsp:forward)">forward</button>

        <a href="servlet" class="links">Call Servlet</a>
        
    <%
        if ("press(include)".equals(request.getParameter("task_5"))) {
            if ((hour >= 0) && (hour <= 5)) { %>
    <jsp:include page="night.jsp"/>
    <%
    } else if ((hour > 5) && (hour <= 12)) { %>
    <jsp:include page="morning.jsp"/>
    <%
    } else if ((hour > 12) && (hour <= 17)) { %>
    <jsp:include page="afternoon.jsp"/>
    <%
    } else { %>
    <jsp:include page="evening.jsp"/>
    <%
            }
        }
    %>


    <%
        if ("press(jsp:include)".equals(request.getParameter("task_6"))) {
            if ((hour >= 0) && (hour <= 5)) { %>
    <jsp:include page="night.jsp"/>

    <%
    } else if ((hour > 5) && (hour <= 12)) { %>
    <jsp:include page="morning.jsp"/>
    <%-- <jsp:include page="afternoon">
        <jsp:param name="hour" value="<%= jspTime.getHour().toString() %>"/>
    </jsp:include>--%>
        <%--<jsp:include page="afternoon"/>--%>
    <%
    } else if ((hour > 12) && (hour <= 17)) { %>
    <jsp:include page="afternoon.jsp"/>
    <%--task 7--%>
    <%
    } else { %>
    <jsp:include page="evening.jsp"/>

    <%
            }
        }
    %>



    <%
        if ("press(jsp:forward)".equals(request.getParameter("task_8"))) {
            if ((hour >= 0) && (hour <= 5)) { %>
    <jsp:include page="night.jsp"/>
    <%
    } else if ((hour > 5) && (hour <= 12)) { %>
    <jsp:include page="morning.jsp"/>
    <%
    } else if ((hour > 12) && (hour <= 17)) { %>
    <jsp:include page="afternoon.jsp"/>
    <%
    } else { %>
    <jsp:include page="evening.jsp"/>
    <%
            }
        }
    %>


    </form>
</div>
</body>
</html>
