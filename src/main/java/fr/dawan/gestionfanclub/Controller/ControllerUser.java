package fr.dawan.gestionfanclub.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.gestionfanclub.entities.User;
import fr.dawan.gestionfanclub.service.IServiceUser;

@RestController
@RequestMapping("/api/user")
public class ControllerUser {

	@Autowired
	private IServiceUser iServiceU;
	
	@GetMapping(value ="/admin", produces = "application/json")
	public List<User> findAllAdmin(Pageable pageable){
		return iServiceU.findAllAdmin(pageable);
		
	}
	
	@GetMapping(value="/subscriber", produces="application/json")
	public List<User> findAllSubscriber(Pageable pageable){
		return iServiceU.findAllSubscriber(pageable);
	}
	
	@GetMapping(value="/user",produces="application/json")
	
	public List<User> findAllUser(Pageable pageable){
		return iServiceU.findAllUser(pageable);
	}
	@GetMapping(value="/pseudo/{pseudo}",produces="application/json")
	public User findUserByPseudo(@PathVariable String pseudo) {
		return iServiceU.findUserByPseudo(pseudo);
	}
	
	@DeleteMapping(value="/{id}",produces="application/json",consumes = "application/json")
	public void deleteUser(@PathVariable Long id) {
		
		iServiceU.deleteUser(id);
		
		
	}
	
//	@PostMapping(produces="application/json", consumes="application.json")
//	public User createUser(@RequestBody User user) {
//		return iServiceU.createUser(user);
//	}
	
//	@PutMapping(produces ="application/json", consumes="application.json")
//	public User updateUser(@RequestBody User user) {
//		return iServiceU.updateUser(user);
//	}
	
	
	
	
	
}
