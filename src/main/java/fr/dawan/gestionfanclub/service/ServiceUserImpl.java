package fr.dawan.gestionfanclub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.gestionfanclub.dao.UserRepository;
import fr.dawan.gestionfanclub.entities.User;
import fr.dawan.gestionfanclub.enums.Role;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ServiceUserImpl implements IServiceUser{

	@Autowired
	private UserRepository uRepository;
	@Override
	public List<User> findAllAdmin() {
		// TODO Auto-generated method stub
		return uRepository.findAllByRole("ADMIN");
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return uRepository.findAllByRole("USER");
	}

	@Override
	public List<User> findAllSubscriber() {
		// TODO Auto-generated method stub
		return uRepository.findAllByRole("SUBSCRIBER");
	}
	
}
