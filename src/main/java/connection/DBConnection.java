package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messanger_app", "root", "");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
