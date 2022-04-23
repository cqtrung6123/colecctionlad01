package jdbcapp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

//"dau" di toan bo code sql ko cho no xuat hien trong code java nua
public class CallableStatementDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection=SqlServerConnection.getSQLServerConnection();
        //callablestatement
     String query="{call getEmployee(?,?)}";//see nothing
        CallableStatement callableStatement= connection.prepareCall(query);

        //truyen tham so empid
        callableStatement.setInt(1,1);
        //lay ket qua ten ra
        callableStatement.registerOutParameter(2, Types.VARCHAR);

        callableStatement.executeUpdate();
        int empid=callableStatement.getInt(1);
        String empno=callableStatement.getString(2);
        String name=callableStatement.getNString(3);
        System.out.println("empid "+empid);
        System.out.println("empno "+empno);
        System.out.println("empname "+name);
    }
}
