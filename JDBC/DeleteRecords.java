import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRecords {
    public static void main(String[] args)throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
        String sql = "delete from Products_Aditya where DATE(Delivery_date)<CURRENT_DATE()";// It deletes all the products whose delivery date is older than today.
        PreparedStatement pstmt = con.prepareStatement(sql);
        System.out.println("Deleted products succesfully");
        pstmt.executeUpdate();
        pstmt.close();
        con.close();
    }
}
