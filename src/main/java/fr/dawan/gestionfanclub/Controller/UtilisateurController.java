package fr.dawan.gestionfanclub.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.gestionfanclub.entities.Utilisateur;
import fr.dawan.gestionfanclub.service.IServiceUtilisateur;

@RestController
@RequestMapping("/api/utilisateur")
public class UtilisateurController {

	@Autowired
	private IServiceUtilisateur iServiceU;
	
	@GetMapping(value ="/admin", produces = "application/json")
	public List<Utilisateur> findAllAdmin(){
		return iServiceU.findAllAdmin();
	}
}
