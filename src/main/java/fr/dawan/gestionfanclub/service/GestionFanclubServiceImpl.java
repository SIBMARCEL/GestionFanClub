package fr.dawan.gestionfanclub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import fr.dawan.gestionfanclub.dao.CadeauxRepository;
import fr.dawan.gestionfanclub.dao.ClubsRepository;
import fr.dawan.gestionfanclub.dao.PostRepository;
import fr.dawan.gestionfanclub.dao.RubriquesRepository;
import fr.dawan.gestionfanclub.dao.UtilisateurRepository;

@Service
@Transactional

public class GestionFanclubServiceImpl implements IGestionFanclubService{
	
	
	
	@Autowired
	private PostRepository postrepository;
	
	@Autowired
	private RubriquesRepository rubriquesrepository;
	
	@Autowired 

	private UtilisateurRepository utilisateurrepository;
	
	@Autowired 

	private CadeauxRepository cadeauxrepository;
	
	
	
	@Autowired 

	private ClubsRepository clubrepository;
	
	
	
	
	

	@Override
	public void poster(String post) {
		
			
		
	}

	@Override
	public void resilierAbonnement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimersonCompte() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerPostes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sAbonner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CreerPromotions() {
		// TODO Auto-generated method stub
		
	}

}
