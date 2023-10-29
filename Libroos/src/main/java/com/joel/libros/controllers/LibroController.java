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

import com.joel.libros.entity.models.Libro;
import com.joel.libros.entity.services.ILibroService;

@CrossOrigin(origins="*")
@RestController
public class LibroController {
	
	@Autowired
	ILibroService libroService;
	
	@GetMapping("/libro")
	public List<Libro> getAllAutor(){
		return libroService.getAll();
	}
	
	@GetMapping("/libro/{id}")
	public Libro getOne(@PathVariable(value = "id") long id) {
		return libroService.get(id);
	}
	
	@PostMapping("/libro")
	public void post(Libro libro) {
		libroService.post(libro);
	}
	
	@PutMapping("/libro/{id}")
	public void put(Libro libro, @PathVariable(value = "id") long id) {
		libroService.put(libro, id);
	}
	
	@DeleteMapping("/libro/{id}")
	public void delete(@PathVariable(value = "id")long id) {
		libroService.delete(id);
	}

}
