package fr.dawan.gestionfanclub.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import fr.dawan.gestionfanclub.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	//@Query("SELECT op FROM Operation op WHERE op.compte.numCompte=:x order by op.numOperation desc")
	//Page<Operation> listOperation(@Param("x") String numCpte, Pageable pageable);
	
	List<Post> findAll(String utilisateur);
	List<Post> findAll();
	List<Post> findAllByUser();
	
	void delete(Post post);
	void update(Post post);
	void create(Post post);

}
