package com.aaslin.student_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.aaslin.student_management.model.Admin;
import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    
    // Finding active admin by username
    @Query("SELECT a FROM Admin a WHERE a.username = ?1 AND a.isActive = true")
    Optional<Admin> findByUsername(String username);
    
    // Finding active admin by username and password for login
    @Query("SELECT a FROM Admin a WHERE a.username = ?1 AND a.password = ?2 AND a.isActive = true")
    Optional<Admin> findByUsernameAndPassword(String username, String password);
}
