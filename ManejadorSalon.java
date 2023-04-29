package com.jose.manejador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.jose.vista.*;
import com.jose.modelo.*;
import com.jose.manejador.*;

import java.util.ArrayList;

public class ManejadorSalon{
	Buffer Scan=new Buffer();
	ArrayList<Salon> aSalon=new ArrayList<Salon>();

	public void agregarSalon(String nombreSalon, int cantidad, int codigo){

		aSalon.add(new Salon(nombreSalon,cantidad,codigo));
	}
	public void reporteSalon(){
		System.out.println("Mostrando arreglo..");
		for(Salon s:aSalon){
			System.out.println(s.getcodigoSalon()+" | "+ s.getNombre()+" | "+s.getCantidad()+"\r\n");
		}
	}
	public void bucarPersona(){
		System.out.println("Buscar Salon: ");
		int buscar;

		System.out.println("Ingrese el codigo del salon: ");
		buscar=Scan.ingresarNumero();
		for(Salon s:aSalon){
			if (buscar==s.getcodigoSalon()){
			System.out.println("El salon si existe: ");
		}	reporteSalon();
	}	
}
	public void eliminarSalon(int Salon, int codigo){
	for (int i = 0; i < aSalon.size(); i++) {
            if (codigo==(aSalon.get(i).getcodigoSalon())) {
            	aSalon.remove(i);
   	}   } 		
}

public void modificarSalon(String nombreSalon, int cantidad, int codigo){
        for (int i = 0; i < aSalon.size(); i++) {
            if (codigo==(aSalon.get(i).getcodigoSalon())) {
                aSalon.get(i).setNombre(nombreSalon);
                aSalon.get(i).setCantidad(cantidad);
        }       	
    }   
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
            for (Salon s:aSalon){
            	bw.write(s.getcodigoSalon()+" | "+ s.getNombre()+" | "+s.getCantidad()+"\r\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
	    }
	}	
}