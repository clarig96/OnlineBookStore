package Dispatchers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface IDispatcher {

    public String execute(HttpServletRequest request, HttpServletResponse response);
}
