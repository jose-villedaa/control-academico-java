package com.jose.manejador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.jose.vista.*;
import com.jose.modelo.*;
import com.jose.manejador.*;

import java.util.ArrayList;
public class ManejadorMateria{
	int opcion;
	int mod;
	Buffer Scan=new Buffer();
	ArrayList<Materias> aMateria=new ArrayList<Materias>();

	public void agregarMateria(String nombreCurso, String descripcion, int codigo){

		aMateria.add(new Materias(nombreCurso,descripcion,codigo));
	}
	public void reporteMateria(){
		System.out.println("Mostrando Materias: ");
		for(Materias m:aMateria){
			System.out.println(m.getcodigoMateria()+" | "+ m.getNombreCurso()+" | "+m.getDescripcion());
		}
	}
	public void modificarMateria(String nombreCurso, String descripcion, int codigo) {
        for (int i = 0; i < aMateria.size(); i++) {
            if (codigo==(aMateria.get(i).getcodigoMateria())) {
                aMateria.get(i).setNombreCurso(nombreCurso);
                aMateria.get(i).setDescripcion(descripcion);
        }       	
    }   
}
	public void eliminarMateria(int Materias, int codigo){
		for (int i = 0; i < aMateria.size(); i++) {
            if (codigo==(aMateria.get(i).getcodigoMateria())) {
            	aMateria.remove(i);
        }   } 	
		
	}
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
            for (Materias m:aMateria){
            	bw.write(m.getcodigoMateria()+" | "+ m.getNombreCurso()+" | "+m.getDescripcion()+"\r\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
	    }
	}
}







