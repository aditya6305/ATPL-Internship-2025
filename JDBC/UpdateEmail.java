import java.sql.*;
public class UpdateEmail {
    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String username = "intern2025";
        String password = "intern2025";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement pStmt = con.prepareStatement("UPDATE users_Aditya SET user_email = 'harikaharika@gmail.com' WHERE user_id = ?");
            pStmt.setString(1, "U101");
            pStmt.executeUpdate();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM users_Aditya WHERE user_id = ?");
            preparedStatement.setString(1, "U101");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("user_id"));
                System.out.println(rs.getString("user_name"));
                System.out.println(rs.getString("user_email"));
            }

            rs.close();
            pStmt.close();
            preparedStatement.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }
}