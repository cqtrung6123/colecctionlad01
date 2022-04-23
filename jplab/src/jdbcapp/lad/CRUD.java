package jdbcapp.lad;

import jdbcapp.SqlServerConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

         Scanner scanner=new Scanner(System.in);
       while (true){
           menu();
           int c=scanner.nextInt();
           switch (c){
               case 1:
                   System.out.println("Enter Employee:");
                   System.out.println("Enter empid:");
                   int id=scanner.nextInt();
                   System.out.println("Enter empno: ");
                   String empno=scanner.next();
                   System.out.println("Enter name: ");
                   String name=scanner.next();
                   addemp(id,empno,name);
                   System.out.println("success");
                   break;
               case 2:
                   System.out.println("Enter search by name:");
                   name=scanner.next();
                   searchByName(name);
                   break;
               case 3:
                   getAllEmployee();
                   break;
               case 4:
                   System.out.println("Enter update Employee:");
                   System.out.println("Enter empno: ");
                    empno=scanner.next();
                   System.out.println("Enter name: ");
                    name=scanner.next();
                   System.out.println("Enter empid:");
                   id=scanner.nextInt();
                   edit(id,empno,name);
                   break;
               case 5:
                   System.out.println("Enter empid:");
                   id=scanner.nextInt();
                   dalete(id);
                   break;
               case 6:
                   return;
               default:
                   break;
           }
       }
    }
     static void addemp(int empid,String empno,String name) throws SQLException, ClassNotFoundException {
         Connection connection=SqlServerConnection.getSQLServerConnection();
         //tao preparedstatement
         String query="insert into employee(empid,empno,name) values(?,?,?)";
         PreparedStatement preparedStatement=connection.prepareStatement(query);
         preparedStatement.setInt(1,empid);
         preparedStatement.setString(2,empno);
         preparedStatement.setString(3,name);
         preparedStatement.executeUpdate();
    }



    public static void searchByName(String name) throws SQLException, ClassNotFoundException {
        Connection connection=SqlServerConnection.getSQLServerConnection();
        //tao preparedstatement
        String query="select*from employee where name like ?";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,name);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("------------------------------");
            System.out.println("id :"+resultSet.getInt(1));
            System.out.println("no :" + resultSet.getString(2));
            System.out.println("name :"+resultSet.getString(3));
        }

    }


    public static void getAllEmployee() throws SQLException, ClassNotFoundException {
        Connection connection=SqlServerConnection.getSQLServerConnection();
        //tao preparedstatement
        String query="select*from employee ";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("------------------------------");
            System.out.println("id :"+resultSet.getInt(1));
            System.out.println("no :" + resultSet.getString(2));
            System.out.println("name :"+resultSet.getString(3));
        }

    }


    public static void edit(int empid,String empno,String name) throws SQLException, ClassNotFoundException {
        Connection connection=SqlServerConnection.getSQLServerConnection();
        String query="update employee set empno=?,name=? where empid=?";
        PreparedStatement preparedStatement=connection.prepareStatement(query);

        preparedStatement.setString(1,empno);
        preparedStatement.setString(2,name);
        preparedStatement.setInt(3,empid);
        preparedStatement.executeUpdate();
    }


    public static void dalete(int empid) throws SQLException, ClassNotFoundException {
        Connection connection=SqlServerConnection.getSQLServerConnection();
        String query="delete employye where empid=?";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setInt(1,empid);
        preparedStatement.executeUpdate();
    }

    public static void menu(){
        System.out.println("---Menu---");
        System.out.println("1 Add employee");
        System.out.println("2 Get employee by name");
        System.out.println("3 Get all employee ");
        System.out.println("4 Edit employee");
        System.out.println("5 Delete employee");
        System.out.println("6 Exit");
    }
}
