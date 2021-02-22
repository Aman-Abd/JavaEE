import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "profile",
        urlPatterns = "/profile"
)

public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        req.getRequestDispatcher("link.jsp").include(req, resp);

        Cookie[] ck = req.getCookies();
        if(ck!=null){
            String name = ck[0].getValue();
            if( !name.equals("") || name!=null ){
                out.print("Welcome, "+name +" (Cookie) <br>");
            }
        }else{
            out.print("Please login first");
            req.getRequestDispatcher("login.html").include(req, resp);
        }

        HttpSession session=req.getSession(false);
        if(session!=null){
            String name=(String)session.getAttribute("name");

            out.print("Welcome "+name+"(HTTP Session)");
        }
        else{
            out.print("Please login first");
            req.getRequestDispatcher("login.html").include(req, resp);
        }
        out.close();
    }
}
