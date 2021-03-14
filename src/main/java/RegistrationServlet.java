import Logics.Restaurant;
import Logics.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "registration",
        urlPatterns = "/registration"
)
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session=req.getSession();

        resp.setContentType("text/html");
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String password = req.getParameter("password");
        double money = Double.parseDouble(req.getParameter("money"));
        PrintWriter out = resp.getWriter();

        req.getRequestDispatcher("link.jsp").include(req, resp);

        session.setAttribute("sname", name);
//        out.print("<a href='logIn'>HTTP Session</a><br>");
//
//        out.print("<a href='logIn?pname="+name+"'>URL Rewriting</a><br>");

//        out.print("<form action='logIn' method=\"POST\">");
//        out.print("<input type='hidden' name='uname' value='"+name+"'>");
//        out.print("<p>Hidden Form</p>");
//        out.print("<input type='submit' value='go'>");
//        out.print("</form>");

        out.println("Name: " + name +"<br>");
        out.println("Last Name: " + lastName+"<br>");
        out.println("Password: "+password+"<br>");
        out.println("Money: "+money);
        out.close();

        User user = new User(name,lastName,password, money );
        Restaurant.getRestaurant().addUser(user);
    }
}
