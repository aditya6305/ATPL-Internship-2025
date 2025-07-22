import java.sql.*;

public class NewUser {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
        Statement stmt = con.createStatement();
        stmt.execute("INSERT INTO Users_Aditya (user_id,user_name)VALUES('U600','Kishore')");
        ResultSet rs = stmt.executeQuery("select * from Users_Aditya");
        while (rs.next()) {
            System.out.print(rs.getString("user_id")+" ");
            System.out.println(rs.getString("user_name"));
        }
        rs.close();
        stmt.close();
        con.close();
    }
}
