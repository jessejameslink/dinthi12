import service.UserImpl;

import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException {
        UserImpl user = new UserImpl();
        user.deleteUser(9);
    }
}
