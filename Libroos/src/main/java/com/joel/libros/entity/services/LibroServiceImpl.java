package com.joel.libros.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joel.libros.entity.dao.ILibroDao;
import com.joel.libros.entity.models.Libro;

@Service
public class LibroServiceImpl implements ILibroService{

	@Autowired
	private ILibroDao libroDao;
	
	@Override
	public Libro get(long id) {
		return libroDao.findById(id).get();
	}

	@Override
	public List<Libro> getAll() {
		return (List<Libro>) libroDao.findAll();
	}

	@Override
	public void post(Libro libro) {
		libroDao.save(libro);
		
	}

	@Override
	public void put(Libro libro, long id) {
		libroDao.findById(id).ifPresent((x)->{
			libro.setIsbn((int) id);
			libroDao.save(libro);
		});
		
	}

	@Override
	public void delete(long id) {
		libroDao.deleteById(id);
		
	}

}
