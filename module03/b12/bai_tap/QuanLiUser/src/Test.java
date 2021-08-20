
import model.Service.UserImpl;

import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException {
        UserImpl user = new UserImpl();
        user.selectProductByName("Kante");
    }
}
