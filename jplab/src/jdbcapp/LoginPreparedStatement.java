package jdbcapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;

public class LoginPreparedStatement {



    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        loginStatement("'admin'","'admin'");
        loginpreparedStatement("'admin'","'admin'");

    }
    public static  void loginStatement(String username,String password) throws SQLException, ClassNotFoundException {

        //step 1,2;
        Connection connection=SqlServerConnection.getSQLServerConnection();
        String query="select username from users where username= "+username+" and password ="+password+"";
        //step3 :create Statement
        Statement statement=connection.createStatement();
        //step4 :
        ResultSet resultSet=statement.executeQuery(query);
        while (resultSet.next()){
            System.out.println("login thanh conng"+resultSet.getString("usename"));
        }


    }
    public static void loginpreparedStatement(String usename,String password) throws SQLException, ClassNotFoundException {
        Connection connection=SqlServerConnection.getSQLServerConnection();
        String query="select username from uses where username =? and password =?";

        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,usename);
        preparedStatement.setString(2,password);

        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("Login thanh cong"+resultSet.getString("username"));
        }

    }
}
