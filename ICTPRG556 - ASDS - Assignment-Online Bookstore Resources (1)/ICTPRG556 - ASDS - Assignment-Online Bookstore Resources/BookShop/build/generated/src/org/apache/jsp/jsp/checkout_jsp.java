package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utility.AdmitBookStoreDAO;
import model.*;
import java.util.*;
import java.text.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Order</title>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");

    AdmitBookStoreDAO AdmitBookStoreDAO = new AdmitBookStoreDAO();
    List<Book> books = AdmitBookStoreDAO.getAllBooks();
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("         <c:set var=\"totalCostOfOrder\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${0.0}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("        <h1 class = \"bigFont\" align=\"center\"><font face=\"Georgia, Times New Roman, Times, serif\">Shopping \r\n");
      out.write("            Cart Check Out</font></h1>\r\n");
      out.write("\r\n");
      out.write("        <form method = \"post\" Action = \"jsp/thankyou.jsp\">\r\n");
      out.write("            <input type=\"hidden\" name=\"Action\" value=\"validate_credit\">\r\n");
      out.write("            <p style = \"font-weight: bold\">&nbsp; </p>\r\n");
      out.write("            <table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"1\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td bgcolor=\"#CCCCCC\"> \r\n");
      out.write("                        <h3 align=\"left\">You have selected to purchase the following Items</h3>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("              <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty cart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"entry\">\r\n");
      out.write("                    <c:set var=\"item\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entry.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                    <c:set var=\"cost\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.orderCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                    <c:set var=\"totalCostOfOrder\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalCostOfOrder + cost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td bgcolor=\"#F0F0F0\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </c:forEach>\r\n");
      out.write("        ``````</c:if>\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("     \r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("            <p style = \"font-weight: bold\">Please input the following information.</p>\r\n");
      out.write("\r\n");
      out.write("            <!-- table of form elements -->\r\n");
      out.write("\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td class = \"right bold\">First name:</td>\r\n");
      out.write("                    <td> \r\n");
      out.write("                        <input type = \"text\" name = \"firstname\" \r\n");
      out.write("                               size = \"25\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td class = \"right bold\">Last name:</td>\r\n");
      out.write("                    <td> \r\n");
      out.write("                        <input type = \"text\" name = \"lastname\" \r\n");
      out.write("                               size = \"25\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td class = \"right bold\">Street:</td>\r\n");
      out.write("                    <td> \r\n");
      out.write("                        <input type = \"text\" name = \"street\" size = \"25\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td class = \"right bold\">City:</td>\r\n");
      out.write("                    <td> \r\n");
      out.write("                        <input type = \"text\" name = \"city\" size = \"25\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td class = \"right bold\">State:</td>\r\n");
      out.write("                    <td> \r\n");
      out.write("                        <input type = \"text\" name = \"state\" size = \"2\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td class = \"right bold\">Zip code:</td>\r\n");
      out.write("                    <td> \r\n");
      out.write("                        <input type = \"text\" name = \"zipcode\" \r\n");
      out.write("                               size = \"10\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td class = \"right bold\">Phone #:</td>\r\n");
      out.write("                    <td> ( \r\n");
      out.write("                        <input type = \"text\" name = \"phone\" size = \"3\" />\r\n");
      out.write("                        ) \r\n");
      out.write("                        <input type = \"text\" name = \"phone2\" \r\n");
      out.write("                               size = \"3\" />\r\n");
      out.write("                        - \r\n");
      out.write("                        <input type = \"text\" name = \"phone3\" size = \"4\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td class = \"right bold\">Credit Card #:</td>\r\n");
      out.write("                    <td> \r\n");
      out.write("                        <input type = \"text\" name = \"card_num\" \r\n");
      out.write("                               size = \"25\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td class = \"right bold\">Expiration (mm/yy):</td>\r\n");
      out.write("                    <td> \r\n");
      out.write("                        <input type = \"text\" name = \"expires\" \r\n");
      out.write("                               size = \"2\" />\r\n");
      out.write("                        / \r\n");
      out.write("                        <input type = \"text\" name = \"expires2\" \r\n");
      out.write("                               size = \"2\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class = \"right bold\">Order Amount $</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"text\" name=\"amount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalOrderInDollars}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("            <!-- enable user to submit the form  -->\r\n");
      out.write("            <p><input type = \"submit\" value = \"Submit\" /></p>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
