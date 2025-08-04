package dao;

import model.Student_aditya;
import util.DBUtil_aditya;
import java.sql.*;

public class StudentLoginDAO_aditya {
    
    public Student_aditya findStudentByRollno(String rollno) {
        String sql = "SELECT * FROM student_aditya WHERE student_rollno = ?";
        
        try (Connection con = DBUtil_aditya.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, rollno);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                Student_aditya s = new Student_aditya();
                s.setId(rs.getInt("student_id"));
                s.setStudent_rollno(rs.getString("student_rollno"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setGrade(rs.getString("grade"));
                s.setMobile(rs.getString("mobile"));
                s.setPassword(rs.getString("password"));
                s.setActive(rs.getBoolean("is_active"));
                return s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
