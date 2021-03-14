package Logics;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<User> users = new ArrayList<>();
    private List<Dish> dishes = createBaseMenu();

    private static Restaurant restaurant;
    private Restaurant(){}

    public static Restaurant getRestaurant() {
        if(restaurant==null){
            restaurant = new Restaurant();
        }
        return restaurant;
    }

    private ArrayList<Dish> createBaseMenu(){
        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("Dish1",1000));
        dishes.add(new Dish("Dish2",2000));
        dishes.add(new Dish("Dish3",3000));
        dishes.add(new Dish("Dish4",4000));
        dishes.add(new Dish("Dish5",5000));
        dishes.add(new Dish("Dish6",6000));
        dishes.add(new Dish("Dish7",7000));
        dishes.add(new Dish("Dish8",8000));
        dishes.add(new Dish("Dish9",9000));
        return dishes;
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
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
