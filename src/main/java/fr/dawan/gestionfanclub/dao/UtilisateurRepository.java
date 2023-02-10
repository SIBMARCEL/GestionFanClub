package fr.dawan.gestionfanclub.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.dawan.gestionfanclub.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long>{

	@Query("FROM Utilisateur u WHERE u.role = :role")
	List<Utilisateur> findAllByRole(String role);
	
	
	
}
