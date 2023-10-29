package com.joel.libros.entity.models;

import jakarta.persistence.*;

@Entity
@Table(name = "libro", schema = "libros", catalog = "")

public class Libro {
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Id
	    @Column(name = "ISBN")
	    private int isbn;
	    @Basic
	    @Column(name = "Titulo")
	    private String titulo;
	    @Basic
	    @Column(name = "Anio")
	    private Integer anio;
	    @Basic
	    @Column(name = "Precio")
	    private Integer precio;
	    
	    @ManyToOne
	    @JoinColumn(name = "id_autor", referencedColumnName = "ID_Autor")
	    private Autor autorByIdAutor;
	    @ManyToOne
	    @JoinColumn(name = "id_genero", referencedColumnName = "ID_Genero")
	    private Genero generoByIdGenero;

	    public int getIsbn() {
	        return isbn;
	    }

	    public void setIsbn(int isbn) {
	        this.isbn = isbn;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public Integer getAnio() {
	        return anio;
	    }

	    public void setAnio(Integer anio) {
	        this.anio = anio;
	    }

	    public Integer getPrecio() {
	        return precio;
	    }

	    public void setPrecio(Integer precio) {
	        this.precio = precio;
	    }



	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Libro that = (Libro) o;

	        if (isbn != that.isbn) return false;
	        if (titulo != null ? !titulo.equals(that.titulo) : that.titulo != null) return false;
	        if (anio != null ? !anio.equals(that.anio) : that.anio != null) return false;
	        if (precio != null ? !precio.equals(that.precio) : that.precio != null) return false;

	        return true;
	    }

	    @Override
	    public int hashCode() {
	        int result = isbn;
	        result = 31 * result + (titulo != null ? titulo.hashCode() : 0);
	        result = 31 * result + (anio != null ? anio.hashCode() : 0);
	        result = 31 * result + (precio != null ? precio.hashCode() : 0);
	        return result;
	    }

	    public Autor getAutorByIdAutor() {
	        return autorByIdAutor;
	    }

	    public void setAutorByIdAutor(Autor autorByIdAutor) {
	        this.autorByIdAutor = autorByIdAutor;
	    }

	    public Genero getGeneroByIdGenero() {
	        return generoByIdGenero;
	    }

	    public void setGeneroByIdGenero(Genero generoByIdGenero) {
	        this.generoByIdGenero = generoByIdGenero;
	    }
	}
