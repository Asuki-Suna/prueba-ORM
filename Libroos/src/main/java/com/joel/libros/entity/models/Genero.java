package com.joel.libros.entity.models;

import jakarta.persistence.*;


@Entity
@Table(name = "genero", schema = "libros", catalog = "")

public class Genero {
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Id
	    @Column(name = "ID_Genero")
	    private int idGenero;
	    @Basic
	    @Column(name = "Nombre")
	    private String nombre;
	    @Basic
	    @Column(name = "Descripcion")
	    private String descripcion;


	    public int getIdGenero() {
	        return idGenero;
	    }

	    public void setIdGenero(int idGenero) {
	        this.idGenero = idGenero;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }


	}
