package com.joel.libros.entity.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "autor", schema = "libros", catalog = "")

public class Autor{
	
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Id
	    @Column(name = "ID_Autor")
	    private int idAutor;
	   // @Basic
	    @Column(name = "Nombre")
	    private String nombre;
	   // @Basic
	    @Column(name = "Apellido")
	    private String apellido;
	   // @Basic
	    @Column(name = "F_Nacimiento")
	    private String fNacimiento;


	    public int getIdAutor() {
	        return idAutor;
	    }

	    public void setIdAutor(int idAutor) {
	        this.idAutor = idAutor;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

		public String getfNacimiento() {
			return fNacimiento;
		}

		public void setfNacimiento(String fNacimiento) {
			this.fNacimiento = fNacimiento;
		}





	}
