package com.jose.modelo;
public class Usuario2{
	
	String nombre;
	String rol;
	String clave; 
	int idUsuario;		

	public Usuario2(){
		idUsuario=0;
		nombre="coor";
		clave="4321";
		rol="c";
	}
	
	public Usuario2(String nombre, String rol, String clave, int idUsuario){
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
	
	public void setNombreu(String nombre){
		this.nombre=nombre;
	}
	
	public void setidUsuario(int idUsuario){
		this.idUsuario=idUsuario;
	}

}