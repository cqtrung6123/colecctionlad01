package jdbcapp.mvc;

import jdbcapp.mvc.view.LoginConsole;

import java.sql.SQLException;

public class Authencation {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        LoginConsole loginConsole=new LoginConsole();
        loginConsole.start();
    }
}
