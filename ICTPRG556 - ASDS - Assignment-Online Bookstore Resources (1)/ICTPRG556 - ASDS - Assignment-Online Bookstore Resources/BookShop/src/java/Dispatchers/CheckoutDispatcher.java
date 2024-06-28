/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispatchers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 001081658
 */
public class CheckoutDispatcher implements IDispatcher {

    public String execute(HttpServletRequest request, HttpServletResponse response) {
       String nextPage = "/jsp/checkout.jsp";
       return nextPage;
    }
    
    
}
