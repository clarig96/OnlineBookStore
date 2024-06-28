/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispatchers;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 001081658
 */
public class ViewCartDispatcher implements IDispatcher {

    public String execute(HttpServletRequest request, HttpServletResponse response) {
         HttpSession session = request.getSession(true);
           String nextPage = "/jsp/cart.jsp";
            Map cart = (Map) session.getAttribute("cart");
            if (cart == null) {
                nextPage = "/jsp/titles.jsp";
            }
            return nextPage;
    }
    
}
