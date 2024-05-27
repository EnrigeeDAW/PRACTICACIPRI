package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;

@RestController
public class AppController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/hola")
	public String welcome() {
		return "HELLO WORLD";
	}
	
	@GetMapping("/usersAll")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/findById")
	public User findById(@RequestParam(name = "id") Long id) {
		return userService.findById(id);
	}
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/deleteUserById")
	public boolean createUser(@RequestParam(name="id") Long id) {
		return userService.deleteUserById(id);
	}
	
	
	
	
	
	
	
}