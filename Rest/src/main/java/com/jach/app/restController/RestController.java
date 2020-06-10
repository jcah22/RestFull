package com.jach.app.restController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	@GetMapping("/")
	public String metodoGet() {
		
		return "Metodo Get";
	}
	
	
	@PostMapping("/")
	public String metodoPost() {
		
		
		return "Metodo Post";
	}
	
	@PutMapping("/")
	public String metodoPut() {
		
		return "Metodo Put";
	}
	
	@DeleteMapping("/")
	public String metodoDelete() {
		
		return "Metodo Delete";
	}
	
	
	
	
	
}
