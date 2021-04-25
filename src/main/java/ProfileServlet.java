import Logics.Dish;
import Logics.Restaurant;
import Logics.User;

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
        Cookie[] ck = req.getCookies();
//        if(ck!=null){
//            String name = ck[ck.length-1].getValue();
//            if(!name.equals("") || name!=null){
////                out.print("Welcome, "+name +" (Cookie) <br>" + ck.length   + "<br>");
//            }
//        }else{
//            out.print("Please login first");
//            req.getRequestDispatcher("login.html").include(req, resp);
//        }

        HttpSession session=req.getSession();
        if(session.getAttribute("name")!=null){
            String name=(String)session.getAttribute("name");
            for(User user : Restaurant.getRestaurant().getUsers()) {
                if (user.getName().equalsIgnoreCase(name)) {
                    req.getRequestDispatcher("profile.jsp").include(req,resp);
                }
            }
        }
        else{
            out.print("Please login first");
            req.getRequestDispatcher("login.jsp").include(req, resp);
        }
        out.close();
    }
}
