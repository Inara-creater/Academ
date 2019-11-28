package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {
    private static Connection connection;
    public static Connection get() throws SQLException{
        if (connection == null){
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/inara3",
                    "postgres",
                    System.getenv("PG_PWD")
            );
        }return connection;
    }

}
