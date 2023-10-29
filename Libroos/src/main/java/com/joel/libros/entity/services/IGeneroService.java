package com.joel.libros.entity.services;

import java.util.List;

import com.joel.libros.entity.models.Genero;

public interface IGeneroService {
	public Genero get(long id);
	public List<Genero> getAll();
	public  void post(Genero libro);
	public void put(Genero libro, long id);
	public void delete(long id);
}
