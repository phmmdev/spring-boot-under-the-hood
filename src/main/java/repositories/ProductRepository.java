package repositories;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductRepository
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(Product product)
    {
        String query = "INSERT INTO product VALUES (NULL, ?, ?)";
        jdbcTemplate.update(query, product.getName(), product.getPrice());
        System.out.println("one product was added");
    }

    public List<Product> getProducts()
    {
        String query = "SELECT * FROM product";
        return jdbcTemplate.query(query, new RowMapper<Product>()
        {
            @Override
            public Product mapRow(ResultSet resultSet, int i) throws SQLException
            {
                Product product =  new Product(resultSet.getInt("id"),
                                               resultSet.getString("name"),
                                               resultSet.getDouble("price"));
                return product;
            }
        });
    }
}
