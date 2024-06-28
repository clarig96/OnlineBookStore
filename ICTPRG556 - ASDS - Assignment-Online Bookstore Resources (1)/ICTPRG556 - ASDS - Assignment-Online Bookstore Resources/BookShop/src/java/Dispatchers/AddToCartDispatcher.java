/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispatchers;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Book;
import model.CartItem;
import model.Tbooks;
import utility.AdmitBookStoreDAO;

/**
 *
 * @author 001081658
 */
public class AddToCartDispatcher implements IDispatcher {

    public String execute(HttpServletRequest request, HttpServletResponse response) {

       
        HttpSession session = request.getSession(true);
       
        String nextPage = "/jsp/titles.jsp";

        Map cart = (Map) session.getAttribute("cart");
        String[] selectedBooks = request.getParameterValues("add");

            if (cart == null) {
                cart = new HashMap();
                for (int i = 0; i < selectedBooks.length; i++) {
                    String isbn = selectedBooks[i];
                    int quantity = Integer.parseInt(request.getParameter(isbn));
                    Tbooks book = this.getBookFromList(isbn, session);
                    CartItem item = new CartItem(book);
                    item.setQuantity(quantity);
                    cart.put(isbn, item);
                }
                session.setAttribute("cart", cart);
            } else {
                for (int i = 0; i < selectedBooks.length; i++) {
                    String isbn = selectedBooks[i];
                    int quantity = Integer.parseInt(request.getParameter(isbn));
                    if (cart.containsKey(isbn)) {
                        CartItem item = (CartItem) cart.get(isbn);
                        item.setQuantity(quantity);
                    } else {
                        Tbooks book = this.getBookFromList(isbn, session);
                        CartItem item = new CartItem(book);
                        item.setQuantity(quantity);
                        cart.put(isbn, item);
                    }
                }
            }

            //this.dispatch(request, response, nextPage);
            return nextPage;
    }
    
    private Tbooks getBookFromList(String isbn, HttpSession session) {
        List<Tbooks> list = (List) session.getAttribute("books");
        Tbooks aBook = null;
        for (int i = 0; i < list.size(); i++) {
            aBook = (Tbooks) list.get(i);
            if (isbn.equals(aBook.getIsbn())) {
                break;
            }
        }
        return aBook;
    }


}
