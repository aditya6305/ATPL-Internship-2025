import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class PartialMatch {
    public static void main(String[] args)throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern", "intern2025", "intern2025");
        String sql = "Select *from Products_Aditya where product_name like ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,"%phone%");// It will gives all the products that contain phone in it.
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("product_name"));
        }
        pstmt.close();
        rs.close();
        conn.close();
    }
}
