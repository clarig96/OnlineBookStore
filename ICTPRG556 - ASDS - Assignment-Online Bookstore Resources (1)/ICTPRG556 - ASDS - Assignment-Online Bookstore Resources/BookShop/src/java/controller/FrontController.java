package controller;

import Dispatchers.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
//import dispatchers.*;
import model.Book;
import model.CartItem;
import utility.AdmitBookStoreDAO;

public class FrontController extends HttpServlet {

    private final HashMap actions = new HashMap();

    //Initialize global variables
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        actions.put("default", new DefaultDispatcher());
        actions.put("add_to_cart", new AddToCartDispatcher());
        actions.put("checkout", new CheckoutDispatcher());
        actions.put("continue", new ContinueShoppingDispatcher());
        actions.put("update_cart", new UpdateCartDispatcher());
        actions.put("view_cart", new ViewCartDispatcher());
    }

    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.err.println("doGet()");
        doPost(request, response);

    }

    //Process the HTTP Post request
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String requestedAction = request.getParameter("Action");
        HttpSession session = request.getSession();
        AdmitBookStoreDAO dao = new AdmitBookStoreDAO();
        String nextPage = "";

        if (requestedAction == null) {
            
            requestedAction = "default";
            
        }
         IDispatcher myDispatcher = (IDispatcher) actions.get(requestedAction);
           String page = myDispatcher.execute(request, response);
           this.dispatch(request, response, page);
    }

    private Book getBookFromList(String isbn, HttpSession session) {
        List<Book> list = (List) session.getAttribute("books");
        Book aBook = null;
        for (int i = 0; i < list.size(); i++) {
            aBook = (Book) list.get(i);
            if (isbn.equals(aBook.getIsbn())) {
                break;
            }
        }
        return aBook;
    }

    private void dispatch(HttpServletRequest request, HttpServletResponse response, String page) throws ServletException,
            IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }

    //Get Servlet information
    public String getServletInfo() {
        return "controller.FrontController Information";
    }

}
