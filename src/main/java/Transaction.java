import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {

    public void createTransaction() {
       //create statement

        try {
           //call method create sql table
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
           
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.closeConnection(connection);
        }

    }

    public void insertTransaction() {
        try {
          //call method insertDataIntoTable(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
