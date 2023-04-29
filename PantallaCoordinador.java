package com.jose.vista;
import com.jose.vista.*;
import com.jose.manejador.*;
import com.jose.modelo.*;
public class PantallaCoordinador{

	Buffer Scan=new Buffer();
	Login login=new Login();

	int opcion;
	int idCurso=0;
	int idSalon=0;
	int idIns=0;
	int idUser=0;

	String nombreCurso;
	String descripcion;
	String nombreSalon;
	int cantidad;
	String nombre;
	String direccion;
	int telefono;
	String apellido;
	String rol;
	String clave;

	ManejadorMateria cMateria=new ManejadorMateria();
	ManejadorSalon cSalon=new ManejadorSalon(); 
	ManejadorInstructor cInstructor=new ManejadorInstructor();


	public void menuPrincipa(){
		System.out.println("---------------------------------");
		System.out.println("Menu Coordinador");
		System.out.println("---------------------------------");
		System.out.println("1. Materia");
		System.out.println("2. Instructor");
		System.out.println("3. Asignar");
		System.out.println("4. Salir a login <---");
		System.out.println("---------------------------------");
		opcion=Scan.ingresarNumero();
		switch(opcion){
			case 1:
			this.menuMateria();
			break;

			case 2:
			this.menuInstructor();

			case 3:
			break;

			case 4:
			this.menuLogin();
			break;

			default:
			System.out.println("no existe la opcion");
			this.menuPrincipa();
			break;



		}	
	}	

	public void menuMateria(){
		int mod;
		String op;
		String buscar;

		System.out.println("1... Crear");
		System.out.println("2... Reporte");
		System.out.println("3... Regresar <--");
		opcion=Scan.ingresarNumero();

		switch(opcion){
			case 1:
			do{
			idCurso++;
			//Obtener Datos
			System.out.println("Ingrese un nombre de la materia:");
			nombreCurso=Scan.ingresarTexto();
			System.out.println("Ingrese una descripcion:");
			descripcion=Scan.ingresarTexto();
			//Devolver Datos
			cMateria.agregarMateria(nombreCurso, descripcion,idCurso);
			cMateria.reporteMateria();
			System.out.println("Desea agregar otro? si o no ");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
				this.menuMateria();
			if(op.equals("no")){
				this.menuMateria();
			}			
			break;	

			case 2:
			do{
			cMateria.reportetxt();
			System.out.println("Desea generar otro archivo? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuMateria();
			}	
			break;
			
			case 3:
			this.menuPrincipa();
			break;

			default:
			System.out.println("Esta opcion no existe");
			this.menuMateria();
			break;


			

			
		}
		
	}


	public void menuInstructor(){
		String op;
		System.out.println("1... Crear");
		System.out.println("2... Reporte.txt");
		System.out.println("3... Reporte");
		System.out.println("4... Regresar <--");
		opcion=Scan.ingresarNumero();
		switch(opcion){
			case 1:
			do{
			idIns++;
			//Ingresar Datos
			System.out.println("Ingrese el nombre del instructor");
			nombre=Scan.ingresarTexto();
			System.out.println("Ingrese el apellido del instructor");
			apellido=Scan.ingresarTexto();
			System.out.println("Ingrese el numero de telefono del instructor:");
			telefono=Scan.ingresarNumero();
			System.out.println("Ingrese la direccion del instructor:");
			direccion=Scan.ingresarTexto();
			//Devolver datos
			cInstructor.agregarInstructor(idIns,nombre,apellido,telefono,direccion);
			cInstructor.reporteInstructor();
			System.out.println("Desea agregar otro Instructor? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuInstructor();
			}
			break;

			case 2:
			do{
			cInstructor.reportetxt();
			System.out.println("Desea generar otro archivo?");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuInstructor();
			}	
			break;

			case 3:
			do{
			cInstructor.reporteInstructor();
			System.out.println("Desea generar otro archivo? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuInstructor();
			}	
			break;

			case 4:
			this.menuPrincipa();
			break;

			default:
			System.out.println("No existe la opcion");
			this.menuInstructor();
			break;			
			
		}	
	}

	public void menuLogin(){
		login.loginSec();
	}
}
