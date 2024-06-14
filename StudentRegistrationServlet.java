import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentRegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the response content type
        response.setContentType("text/html");
    
        // Get the print writer to write the response
        PrintWriter out = response.getWriter();
    
        // Write the HTML form
        out.println("<html>");
        out.println("<head><title>Student Registration</title></head>");
        out.println("<body>");
        out.println("<h1>Student Registration</h1>");
        out.println("<form method='post' action='register'>");
        out.println("<label for='name'>Name:</label>");
        out.println("<input type='text' id='name' name='name'><br>");
        out.println("<label for='email'>Email:</label>");
        out.println("<input type='email' id='email' name='email'><br>");
        out.println("<input type='submit' value='Register'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
    
        // Print the received data (you can save it to a database or perform other operations)
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    
        // Set the response content type
        response.setContentType("text/html");
    
        // Get the print writer to write the response
        PrintWriter out = response.getWriter();
    
        // Write the response
        out.println("<html>");
        out.println("<head><title>Registration Successful</title></head>");
        out.println("<body>");
        out.println("<h1>Registration Successful</h1>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
