import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class Reuseps {
    public static void main(String[] args)throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
        String query = "INSERT INTO Students_Aditya(Student_id,Student_name,Favourite_Subject) VALUES (?,?,?)";
//        String query2 = "INSERT INTO Books_Aditya(Book_name,Descrip)VALUES (?,?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Student ID");
            String Student_id = scanner.next();
            System.out.println("Enter Student Name");
            String Student_name = scanner.next();
            System.out.println("Enter Favourite Subject");
            String Favourite_Subject = scanner.next();
            pstmt.setString(1, Student_id);
            pstmt.setString(2, Student_name);
            pstmt.setString(3, Favourite_Subject);
            pstmt.addBatch();
            System.out.println("Add more records:Yes/No");
            String option = scanner.next();
            if (option.equalsIgnoreCase("No")) {
                break;
            }
        }
        pstmt.executeBatch();
        pstmt.close();
        con.close();


    }
}
