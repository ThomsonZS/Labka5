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
import lab4.Student;

@WebServlet(name = "ListServlet", urlPatterns = {"/lista"})
    public class ListServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        request.getRequestDispatcher("lista.jsp").forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        HttpSession session = request.getSession(); 
        
        List<Person> studentsList = new ArrayList();
        
        if (!session.isNew()) {
            if (session.getAttribute("studentsList") != null)
                studentsList = (List<Person>) session.getAttribute("studentsList");
        }

        Person student = new Student(request.getParameter("firstName"),
                            request.getParameter("lastName"),
                            request.getParameter("email"));
        
        studentsList.add(student);
                
        session.setAttribute("studentsList", studentsList); 
        
        request.getRequestDispatcher("lista.jsp").forward(request, response);
        }

    
}