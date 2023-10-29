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

import com.joel.libros.entity.models.Autor;
import com.joel.libros.entity.services.IAutorService;

@CrossOrigin(origins="*")
@RestController
public class AutorController {
	
	@Autowired
	IAutorService autorService;
	
	@GetMapping("/autor")
	public List<Autor> getAllAutor(){
		return autorService.getAll();
	}
	
	@GetMapping("/autor/{id}")
	public Autor getOne(@PathVariable(value = "id") long id) {
		return autorService.get(id);
	}
	
	@PostMapping("/autor")
	public void post(Autor autor) {
		autorService.post(autor);
	}
	
	@PutMapping("/autor/{id}")
	public void put(Autor autor, @PathVariable(value = "id") long id) {
		autorService.put(autor, id);
	}
	
	@DeleteMapping("/autor/{id}")
	public void delete(@PathVariable(value = "id")long id) {
		autorService.delete(id);
	}
}
