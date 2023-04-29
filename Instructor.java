package com.jose.modelo;
public class Instructor{
	
	String nombre;
	String apellido;
	String direccion; 		
	int telefono;
	int codigo;
	
	public Instructor(int codigo, String nombre, String apellido, int telefono, String direccion){
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.telefono=telefono;
		this.codigo=codigo;
	
	}
	public String getNombre(){
		return nombre;
	}									
	public String getApellido(){
		return apellido;
	}
	public String getDireccion(){
		return direccion;
	}
	public int getTelefono(){			
		return telefono;
	}
	public int getcodigoIns(){			
		return codigo;
	}
	
	public void setNombre(String nombre){ 												
		this.nombre=nombre;
	}
	public void setApellido(String apellido){		
		this.apellido=apellido;
	}
	public void setDireccion(String direccion){			
		this.direccion=direccion;
	}
	public void setTelefono(int telefono){
		this.telefono=telefono;
	}
	public void setcodigoIns(int codigo){
		this.codigo=codigo;
	}
}
