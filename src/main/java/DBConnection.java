import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static String DB_URL = "jdbc:h2:~/test1";
    private static String DB_USER = "sa";
    private static String DB_PASSWORD = "";

    public static Connection getConnection() {
       //get connction
        return connection;
    }

    public static void closeConnection(Connection connection) {
       //close connection
    }

}
