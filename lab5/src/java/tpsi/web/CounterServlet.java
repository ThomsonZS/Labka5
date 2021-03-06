package tpsi.web;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import lab4.Person;

@WebServlet(name = "HelloServlet", urlPatterns = {"/licznik"})
    public class CounterServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        HttpSession session = request.getSession(); 
        int count = 1;    
        
        try {
            if (session.getAttribute("count") != null)
                count = (int) session.getAttribute("count") +1;
        } catch (Exception ex) {
            
        } 

        session.setAttribute("count", count); 
        
        request.getRequestDispatcher("licznik.jsp").forward(request, response);
        }

    
}