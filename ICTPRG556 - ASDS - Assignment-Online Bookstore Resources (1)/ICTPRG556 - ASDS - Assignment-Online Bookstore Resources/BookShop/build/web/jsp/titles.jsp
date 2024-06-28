
<%@ page import="utility.AdmitBookStoreDAO" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page contentType="text/html;charset=ISO-8859-1" %>
<html>
<head>
    <title>Untitled Document</title>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body bgcolor="#FFFFFF" text="#000000">

<c:set var="items" value="${sessionScope.cart}" />
<table width="38%" border="0" cellspacing="1" cellpadding="0" height="53" align="left">
    <tr> 
        <td bgcolor="#E2E2E2"> 
            <div align="left"><font face="Arial, Helvetica, sans-serif"><b><font size="3">Items in your Shopping Cart</font></b></font></div>
        </td>
    </tr>
    <c:if test="${not empty items}">
              <c:forEach var="entry" items="${items}">
            <c:set var="item" value="${entry.value}" />
            <c:set var="cost" value="${item.getOrderCost()}" />
            <c:set var="totalOrderCost" value="${totalOrderCost + cost}" />
            <tr> 
                <td height="13" bgcolor="#E8FFE8">${item}</td>
            </tr>
        </c:forEach>
        <tr> 
            <td height="13" bgcolor="#CCCCCC"> 
                <div align="right"><b>Order Total: ${totalOrderCost}</b></div>
            </td>
        </tr>
        </tr>
    </c:if>
    <c:if test="${empty items}">
        <tr> 
            <td height="13">No Items in Cart</td>
        </tr>
    </c:if>
</table>
<p>&nbsp;</p><p>&nbsp;</p>
<p>&nbsp;</p><hr>
<h2 align="center">WELCOME TO THE ONLINE BOOKSHOP</h2>
<form name="form1" method="post" action="./books">
    <input type="hidden" name="Action" value="add_to_cart">
    <table width="93%" border="2" cellspacing="0" cellpadding="1" bordercolor="#FFFFFF">
        <tr bgcolor="#CCCCCC"> 
            <td width="10%"><b>ISBN</b></td>
            <td width="37%"><b>Title</b></td>
            <td width="24%"><b>Author</b></td>
            <td width="13%"><b>Price</b></td>
            <td width="10%"><b>Quantity</b></td>
            <td width="6%"> 
                <div align="left"><b>Add</b></div>
            </td>
        </tr>

        <c:set var="books" value="${sessionScope.books}" />
        <c:if test="${not empty books}">
            <c:forEach var="book" items="${books}">
                <tr bgcolor="#F4F4F4"> 
                    <td width="10">${book.isbn}</td>
                    <td width="37">${book.title}</td>
                    <td width="24">${book.author}</td>
                    <td width="13">${book.dollarPrice}</td>
                    <td width="10"> 
                        <select name="${book.isbn}" size="1">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                        </select>
                    </td>
                    <td width="6"> 
                        <div align="center"> 
                            <input type="checkbox" name="add" value="${book.isbn}">
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        <tr> 
            <td width="10%"> 
                <input type="submit" name="Details" value="Add to Cart">
            </td>
            <td width="37%">&nbsp;</td>
            <td width="24%">&nbsp;</td>
            <td width="13%">&nbsp;</td>
            <td width="10%">&nbsp;</td>
            <td width="6%">&nbsp;</td>
        </tr>
     </table>
</form>
<p><a href="./books?Action=view_cart">View Shopping Cart</a></p>
</body>
</html>