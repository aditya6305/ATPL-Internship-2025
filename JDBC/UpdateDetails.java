import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDetails {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
        String sql="UPDATE users_Aditya SET user_email=?,Mobile_No=? where user_id=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,"harika@gmail.com");
        pstmt.setLong(2,789456423);
        pstmt.setString(3,"U101");
        pstmt.executeUpdate();
        System.out.println("Updated users email and mobile number succesfully");
        pstmt.close();
        con.close();
    }
}
