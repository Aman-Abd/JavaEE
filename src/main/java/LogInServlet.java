import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "login",
        urlPatterns = "/logIn"
)
public class LogInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        req.getRequestDispatcher("link.jsp").include(req, resp);

        String name = req.getParameter("name");
        String uname = req.getParameter("uname");
        String password = req.getParameter("password");

        if(uname!=null)
            out.print("Hello (Hidden Form)"+uname + "<br>");

        if(password.equals("123")){
            out.print("You are successfully logged in!");
            out.print("<br>Welcome, "+name);

            Cookie ck=new Cookie("name",name);
            resp.addCookie(ck);

            HttpSession session=req.getSession();
            session.setAttribute("name",name);
        }else{
            out.print("sorry, username or password error!");
            req.getRequestDispatcher("login.html").include(req, resp);
        }

        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{

            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();

            String pname=req.getParameter("pname");

            HttpSession session=req.getSession(false);
            String sname=(String)session.getAttribute("sname");

            if(pname == null ){
                out.print("Hello (For HTTP Session)"+sname+"<br>");
            }else{
                out.print("Hello (URL rewriting)"+pname +"<br>");
            }

            out.close();

        }catch(Exception e){System.out.println(e);}
    }
}

