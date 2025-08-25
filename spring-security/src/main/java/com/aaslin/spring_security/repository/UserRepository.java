//package com.aaslin.spring_security.repository;
//
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.aaslin.spring_security.model.AuthRequest;
//
//public interface UserRepository extends JpaRepository<AuthRequest, String>{
//	
//	Optional<AuthRequest> findByUsername(String username);
//
//}

package com.aaslin.spring_security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aaslin.spring_security.model.AuthRequest;
public interface UserRepository extends JpaRepository<AuthRequest, Long>{
	Optional<AuthRequest> findByusername(String username);
}
