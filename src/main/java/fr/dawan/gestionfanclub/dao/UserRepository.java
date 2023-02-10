package fr.dawan.gestionfanclub.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.dawan.gestionfanclub.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

	@Query("FROM user u WHERE u.role = :role")
	List<User> findAllByRole(String role);

	@Query("SELECT * user u ")
	List<User> findAll();
	
	
}
