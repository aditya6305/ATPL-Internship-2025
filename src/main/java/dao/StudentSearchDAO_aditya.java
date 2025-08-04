package dao;

import model.Student_aditya;
import util.DBUtil_aditya;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentSearchDAO_aditya {
    
    public List<Student_aditya> getAllStudents() {
        List<Student_aditya> list = new ArrayList<>();
        String sql = "SELECT * FROM student_aditya ORDER BY student_id";
        
        try (Connection con = DBUtil_aditya.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(createStudent(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<Student_aditya> searchByRollno(String rollno) {
        List<Student_aditya> list = new ArrayList<>();
        String sql = "SELECT * FROM student_aditya WHERE student_rollno LIKE ? ORDER BY student_id";
        
        try (Connection con = DBUtil_aditya.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "%" + rollno + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(createStudent(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public Student_aditya getById(int id) {
        String sql = "SELECT * FROM student_aditya WHERE student_id = ?";
        try (Connection con = DBUtil_aditya.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return createStudent(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private Student_aditya createStudent(ResultSet rs) throws SQLException {
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
}
