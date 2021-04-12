package Logics;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DishMaper implements RowMapper<Dish> {
    @Override
    public Dish mapRow(ResultSet resultSet, int i) throws SQLException {
        Dish dish = new Dish();
        dish.setId(resultSet.getLong("id"));
        dish.setName(resultSet.getString("name"));
        dish.setPrice(resultSet.getDouble("price"));

        return dish;
    }
}
