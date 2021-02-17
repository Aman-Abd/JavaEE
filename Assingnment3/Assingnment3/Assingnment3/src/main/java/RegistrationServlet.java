import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "registration",
        urlPatterns = "/registration"
)
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String password = req.getParameter("password");

        PrintWriter out = resp.getWriter();

        Cookie cookie = new Cookie("name", name);
        cookie.setMaxAge(1800);
        resp.addCookie(cookie);

        out.print("<form action='logIn'>");
        out.print("<input type='submit' value='go'>");
        out.print("</form>");

        out.println("Name: " + name);
        out.println("Last Name: " + lastName);
        out.println("Password: "+password);
        out.close();
    }
}
