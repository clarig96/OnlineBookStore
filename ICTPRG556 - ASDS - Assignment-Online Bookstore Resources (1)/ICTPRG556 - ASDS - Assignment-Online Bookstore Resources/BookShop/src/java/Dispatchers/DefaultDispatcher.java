/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispatchers;

import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Tbooks;
import utility.AdmitBookStoreDAO;

/**
 *
 * @author 001081658
 */
public class DefaultDispatcher implements IDispatcher {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        //AdmitBookStoreDAO dao = new AdmitBookStoreDAO();
            List books = null;
            String nextPage = "/jsp/error.jsp";
            HttpSession session = request.getSession();
           
            emf = Persistence.createEntityManagerFactory("BookShopPU");
            em = emf.createEntityManager();
            
            try {
                //books = dao.getAllBooks();
                books = em.createNamedQuery("Tbooks.findAll", Tbooks.class).getResultList();
                session.setAttribute("books", books);
                nextPage = "/jsp/titles.jsp";

            } catch (Exception ex) {
                request.setAttribute("result", ex.getMessage());
                nextPage = "/jsp/error.jsp";
            } 
            return nextPage;
    }
    
}
