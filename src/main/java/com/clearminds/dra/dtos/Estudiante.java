package com.clearminds.dra.dtos;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private int id;
	
	public Estudiante(String nombre, String apellido, int id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}

	public Estudiante(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	

}
