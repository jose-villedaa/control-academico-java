package com.jose.manejador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import com.jose.vista.*;
import com.jose.modelo.*;
import com.jose.manejador.*;


import java.util.ArrayList;
public class ManejadorInstructor{
	Buffer Scan=new Buffer();
	ArrayList<Instructor> aInstructor=new ArrayList<Instructor>();

	public void agregarInstructor(int codigo,String nombre, String apellido, int telefono, String direccion){

		aInstructor.add(new Instructor(codigo,nombre,apellido,telefono,direccion));
	}


	public void reporteInstructor(){
		for(Instructor i:aInstructor){
			System.out.println(i.getcodigoIns()+" | "+i.getNombre()+" "+ i.getApellido()+" | "+i.getTelefono()+" | "+i.getDireccion()+"\r\n");
		}
	}
	public void buscarInstructor(){
	int buscar;

		System.out.println("Ingrese el codigo del Instructor");
		buscar=Scan.ingresarNumero();
		for(Instructor i:aInstructor){
			if (buscar==i.getcodigoIns()){
			System.out.println("Efectivamente, la persona existe!");
			reporteInstructor();
	}	}

}
	public void eliminarInstructor(int Instructor, int codigo){
		for (int i = 0; i < aInstructor.size(); i++) {
            if (codigo==(aInstructor.get(i).getcodigoIns())) {
            	aInstructor.remove(i);
        }    		
    }       } 	

    public void modificarInstructor(int codigo,String nombre, String apellido, int telefono, String direccion) {
    	int mod;
        for (int i = 0; i < aInstructor.size(); i++) {
            if (codigo==(aInstructor.get(i).getcodigoIns())) {
                aInstructor.get(i).setNombre(nombre);
                aInstructor.get(i).setApellido(apellido);
                aInstructor.get(i).setTelefono(telefono);
                aInstructor.get(i).setDireccion(direccion);
        System.out.println("Ingrese el id del Instructor");
        System.out.println("---------------------------------");
				codigo=Scan.ingresarNumero();
				System.out.println("1. Nombre");
				System.out.println("2. Apellido");
				System.out.println("3. Telefono");
				System.out.println("4. Direccion ");
				System.out.println("---------------------------------");
				mod=Scan.ingresarNumero();
			switch(mod){
				case 1:
				
				System.out.println("Ingrese ingrese el nombre del Instructor: ");
				nombre=Scan.ingresarTexto();
				aInstructor.get(i).setNombre(nombre);
				reporteInstructor();
				break;
				case 2:
				System.out.println("Ingrese el apellido");
				apellido=Scan.ingresarTexto();
				aInstructor.get(i).setApellido(apellido);
				reporteInstructor();
				break;
				case 3:
				System.out.println("ingrese el telefono del Instructor: ");
				telefono=Scan.ingresarNumero();
				aInstructor.get(i).setTelefono(telefono);
				reporteInstructor();
				break;
				case 4:
				System.out.println("Ingrese la nueva cantidad de alumnos ");
				direccion=Scan.ingresarTexto();
				aInstructor.get(i).setDireccion(direccion);
				reporteInstructor();
				break;
			}		
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
            for (Instructor i:aInstructor){
            	bw.write(i.getcodigoIns()+" | "+i.getNombre()+" "+ i.getApellido()+" | "+i.getTelefono()+" | "+i.getDireccion()+"\r\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
	    }
	}	
	
}