package Database;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbOperation {
    public static void insert_user() throws SQLException{
        Connection connection = DbConnection.get();
        String SQLI = "insert into users(name, email) values(?,?)";
        PreparedStatement statement = connection.prepareStatement(SQLI);
        statement.setString(1, "Jack");
        statement.setString(2, "jack@gmail.com");
        statement.execute();

    }

    public static List<User> get_all_users() throws SQLException{
        Connection connection = DbConnection.get();
        String SQLS = "select * from users";
        PreparedStatement statement = connection.prepareStatement(SQLS);
        ResultSet outcome = statement.executeQuery();
        ArrayList<User> data = new ArrayList<>();

        while (outcome.next()){
            int id = outcome.getInt("id");
            String name = outcome.getString("name");
            String email = outcome.getString("email");

            User user = new User(id,name,email);
            data.add(user);
        }
        return data;
    }
}
