package com.joel.libros.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joel.libros.entity.dao.IAutorDao;
import com.joel.libros.entity.models.Autor;

@Service
public class AutorServiceImpl implements IAutorService{

	@Autowired
	private IAutorDao autorDao;
	
	@Override
	public Autor get(long id) {
		return autorDao.findById(id).get();
	}

	@Override
	public List<Autor> getAll() {
		return (List<Autor>) autorDao.findAll();
	}

	@Override
	public void post(Autor autor) {
		System.out.println(autor.getfNacimiento());
		autorDao.save(autor);
		
	}

	@Override
	public void put(Autor autor, long id) {
		autorDao.findById(id).ifPresent((x)->{
			autor.setIdAutor((int) id);
			autorDao.save(autor);
		});
		
	}

	@Override
	public void delete(long id) {
		autorDao.deleteById(id);
		
	}

}
