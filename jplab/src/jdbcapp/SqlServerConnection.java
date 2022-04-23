package jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlServerConnection {
    public static Connection getSQLServerConnection()throws SQLException,ClassNotFoundException {
        String hostName="localhost";
        String instanceName="LAPTOP-U605PENF\\SQLEXPRESS";
        String database="myjdbapp";
        String useName="sa";
        String password="Quoctrung61";
        return getSQLServerConnection(hostName,instanceName,database,useName,password);

    }
    public static Connection getSQLServerConnection(String hostName,String instanceName,String databaseName,String userName,String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionstring="jdbc:sqlserver://"+hostName+":1433"+" ;instanceName="+instanceName+" ;databaseName="+databaseName;
        Connection connection= DriverManager.getConnection(connectionstring,userName,password);
        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn=getSQLServerConnection();
        if (conn!=null){
            System.out.println("ket noi thanh cong");
        }else {
            System.out.println("null");
        }
    }
}
