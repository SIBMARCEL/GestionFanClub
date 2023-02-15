package fr.dawan.gestionfanclub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.dawan.gestionfanclub.dao.UserRepository;
import fr.dawan.gestionfanclub.entities.User;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ServiceUserImpl implements IServiceUser{
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAllAdmin(Pageable pageable) {
	 return  userRepository.findAllByRole("ADMIN", pageable);
	}

	@Override
	public List<User> findAllUser(Pageable pageable) {
		return  userRepository.findAll(pageable).getContent();
	}

	@Override
	public List<User> findAllSubscriber(Pageable pageable) {
		 return  userRepository.findAllByRole("SUBSCRIBER", pageable);
	}

	@Override
	public User findUserByPseudo(String pseudo) {
		 return userRepository.findUserByPseudo(pseudo);
	}

	@Override
	public List<User> findAllActive(boolean active,Pageable pageable) {
	 return userRepository.findAllActive(active,pageable);
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	
	
}