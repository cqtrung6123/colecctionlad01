package jdbcapp.mvc.model;

import jdbcapp.mvc.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDao {
    public void createProduct(Product product) throws SQLException, ClassNotFoundException;

    public  Product getProductById(int id) throws SQLException, ClassNotFoundException;

    public ArrayList<Product> getAllProduct() throws SQLException, ClassNotFoundException;


    void updateproduct(Product product) throws SQLException, ClassNotFoundException;

    public boolean deleteproduct(int id) throws SQLException, ClassNotFoundException;

    public ArrayList<Product> getProductByName(String name) throws SQLException, ClassNotFoundException;
}
