package Logics;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<User> users = new ArrayList<>();
    private List<Dish> dishes = new ArrayList<>();
    private static JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());

    public static DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/Media");
        dataSource.setUsername("postgres");
        dataSource.setPassword("512HzFe935Aman");
        return dataSource;
    }

    private static Restaurant restaurant;
    private Restaurant(){}

    public static Restaurant getRestaurant() {
        if(restaurant==null){
            restaurant = new Restaurant();
        }
        return restaurant;
    }


    public void addUser (User user){
        users.add(user);
    }

    public void addDish (Dish dish){
        dishes.add(dish);
    }

    public List<User> getUsers() {

        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Dish> getDishes() {
        return jdbcTemplate.query("SELECT * FROM Dish", new DishMaper());
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
