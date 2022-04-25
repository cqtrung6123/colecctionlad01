package jdbcapp.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQlServerConnection  {
    public  static Connection getSQLServerConnection() throws ClassNotFoundException, SQLException {
        String hostname="localhost";
        String instance="LAPTOP-U605PENF\\SQLEXPRESS";
        String database="myjdbapp";
        String username="sa";
        String password="Quoctrung61";
        return  getSQLServerConnection(hostname,instance,database,username,password);
    }
    public  static Connection getSQLServerConnection(
            String hostname
            ,String instance
            ,String databasename
            ,String username
            ,String password) throws ClassNotFoundException, SQLException {

        //1.load and register driver sqlserver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionString="jdbc:sqlserver://"+hostname+":1433"+
                ";instace="+instance+";database="+databasename;
        Connection connection= DriverManager.getConnection(connectionString,username,password);
        return connection ;
    }

}
