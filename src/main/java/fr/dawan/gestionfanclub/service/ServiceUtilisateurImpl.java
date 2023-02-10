package fr.dawan.gestionfanclub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.gestionfanclub.dao.UtilisateurRepository;
import fr.dawan.gestionfanclub.entities.Utilisateur;
import fr.dawan.gestionfanclub.enums.Role;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ServiceUtilisateurImpl implements IServiceUtilisateur{

	@Autowired
	private UtilisateurRepository uRepository;
	@Override
	public List<Utilisateur> findAllAdmin() {
		// TODO Auto-generated method stub
		return uRepository.findAllByRole("ADMIN");
	}

	@Override
	public List<Utilisateur> findAllUtilisateur() {
		// TODO Auto-generated method stub
		return uRepository.findAllByRole("USER");
	}

	@Override
	public List<Utilisateur> findAllSubscriber() {
		// TODO Auto-generated method stub
		return uRepository.findAllByRole("SUBSCRIBER");
	}
	
}
