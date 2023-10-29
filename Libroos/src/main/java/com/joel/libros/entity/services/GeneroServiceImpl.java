package com.joel.libros.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joel.libros.entity.dao.IGeneroDao;
import com.joel.libros.entity.models.Genero;

@Service
public class GeneroServiceImpl implements IGeneroService{

	@Autowired
	private IGeneroDao generoDao;
	
	@Override
	public Genero get(long id) {
		return generoDao.findById(id).get();
	}

	@Override
	public List<Genero> getAll() {
		return (List<Genero>) generoDao.findAll();
	}

	@Override
	public void post(Genero genero) {
		generoDao.save(genero);
		
	}

	@Override
	public void put(Genero genero, long id) {
		generoDao.findById(id).ifPresent((x)->{
			genero.setIdGenero((int) id);
			generoDao.save(genero);
		});
		
	}

	@Override
	public void delete(long id) {
		generoDao.deleteById(id);
		
	}

}
