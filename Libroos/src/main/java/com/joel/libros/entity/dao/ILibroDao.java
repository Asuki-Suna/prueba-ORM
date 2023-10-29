package com.joel.libros.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.joel.libros.entity.models.Libro;

public interface ILibroDao extends CrudRepository<Libro, Long>{

}
