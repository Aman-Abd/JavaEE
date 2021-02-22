import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "logout",
        urlPatterns = "/logout"
)

public class LogOutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();


        req.getRequestDispatcher("link.jsp").include(req, resp);

        Cookie ck=new Cookie("name","");
        ck.setMaxAge(0);
        resp.addCookie(ck);

        HttpSession session=req.getSession();
        session.invalidate();

        out.print("you are successfully logged out!");
    }
}
