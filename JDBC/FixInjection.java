import java.sql.*;

public class FixInjection {
    public static void main(String[] args) throws SQLException {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern", "intern2025", "intern2025");
//            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM PersonalInfo_Aditya where username='Aditya10'");
            // java.sql.SQLException: Parameter index out of range (1 > number of parameters, which is 0).We cannot access the password with the help of username like in statement.
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM PersonalInfo_Aditya where username=?");
            pstmt.setString(1, "Aditya10");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("password"));
                rs.close();
                pstmt.close();
                con.close();
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }
}
