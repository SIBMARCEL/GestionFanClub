package fr.dawan.gestionfanclub.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<User> findAllAdmin(){
		return iServiceU.findAllAdmin();
	}
	
}
