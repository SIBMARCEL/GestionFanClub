package fr.dawan.gestionfanclub.service;

import java.util.List;

import fr.dawan.gestionfanclub.entities.User;


public interface IServiceUser {

	List<User> findAllAdmin();
	List<User> findAllUser();
	List<User> findAllSubscriber();
	
}
