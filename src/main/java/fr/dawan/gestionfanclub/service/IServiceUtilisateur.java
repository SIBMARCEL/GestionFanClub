package fr.dawan.gestionfanclub.service;

import java.util.List;

import fr.dawan.gestionfanclub.entities.Utilisateur;


public interface IServiceUtilisateur {

	List<Utilisateur> findAllAdmin();
	List<Utilisateur> findAllUtilisateur();
	List<Utilisateur> findAllSubscriber();
}
