package dao;

import model.Student_aditya;
import util.DBUtil_aditya;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO_aditya {
    
    // Add new student
    public void addStudent(Student_aditya s) {
        String sql = "INSERT INTO student_aditya (student_rollno, name, age, grade, mobile, password, is_active) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = DBUtil_aditya.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, s.getStudent_rollno());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setString(4, s.getGrade());
            ps.setString(5, s.getMobile());
            ps.setString(6, s.getPassword());
            ps.setBoolean(7, s.isActive());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Student_aditya> getAllStudents() {
        List<Student_aditya> list = new ArrayList<>();
        try (Connection con = DBUtil_aditya.getConnection()) {
            String sql = "SELECT * FROM student_aditya ORDER BY student_id";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student_aditya s = new Student_aditya();
                s.setId(rs.getInt("student_id"));
                s.setStudent_rollno(rs.getString("student_rollno"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setGrade(rs.getString("grade"));
                s.setMobile(rs.getString("mobile"));
                s.setPassword(rs.getString("password"));
                s.setCreated_by(rs.getString("created_by"));
                s.setUpdated_by(rs.getString("updated_by"));
                s.setActive(rs.getBoolean("is_active"));
                list.add(s);
            }
            System.out.println("Retrieved " + list.size() + " students (all status)");
        } catch (Exception e) {
            System.err.println("Error getting all students: " + e.getMessage());
            e.printStackTrace();
        }
        return list;
    }
    
    // CHANGED: Search ALL students by roll number (both active and inactive)
    public List<Student_aditya> searchStudentsByRollno(String rollno) {
        List<Student_aditya> list = new ArrayList<>();
        try (Connection con = DBUtil_aditya.getConnection()) {
            String sql = "SELECT * FROM student_aditya WHERE student_rollno LIKE ? ORDER BY student_id";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + rollno + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student_aditya s = new Student_aditya();
                s.setId(rs.getInt("student_id"));
                s.setStudent_rollno(rs.getString("student_rollno"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setGrade(rs.getString("grade"));
                s.setMobile(rs.getString("mobile"));
                s.setPassword(rs.getString("password"));
                s.setCreated_by(rs.getString("created_by"));
                s.setUpdated_by(rs.getString("updated_by"));
                s.setActive(rs.getBoolean("is_active"));
                list.add(s);
            }
            System.out.println("Search found " + list.size() + " students for rollno: " + rollno + " (all status)");
        } catch (Exception e) {
            System.err.println("Error searching students: " + e.getMessage());
            e.printStackTrace();
        }
        return list;
    }
    
    // Get student by ID (any status for admin operations)
    public Student_aditya getStudentById(int id) {
        Student_aditya s = null;
        try (Connection con = DBUtil_aditya.getConnection()) {
            String sql = "SELECT * FROM student_aditya WHERE student_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                s = new Student_aditya();
                s.setId(rs.getInt("student_id"));
                s.setStudent_rollno(rs.getString("student_rollno"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setGrade(rs.getString("grade"));
                s.setMobile(rs.getString("mobile"));
                s.setPassword(rs.getString("password"));
                s.setCreated_by(rs.getString("created_by"));
                s.setUpdated_by(rs.getString("updated_by"));
                s.setActive(rs.getBoolean("is_active"));
                System.out.println("Found student: " + s.getName());
            } else {
                System.out.println("No student found with ID: " + id);
            }
        } catch (Exception e) {
            System.err.println("Error getting student by ID: " + e.getMessage());
            e.printStackTrace();
        }
        return s;
    }
    
    // Update student details
    public void updateStudent(Student_aditya s) {
        String sql = "UPDATE student_aditya SET name=?, age=?, grade=?, mobile=? WHERE student_id=?";
        try (Connection con = DBUtil_aditya.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getGrade());
            ps.setString(4, s.getMobile());
            ps.setInt(5, s.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Toggle student active status
    public void status(int id) {
        String sql = "UPDATE student_aditya SET is_active = NOT is_active WHERE student_id = ?";
        try (Connection con = DBUtil_aditya.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error toggling student status: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Get student by Roll Number (for login) - ONLY ACTIVE students can login
    public Student_aditya getByRollno(String rollno) {
        Student_aditya s = null;
        try (Connection con = DBUtil_aditya.getConnection()) {
            String sql = "SELECT * FROM student_aditya WHERE student_rollno = ? AND is_active = TRUE";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, rollno);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                s = new Student_aditya();
                s.setId(rs.getInt("student_id"));
                s.setStudent_rollno(rs.getString("student_rollno"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setGrade(rs.getString("grade"));
                s.setMobile(rs.getString("mobile"));
                s.setPassword(rs.getString("password"));
                s.setCreated_by(rs.getString("created_by"));
                s.setUpdated_by(rs.getString("updated_by"));
                s.setActive(rs.getBoolean("is_active"));
                System.out.println("Login: Found active student " + s.getName() + " with rollno: " + rollno);
            } else {
                System.out.println("Login: No active student found with rollno: " + rollno);
            }
        } catch (Exception e) {
            System.err.println("Error getting student by rollno: " + e.getMessage());
            e.printStackTrace();
        }
        return s;
    }

    public Student_aditya login(String rollno) {
        Student_aditya s = null;
        try (Connection con = DBUtil_aditya.getConnection()) {
            String sql = "SELECT * FROM student_aditya WHERE student_rollno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, rollno);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                s = new Student_aditya();
                s.setId(rs.getInt("student_id"));
                s.setStudent_rollno(rs.getString("student_rollno"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setGrade(rs.getString("grade"));
                s.setMobile(rs.getString("mobile"));
                s.setPassword(rs.getString("password"));
                s.setCreated_by(rs.getString("created_by"));
                s.setUpdated_by(rs.getString("updated_by"));
                s.setActive(rs.getBoolean("is_active"));
                System.out.println("Login validation: Found student " + s.getName() + " with rollno: " + rollno + " (Status: " + (s.isActive() ? "Active" : "Inactive") + ")");
            } else {
                System.out.println("Login validation: No student found with rollno: " + rollno);
            }
        } catch (Exception e) {
            System.err.println("Error getting student by rollno for login: " + e.getMessage());
            e.printStackTrace();
        }
        return s;
    }
}
