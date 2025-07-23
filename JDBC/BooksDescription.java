import java.sql.*;

public class BooksDescription {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern", "intern2025", "intern2025");
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO Books_Aditya(Book_name,Descrip) VALUES (?, ?)");
        pstmt.setString(1, "Java Fundamentals");
        pstmt.setNull(2, java.sql.Types.VARCHAR);
        pstmt.executeUpdate();
        System.out.println("Book details added successfully");
        pstmt.close();
        con.close();
    }
}