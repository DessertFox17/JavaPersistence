import connection.DBConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        DBConnection connection = new DBConnection();

        try (Connection cnx = connection.getConnection()){

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
