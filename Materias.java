package com.jose.modelo;
public class Materias{
	
	String nombreCurso;
	String descripcion; 		
	int codigo;
	
	public Materias(String nombreCurso, String descripcion, int codigo){
		this.nombreCurso=nombreCurso;
		this.descripcion=descripcion;
		this.codigo=codigo;
	}
	public String getNombreCurso(){
		return nombreCurso;
	}									
	public String getDescripcion(){
		return descripcion;
	}
	public int getcodigoMateria(){			
		return codigo;
	}
	
	public void setNombreCurso(String nombreCurso){ 												
		this.nombreCurso=nombreCurso;
	}	
	public void setDescripcion(String descripcion){			
		this.descripcion=descripcion;
	}
	public void setcodigoMateria(int codigo){
		this.codigo=codigo;
	}
}