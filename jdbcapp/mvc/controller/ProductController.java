package jdbcapp.mvc.controller;

import jdbcapp.mvc.entity.Product;
import jdbcapp.mvc.model.ProductDaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductController {
    ProductDaoImpl productDao=new ProductDaoImpl();

    public ProductController() throws SQLException, ClassNotFoundException {
    }

    public void createPro(Product product) throws SQLException, ClassNotFoundException {
         productDao.createProduct(product);
    }
    public Product getById(int id) throws SQLException, ClassNotFoundException {
        return productDao.getProductById(id);
    }
    public ArrayList<Product> getAllProduct() throws SQLException, ClassNotFoundException {
        return productDao.getAllProduct();
    }
    public void updateProduct(Product product) throws SQLException, ClassNotFoundException {
        productDao.updateproduct(product);
    }
    public boolean deleteProduct(int id) throws SQLException, ClassNotFoundException {
        return productDao.deleteproduct(id);
    }
    public ArrayList<Product> getByName(String name) throws SQLException, ClassNotFoundException {
        return productDao.getProductByName(name);
    }
}
