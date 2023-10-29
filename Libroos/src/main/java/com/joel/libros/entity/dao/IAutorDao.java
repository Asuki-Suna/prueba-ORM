package com.joel.libros.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.joel.libros.entity.models.Autor;

public interface IAutorDao extends CrudRepository<Autor, Long>{

}
