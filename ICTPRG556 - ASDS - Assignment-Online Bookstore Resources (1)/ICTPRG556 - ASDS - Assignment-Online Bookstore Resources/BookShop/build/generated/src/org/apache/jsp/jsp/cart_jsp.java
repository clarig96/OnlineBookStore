package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utility.AdmitBookStoreDAO;
import model.*;
import java.util.*;
import java.text.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Untitled Document</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    AdmitBookStoreDAO AdmitBookStoreDAO = new AdmitBookStoreDAO();
    List<Book> books = AdmitBookStoreDAO.getAllBooks();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" text=\"#000000\">\r\n");
      out.write("       <c:set var=\"cart\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("       <c:set var=\"books\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.books}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("       <c:set var=\"totalCostOfOrder\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalCostOfOrder + item.orderCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("<h2 align=\"center\"><b>The followings Items are in your shopping cart </b></h2>\r\n");
      out.write("<form name=\"form1\" method=\"post\" Action=\"./books\">\r\n");
      out.write("<input type=\"hidden\" name=\"Action\" value=\"update_cart\">\r\n");
      out.write("  <table width=\"100%\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\" height=\"98\">\r\n");
      out.write("    <tr> \r\n");
      out.write("      <td width=\"13%\" bgcolor=\"#CCCCCC\"> \r\n");
      out.write("        <div align=\"center\"><font face=\"Arial, Helvetica, sans-serif\" size=\"3\">ISBN</font></div>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td width=\"34%\" bgcolor=\"#CCCCCC\"> \r\n");
      out.write("        <div align=\"center\"><font face=\"Arial, Helvetica, sans-serif\" size=\"3\">Title</font></div>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td width=\"13%\" bgcolor=\"#CCCCCC\"> \r\n");
      out.write("        <div align=\"center\"><font face=\"Arial, Helvetica, sans-serif\" size=\"3\">Price/unit</font></div>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td width=\"9%\" bgcolor=\"#CCCCCC\"> \r\n");
      out.write("        <div align=\"center\"><font face=\"Arial, Helvetica, sans-serif\" size=\"3\">Quantity</font></div>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td width=\"20%\" bgcolor=\"#CCCCCC\"> \r\n");
      out.write("        <div align=\"center\"><font face=\"Arial, Helvetica, sans-serif\" size=\"3\">Subtotal</font></div>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td width=\"11%\" bgcolor=\"#CCCCCC\"> \r\n");
      out.write("        <div align=\"center\"><font face=\"Arial, Helvetica, sans-serif\" size=\"3\">Remove</font></div>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write(" \r\n");
      out.write("     <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty cart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("        <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"item\">\r\n");
      out.write("              <tr bgcolor=\"#F0F0F0\"> \r\n");
      out.write("                <td width=\"13%\" height=\"5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                <td width=\"34%\" height=\"5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.book.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                <td width=\"13%\" height=\"5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.book.dollarPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                <td width=\"9%\" height=\"5\"> \r\n");
      out.write("                  <input type=\"text\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" size=\"2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" maxlength=\"4\">\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"20%\" height=\"5\"> \r\n");
      out.write("                  <div align=\"right\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.dollarOrderCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"11%\" height=\"5\"> \r\n");
      out.write("                  <div align=\"center\"> \r\n");
      out.write("                    <input type=\"checkbox\" name=\"remove\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.book.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("        </c:forEach>\r\n");
      out.write("     </c:if>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    <tr bgcolor=\"#E4E4E4\"> \r\n");
      out.write("      <td width=\"13%\" height=\"2\" bordercolor=\"#CCCCCC\"> \r\n");
      out.write("        <input type=\"submit\" name=\"Submit\" value=\"Update Cart\">\r\n");
      out.write("      </td>\r\n");
      out.write("      <td width=\"34%\" height=\"2\" bordercolor=\"#CCCCCC\">&nbsp; </td>\r\n");
      out.write("      <td width=\"13%\" height=\"2\" bordercolor=\"#CCCCCC\">&nbsp; </td>\r\n");
      out.write("      <td width=\"9%\" height=\"2\" bordercolor=\"#CCCCCC\">&nbsp; </td>\r\n");
      out.write("      <td width=\"20%\" height=\"2\" bordercolor=\"#CCCCCC\"> \r\n");
      out.write("        <div align=\"right\"><b>ORDER TOTAL $");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${String.format(\"%.2f\", totalCostOfOrder)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></div>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td width=\"11%\" height=\"2\" bordercolor=\"#CCCCCC\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</form>\r\n");
      out.write("<p><a href=\"./books?Action=continue\">Continue Shopping</a></p>\r\n");
      out.write("<p><a href=\"./books?Action=checkout\">Check Out</a></p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
