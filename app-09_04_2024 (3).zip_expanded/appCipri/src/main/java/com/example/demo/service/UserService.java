package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.User;

//Indicamos en el codigo la lista de usuarios

@Service
public class UserService {

	private List<User> users = new ArrayList<>();
	
	public UserService() {		
		User user = new User(1L,"Cipri", "1", "cipri@guapo.es");
		users.add(user);
		
		user = new User(2L,"Pepe", "12", "pepe@guapo.es");
		users.add(user);
		
		user = new User(3L,"Juan", "33", "juan@guapo.es");
		users.add(user);
	}
	
	//Devuelve toda la lista de usuarios
	
	public List<User> getAllUsers(){
		return users;
	}
	
	//Encontrar dicho usuario mediante su ID
	
	public User findById(Long id){
		User found = null;
		for(User user: users) {
			if(user.getId() == id) {
				found = user;
				break;
			}
		}
		return found;
	}
	
	//Crear un usuario
	
	public User createUser(User user){
		users.add(user);
		return user;
	}
	
	//Borrar un usuario con su ID
	public boolean deleteUserById(Long id) {
		User user = this.findById(id);
		return users.remove(user);
	}

}
