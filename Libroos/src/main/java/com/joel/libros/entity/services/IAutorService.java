package com.joel.libros.entity.services;

import java.util.List;

import com.joel.libros.entity.models.Autor;

public interface IAutorService {
	public Autor get(long id);
	public List<Autor> getAll();
	public  void post(Autor autor);
	public void put(Autor autor, long id);
	public void delete(long id);
}
