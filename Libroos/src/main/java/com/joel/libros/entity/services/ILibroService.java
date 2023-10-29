package com.joel.libros.entity.services;

import java.util.List;

import com.joel.libros.entity.models.Libro;

public interface ILibroService {
	public Libro get(long id);
	public List<Libro> getAll();
	public  void post(Libro libro);
	public void put(Libro libro, long id);
	public void delete(long id);
}
