package jdbcapp;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDatabase {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection=SqlServerConnection.getSQLServerConnection();

        //create statement
        Statement statement=connection.createStatement();
        String query="insert into employee values(8,'F008','Hoang Anh')";
        //thuc thi cau lenh insert
        int row=statement.executeUpdate(query);
        System.out.println("row "+row);

    }
}
