package com.jose.modelo;
public class Salon{
	
	String nombre;
	int cantidad; 		
	int codigo_salon;
	
	public Salon(String nombre, int cantidad, int codigo_salon){
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.codigo_salon=codigo_salon;
	
	}
	public String getNombre(){
		return nombre;
	}									
	public int getCantidad(){
		return cantidad;
	}
	public int getcodigoSalon(){			
		return codigo_salon;
	}
	
	public void setNombre(String nombre){ 												
		this.nombre=nombre;
	}	
	public void setCantidad(int cantidad){			
		this.cantidad=cantidad;
	}
	public void setcodigoSalon(int codigo_salon){
		this.codigo_salon=codigo_salon;
	}
}