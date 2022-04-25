package jdbcapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReSultSetScrollable {
    public static void main(String[] args)throws SQLException,ClassNotFoundException {
        //goi connection ket noi den csdl tu class sqlserverconnection
        Connection connection=SqlServerConnection.getSQLServerConnection();
        //tao statement. it nhay cam voi su thay doi cua bang.
        Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        String query="select*from employee";
        //thuc thi chi thi cua sql thong qua statement
        ResultSet resultSet=statement.executeQuery(query);
        //di chuyen con tro den cuoi ban ghi
        boolean last= resultSet.last();
        System.out.println("last:"+last);
        if (last){
            //ghi ban ghi cua last
            System.out.println("Employee id: "+resultSet.getInt(1));
            System.out.println("Employee no: "+resultSet.getString(2));
            System.out.println("Employee name: "+resultSet.getString(3));

        }
        boolean first= resultSet.first();
        System.out.println("first:"+first);
        while (resultSet.next()){
        //lay du lieu theo id cua cot 2
            String empNo=resultSet.getString(2);
            //lay du lieu cua cot 1
            int empId=resultSet.getInt(1);
            //lay du lieu theo ten cot
            String empName=resultSet.getString("name");

            System.out.println("--------------------------");
            System.out.println("id "+empId);
            System.out.println("emp No "+empNo);
            System.out.println("name "+empName);
        }
        connection.close();
    }
}
