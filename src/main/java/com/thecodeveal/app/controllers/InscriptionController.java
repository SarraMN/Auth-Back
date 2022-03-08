package com.thecodeveal.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thecodeveal.app.entities.User;
import com.thecodeveal.app.services.UserService;

@RestController
@RequestMapping("/api")
public class InscriptionController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/signup")	
	 public  ResponseEntity<?> SignUp(@RequestBody User user) {
		 userService.add(user);		
		 return ResponseEntity.ok("user ajouté avec succée");
		
	}
	

}
