import java.sql.*;

public class SqlInjection {
    public static void main(String[] args) throws SQLException{
        Connection con= DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from PersonalInfo_Aditya where username='Aditya10'");// In this case if we just know the username we can easily get the password.It is vulnerable.
        // In the personal Info table password is the field that is very secrable. So we need to kept it as safe.But by using statement we can get the password easily.
        while(rs.next()){
            System.out.println(rs.getString("password"));
        }
        con.close();
        st.close();
        rs.close();
    }
}


