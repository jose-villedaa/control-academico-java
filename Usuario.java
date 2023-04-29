package com.jose.modelo;
public class Usuario{
	
	String nombre;
	String rol;
	String clave; 
	int idUsuario;		

	public Usuario(){
		idUsuario=0;
		nombre="admin";
		clave="1234";
		rol="d";
	}
	
	public Usuario(String nombre, String rol, String clave, int idUsuario){
		this.nombre=nombre;
		this.rol=rol;
		this.clave=clave;
		this.idUsuario=idUsuario;
	}		
	public String getRol(){
		return rol;
	}
	public String getClave(){
		return clave;
	}
	public String getNombre(){			
		return nombre;
	}
	public int getidUsuario(){
		return idUsuario;
	}
	

	public void setRol(String rol){		
		this.rol=rol;
	}
	public void setClave(String clave){			
		this.clave=clave;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setidUsuario(int idUsuario){
		this.idUsuario=idUsuario;
	}

}