package dao;

import connection.DBConnection;
import model.Message;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class MessageDAO {

    public static void createMessage(Message message) {
        DBConnection cnx = new DBConnection();

        try (Connection connection = cnx.getConnection()) {
            PreparedStatement ps = null;

            try {
                String query = "INSERT INTO messanger_app.messages (message, m_author,m_date) VALUES (?,?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setString(2, message.getM_author());
                ps.setString(3, String.valueOf(LocalDateTime.now()));
                ps.executeUpdate();
                System.out.println("\nMessage created successfully");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getMessages() {
        DBConnection cnx = new DBConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = cnx.getConnection()) {
            String query = "SELECT * FROM messanger_app.messages";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println(String.format("\nId: %s",rs.getInt("message_id")));
                System.out.println(String.format("Message: %s",rs.getString("message")));
                System.out.println(String.format("Author: %s",rs.getString("m_author")));
                System.out.println(String.format("Date: %s",rs.getString("m_date")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteMessage(int id) {
        DBConnection cnx = new DBConnection();

        try (Connection connection = cnx.getConnection()) {
            PreparedStatement ps = null;

            try {
                String query="DELETE FROM messanger_app.messages WHERE message_id = ?";
                ps=connection.prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("\nMessage deleted successfully");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateMessage(Message message) {
        DBConnection cnx = new DBConnection();

        try (Connection connection = cnx.getConnection()) {
            PreparedStatement ps = null;

            try {
                String query="UPDATE messanger_app.messages SET message = ? WHERE message_id = ?";
                ps=connection.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setInt(2, message.getMessage_id());
                ps.executeUpdate();
                System.out.println("\nMessage updated successfully");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
