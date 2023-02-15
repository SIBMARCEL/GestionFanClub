package fr.dawan.gestionfanclub.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.dawan.gestionfanclub.entities.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("FROM user u WHERE u.role =:role")
	List<User> findAllByRole(String role, Pageable page);

	@Query("SELECT * user u ")
	List<User> findAll();

	@Query("FROM user u WHERE u.pseudo =:pseudo")
	User findUserByPseudo(@Param("pseudo") String pseudo);

	@Query("FROM user u WHERE u.active =:active")
	List<User> findAllActive(@Param("active") boolean active);

}
