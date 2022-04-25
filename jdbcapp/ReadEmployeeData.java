package jdbcapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployeeData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //tra ve 1 doi tuong connection da ket noi den csdl
        Connection connection=SqlServerConnection.getSQLServerConnection();
        //tao doi tuong statement
        Statement statement=connection.createStatement();

        //ket qua tra ve tu bang employee dc ResultSet chua thong tin
        ResultSet resultSet=statement.executeQuery("select *from  employee");
        while (resultSet.next()) {//doc het ban ghi
            {
                int empid = resultSet.getInt(1);
                String empNo = resultSet.getString(2);
                String name = resultSet.getString(("name"));
                System.out.println("---------------");
                System.out.println("empid" + empid);
                System.out.println("empNo" + empNo);
                System.out.println("nsme" + name);
            }
        }
        connection.close();
    }
}
