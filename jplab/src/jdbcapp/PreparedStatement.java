package jdbcapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatement {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection=SqlServerConnection.getSQLServerConnection();
//an toan vi tham so truyen vao cua truy van phai dc set bang ?
        //-> loai dc ma doc
        //callableStatement: an di toan bo sql engine trong code

        String query="select*from employee where empId =? and name like ? ";
        //create PreparedStatement
        //tao preparedStatement
        //tham so truyen vao cho preparedStatement phai la dau ?
        java.sql.PreparedStatement preparedStatement=connection.prepareStatement(query);

        //Set dat gia tri cho tham so cua preparedStaememt
        preparedStatement.setInt(1,8);
        preparedStatement.setString(2,"Hung");
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("---------------");
            System.out.println("empId "+resultSet.getInt(1));
            System.out.println("emp no "+resultSet.getString(2));
            System.out.println("emp name "+resultSet.getString(3));
        }

    }
}
