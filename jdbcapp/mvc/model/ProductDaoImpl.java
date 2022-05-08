package jdbcapp.mvc.model;

import jdbcapp.mvc.dao.SQlServerConnection;
import jdbcapp.mvc.entity.Product;

import java.sql.*;
import java.util.ArrayList;

public class ProductDaoImpl implements ProductDao {

    private final Connection connection=SQlServerConnection.getSQLServerConnection();
    private final String sql_getbyid="select*from product where id=?";

    public ProductDaoImpl() throws SQLException, ClassNotFoundException {
    }

    @Override
    public void createProduct(Product product) throws SQLException, ClassNotFoundException {
      //  Connection connection= SQlServerConnection.getSQLServerConnection();
        String query="insert into product values(?,?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);//tra id

        preparedStatement.setString(1, product.getProName());
        preparedStatement.setString(2, product.getProDesc());
        preparedStatement.setDouble(3,product.getPrice());

        preparedStatement.executeUpdate();
        ResultSet resultSet=preparedStatement.getGeneratedKeys();

        if (resultSet.next()){
            product.setId(resultSet.getInt(1));
        }

    }

    @Override
    public Product getProductById(int id) throws SQLException, ClassNotFoundException {
    //    Connection connection=SQlServerConnection.getSQLServerConnection();
        Product product=new Product();
       // String query="select*from product where id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql_getbyid);
        preparedStatement.setInt(1,id);
        preparedStatement.executeQuery();
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            product.setId(resultSet.getInt(1));
            product.setProName(resultSet.getString(2));
            product.setProDesc(resultSet.getString(3));
            product.setPrice(resultSet.getDouble(4));
            System.out.println("======================");
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.getDouble(4));
        }
        return product;
    }

    @Override
    public ArrayList<Product> getAllProduct() throws SQLException, ClassNotFoundException {
     //   Connection connection=SQlServerConnection.getSQLServerConnection();
        String query="select*from product ";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        ResultSet resultSet=preparedStatement.executeQuery();
        ArrayList<Product>allproduct=new ArrayList<>();
        while (resultSet.next()){
            Product product=new Product();
            product.setId(resultSet.getInt(1));
            product.setProName(resultSet.getString(2));
            product.setProDesc(resultSet.getString(3));
            product.setPrice(resultSet.getDouble(4));
            allproduct.add(product);
            System.out.println("\t======================");
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.getDouble(4));
        }
        return allproduct;
    }

    @Override
    public void updateproduct(Product product) throws SQLException, ClassNotFoundException {
      //  Connection connection=SQlServerConnection.getSQLServerConnection();
        String query="update product set proName=?,proDesc=?,price=? where id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,product.getProName());
        preparedStatement.setString(2,product.getProDesc());
        preparedStatement.setDouble(3,product.getPrice());
        preparedStatement.setInt(4,product.getId());
        preparedStatement.executeUpdate();
    }

    @Override
    public boolean deleteproduct(int id) throws SQLException, ClassNotFoundException {
      //  Connection connection=SQlServerConnection.getSQLServerConnection();
        String query="delete from product where id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
            return true;
    }

    @Override
    public ArrayList<Product> getProductByName(String name) throws SQLException, ClassNotFoundException {

        String query="select*from product where proName=?";
      //  Connection connection=SQlServerConnection.getSQLServerConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,name);
        ArrayList<Product>productList=new ArrayList<>();
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            Product product=new Product();
            product.setProName(resultSet.getString("proName"));
            System.out.println("======================");
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.getDouble(4));
        }
        return productList;
    }

}
