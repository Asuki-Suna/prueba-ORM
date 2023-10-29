package com.joel.libros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joel.libros.entity.models.Genero;
import com.joel.libros.entity.services.IGeneroService;

@CrossOrigin(origins="*")
@RestController
public class GeneroController {
	
	@Autowired
	IGeneroService generoService;
	
	@GetMapping("/genero")
	public List<Genero> getAllAutor(){
		return generoService.getAll();
	}
	
	@GetMapping("/genero/{id}")
	public Genero getOne(@PathVariable(value = "id") long id) {
		return generoService.get(id);
	}
	
	@PostMapping("/genero")
	public void post(Genero genero) {
		generoService.post(genero);
	}
	
	@PutMapping("/genero/{id}")
	public void put(Genero genero, @PathVariable(value = "id") long id) {
		generoService.put(genero, id);
	}
	
	@DeleteMapping("/genero/{id}")
	public void delete(@PathVariable(value = "id")long id) {
		generoService.delete(id);
	}

}
