package jdbcapp.mvc.view;

import jdbcapp.mvc.controller.LoginController;
import jdbcapp.mvc.entity.Users;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginConsole {
    //step1 goi controller
    LoginController loginController=new LoginController();
    Users users=new Users();

    private final Scanner sc;
    public LoginConsole(){
        this.sc=new Scanner(System.in);
    }
    public int menu(){
        System.out.println("===Login===");
        System.out.println("1 login statement");
        System.out.println("2 login prepared statement");
        System.out.println("3 exit");
        int choice=readInt(0,3);
        return choice;
    }
    public int readInt(int min,int max){
        int choice;
        while (true){
            try {
                choice=Integer.parseInt(sc.nextLine());
                if (choice>=min&&choice<=max){
                    break;
                }
            }catch (NumberFormatException numberFormatException){
                numberFormatException.printStackTrace();
            }
        }
        return choice;
    }
    public void start() throws SQLException, ClassNotFoundException {
        while (true){
            int choice=menu();
            switch (choice){
                case 0:
                    System.exit(0);
                case 1:
                    LoginStatement();
                    break;
                case 2:
                    LoginPreparedStatement();
                    break;
                default:throw new AssertionError();
            }
        }
    }


    public void LoginStatement() throws SQLException, ClassNotFoundException {
        System.out.println("enter username:");
        String username=sc.nextLine();
        users.setUsername(username);
        System.out.println("enter password:");
        String password=sc.nextLine();
        users.setPassword(password);

        //step1 call request to con controller
        loginController.loginStatementController(users);
    }
    public void LoginPreparedStatement() throws SQLException, ClassNotFoundException {
        System.out.println("enter username:");
        String username=sc.nextLine();
        users.setUsername(username);
        System.out.println("enter password:");
        String password=sc.nextLine();
        users.setPassword(password);
        loginController.loginPreparedStatementController(users);
    }
}
