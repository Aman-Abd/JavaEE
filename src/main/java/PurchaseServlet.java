import Logics.Dish;
import Logics.Restaurant;
import Logics.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(
        name = "purchase",
        urlPatterns = "/purchase"
)

public class PurchaseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        String dishName = req.getParameter("dishName");

        Restaurant restaurant = Restaurant.getRestaurant();

        HttpSession session=req.getSession();
        if(session.getAttribute("name")!=null){
            String name=(String)session.getAttribute("name");
            for (Dish dish : restaurant.getDishes()){
                if(dish.getName().equalsIgnoreCase(dishName)){
                    for (User user : restaurant.getUsers()){
                        if(user.getName().equalsIgnoreCase(name)){
                            user.setMoney(user.getMoney() - dish.getPrice());
                            user.getDishes().add(dish);
                            req.getRequestDispatcher("profile.jsp").include(req,resp);
                        }
                    }
                }
            }
        }
        else{
            out.print("Please login first");
            req.getRequestDispatcher("login.jsp").include(req, resp);
        }
    }
}
