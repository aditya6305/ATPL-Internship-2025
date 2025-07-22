import java.sql.*;
public class ConnectionDb   {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://192.168.71.15:3306/intern";
        String user = "intern2025";
        String password= "intern2025";
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Products_Aditya");
        while (rs.next()) {
            System.out.print(rs.getString(1)+" ");
            System.out.print(rs.getString(2)+" ");
            System.out.println(rs.getString(3));
        }
        stmt.close();
        connection.close();
    }
}
