package fr.dawan.gestionfanclub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.dawan.gestionfanclub.entities.User;


@Service
public interface IServiceUser {

	List<User> findAllAdmin();
	//List<User> findAllUser();
	//List<User> findAllSubscriber();
	
}
