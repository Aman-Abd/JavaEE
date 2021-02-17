import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "login",
        urlPatterns = "/logIn"
)
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String name = req.getParameter("name");
        String password = req.getParameter("Password");

        PrintWriter out = resp.getWriter();

        Cookie[] cookie = req.getCookies();

        out.println("Welcome: " + name);
        out.println("Welcome for cookie: " + cookie[0].getValue());
        out.close();
    }
}
