import java.sql.*;
import java.util.*;
public class BatchingDemo {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
        con.setAutoCommit(false);
        String query = "INSERT INTO users_Aditya(user_id,user_name,user_email) VALUES (?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.print("Enter ID : ");
            String user_id= scanner.nextLine();
            System.out.print("Enter Name : ");
            String user_name=scanner.nextLine();
            System.out.print("Enter Email : ");
            String user_email=scanner.nextLine();
            pstmt.setString(1,user_id);
            pstmt.setString(2,user_name);
            pstmt.setString(3,user_email);
            pstmt.addBatch();// It is used to add the set of parameters to the prepared statement.
            // We may use statement and prepared statement without using batch but it takes more time to run the code and also we need to hard code everytime we need to insert something into it.
            // By using batch with statement it takes more time because it compiled every time the query gets executed.
            //By using batch with prepared statement it takes less time compared to all the other process because it compiles whole code once if we are writing any queries.

            System.out.println("Add more values in the table:Yes/No");
            String decision = scanner.nextLine();
            if(decision.equalsIgnoreCase("No")) {
                System.out.println("Successfully data is added into the table");
                break;
            }
        }
        pstmt.executeBatch();
        con.commit();
        System.out.println("Batch executed successfully!!");
        con.close();
        pstmt.close();
        scanner.close();
    }
}
