package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DatabaseApp {
    public static void main(String[] args) throws SQLException {
//        DbOperation.insert_user();
        List<User> users = DbOperation.get_all_users();
        users.forEach(user ->
                System.out.printf("%d : %-8s : %s\n",
                        user.getId(),user.getName(),user.getEmail()));
    }
}
