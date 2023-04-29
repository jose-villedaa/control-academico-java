package com.jose.manejador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.util.ArrayList;
import com.jose.vista.*;
import com.jose.manejador.*;
import com.jose.modelo.*;

public class ManejadorUser{
Usuario user=new Usuario();
Usuario2 us=new Usuario2();
Buffer Scan=new Buffer();
	ArrayList<Usuario> aUsuario=new ArrayList<Usuario>();
	ArrayList<Usuario2> aUsuario2=new ArrayList<Usuario2>();

	
	public void logInicial(String usuario, String clave){
			PantallaDirector pDir=new PantallaDirector();
		PantallaCoordinador pCor=new PantallaCoordinador();


		if(usuario.equals(user.getNombre())&& clave.equals(user.getClave())){
			if(user.getRol().equals("d")){
				pDir.menuPrincipa();
			}	
			}else if(usuario.equals(us.getNombre())&& clave.equals(us.getClave())){
				if(us.getRol().equals("c")){
				pCor.menuPrincipa();
			}
			
			
		}else{
				System.out.println("Datos erroneos");
		}
	}

	

	public void agregarUsuario(String nombre, String rol, String clave,int id ){

		aUsuario.add(new Usuario(nombre,rol,clave,id));
	}

	public void reporteUsuario(){
		System.out.println("Mostrando arreglo..");
		for(Usuario u:aUsuario){
			System.out.println(u.getidUsuario()+" | "+u.getNombre()+" | "+u.getRol()+" | "+u.getClave()+"\r\n");
		}
	}	

	public void modificarUsuario(String nombre, String rol, String clave, int id) {
    	int mod;
        for (int i = 0; i < aUsuario.size(); i++) {
            if (id==(aUsuario.get(i).getidUsuario())) {
                aUsuario.get(i).setNombre(nombre);
                aUsuario.get(i).setRol(rol);
                aUsuario.get(i).setClave(clave);
                aUsuario.get(i).setidUsuario(id);

        		System.out.println("Ingrese el id del Usuario: ");
				id=Scan.ingresarNumero();
				System.out.println("--------------------");
				System.out.println("1. Nombre");
				System.out.println("2. Clave");
				System.out.println("3. Rol");
				System.out.println("--------------------");
				mod=Scan.ingresarNumero();
			switch(mod){

				case 1:
				System.out.println("Ingrese el nombre del Usuario: ");
				nombre=Scan.ingresarTexto();
				aUsuario.get(i).setNombre(nombre);
				reporteUsuario();
				break;

				case 2:
				System.out.println("Ingrese la clave");
				clave=Scan.ingresarTexto();
				aUsuario.get(i).setClave(clave);
				reporteUsuario();
				break;

				case 3:
				System.out.println("ingrese el rol: ");
				rol=Scan.ingresarTexto();
				aUsuario.get(i).setRol(rol);
				reporteUsuario();
				break;
			}		
        }       	
    }   	
}
public void eliminarUsuario(int Usuario, int id){
		for (int i = 0; i < aUsuario.size(); i++) {
            if (id==(aUsuario.get(i).getidUsuario())) {
            	aUsuario.remove(i);
        }    		
    }       } 	
public void reportetxt(){
		String ruta=null;
		System.out.println("ingrese la ruta para el archivo txt");
		ruta=Scan.ingresarTexto();
		try {
			File file=new File(ruta);
            if (!file.exists()) {
            	System.out.println("El archivo ha sido creado!");
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Usuario u:aUsuario){
            	bw.write(u.getidUsuario()+" | "+u.getNombre()+" | "+u.getRol()+" | "+u.getClave());
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
	    }
	}	
}



	
		
	
			
	

	