import Logics.Dish;
import Logics.Restaurant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DishServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Media",
                    "postgres",
                    "512HzFe935Aman");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT name, price FROM dish");
            List<Dish> dishes = new ArrayList<>();
            while(resultSet.next()){
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                Dish dish = new Dish();
                dish.setName(name);
                dish.setPrice(price);
                dishes.add(dish);
            }
            Restaurant.getRestaurant().setDishes(dishes);
            statement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
