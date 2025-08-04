package dao;

import util.DBUtil_aditya;
import java.sql.*;

public class AdminDAO_aditya {
    public boolean validateAdmin(String username, String password) {
        String sql = "SELECT * FROM admin_aditya WHERE username = ? AND password = ?";
        
        try (Connection con = DBUtil_aditya.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, username);
            ps.setString(2, password);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Admin login successful: " + username);
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Admin login failed: " + username);
        return false;
    }
}
