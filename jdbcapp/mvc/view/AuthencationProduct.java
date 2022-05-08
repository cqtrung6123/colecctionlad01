package jdbcapp.mvc.view;

import java.sql.SQLException;

public class AuthencationProduct {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductConsole productConsole=new ProductConsole();
        productConsole.start();
    }
}
