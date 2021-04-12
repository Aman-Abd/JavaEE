package Logics;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
@Entity
@Table(name = "dish")
public class Dish {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name ="price")
    private double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Dish() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
