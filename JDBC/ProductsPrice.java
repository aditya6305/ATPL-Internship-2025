import java.sql.*;

public class ProductsPrice {
    public static void main(String[] args)throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
        String query = "Select *from Products_Aditya where price BETWEEN ? AND ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setDouble(1,50000);
        pstmt.setDouble(2,90000);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            System.out.print(rs.getString("product_id")+" ");
            System.out.print(rs.getString("product_name")+" ");
            System.out.println(rs.getString("price"));
        }
        rs.close();
        pstmt.close();
        con.close();
    }
}
