package com.leohenrique.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leohenrique.course.entities.User;
import com.leohenrique.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return  this.repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = this.repository.findById(id);
		return user.get();
	}

	public User insert(User user) {
		return this.repository.save(user);
	}

	public void delete(Long id) {
		this.repository.deleteById(id);
	}

	public User update(Long id, User obj) {
		User entity = this.repository.getReferenceById(id);
		this.updateData(entity, obj);
		return this.repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
