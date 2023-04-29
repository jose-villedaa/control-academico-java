package com.jose.vista;
import com.jose.vista.*;
import com.jose.manejador.*;
import com.jose.modelo.*;
public class PantallaDirector{

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
	ManejadorUser cUser=new ManejadorUser();


	public void menuPrincipa(){
		System.out.println("---------------------------------");
		System.out.println("Menu Director");
		System.out.println("---------------------------------");
		System.out.println("1. Materia");
		System.out.println("2. Instructor");
		System.out.println("3. Salones");
		System.out.println("4. Usuario");
		System.out.println("5. Asignar");
		System.out.println("6. Reporte");
		System.out.println("---------------------------------");
		System.out.println("7. Salir a login <---");
		System.out.println("---------------------------------");
		opcion=Scan.ingresarNumero();
		switch(opcion){
			case 1:
			this.menuMateria();
			break;

			case 2:
			this.menuInstructor();

			case 3:
			this.menuSalon();
			break;

			case 4:
			this.menuUsuario();
			break;

			case 5:
			break;

			case 6:
			this.menuReporte();
			break;

			case 7:
			this.menuLogin();
			break;

			default:
			System.out.println("No existe esta opcion!");
			System.out.println("Vuelve a intentar!");
			this.menuPrincipa();
			break;

		}	
	}	

	public void menuMateria(){
		int mod;
		String op;
		String buscar;

		System.out.println("1... Crear");
		System.out.println("2... Modificar");
		System.out.println("3... Eliminar");
		System.out.println("4... Reporte txt");
		System.out.println("5... Volver a menu");
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
			System.out.println("Desea agregar otro? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
				this.menuMateria();
			if(op.equals("no")){
				this.menuMateria();
			}			
			break;

			case 2:
			do{
				System.out.println("Ingrese el id de la materia");
				idCurso=Scan.ingresarNumero();
		
				System.out.println("Ingrese el nuevo nombre de materia: ");
				nombreCurso=Scan.ingresarTexto();
				System.out.println("Ingrese la nueva descripcion: ");
				descripcion=Scan.ingresarTexto();
				cMateria.modificarMateria(nombreCurso, descripcion, idCurso);
				cMateria.reporteMateria();
				System.out.println("Desea modificar otra materia? si o no");
				op=Scan.ingresarTexto();
			}while(op.equals("si"));
				this.menuMateria();
				if(op.equals("no")){
				this.menuMateria();
				}
			break;
			
			case 3:
			do{
				System.out.println("Ingrese el id de la materia a eliminar");
				int eliminar=Scan.ingresarNumero();
				System.out.println("Eliminando...........");
				cMateria.eliminarMateria(idCurso,eliminar);
				cMateria.reporteMateria();
				System.out.println("Desea eliminar otra materia? ");
				op=Scan.ingresarTexto();
			}while(op.equals("si"));
				this.menuMateria();
				if(op.equals("no")){
				this.menuMateria();
				}
			break;		

			case 4:
			do{
			cMateria.reportetxt();
			System.out.println("Desea generar otro archivo? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuMateria();
			}	
			break;
			
			case 5:
			this.menuPrincipa();
			break;
			default:
			System.out.println("No existe la opcion");
			System.out.println("Vuelve a intentar!");
			this.menuMateria();
			break;


			

			
		}
		
	}


	public void menuSalon(){
		String op;
		System.out.println("1. Agregar");
		System.out.println("2. Modificar");
		System.out.println("3. Eliminar");
		System.out.println("4. Reporte txt");
		System.out.println("5. Regresar <--");
		opcion=Scan.ingresarNumero();
		switch(opcion){
			case 1:
			do{
			idSalon++;
			//Obtener Datos
			System.out.println("Ingrese el nombre del salon:");
			nombreSalon=Scan.ingresarTexto();
			System.out.println("Ingrese la cantidad de alumnos:");
			cantidad=Scan.ingresarNumero();
			//Devolver Datos
			cSalon.agregarSalon(nombreSalon, cantidad,idSalon);
			cSalon.reporteSalon();
			System.out.println("Desea agregar otro salon? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuSalon();
			}
			break;

			case 2:
			do{
			System.out.println("Ingrese el id de la materia");
				idCurso=Scan.ingresarNumero();
		
				System.out.println("Ingrese ingrese el nombre del Salon: ");
				nombreSalon=Scan.ingresarTexto();
				System.out.println("Ingrese la nueva cantidad de alumnos ");
				cantidad=Scan.ingresarNumero();

				cSalon.modificarSalon(nombreSalon, cantidad, idSalon);
				cSalon.reporteSalon();

				System.out.println("Desea modificar otro salon? si o no");
				op=Scan.ingresarTexto();
			}while(op.equals("si"));
				this.menuMateria();
				if(op.equals("no")){
				this.menuMateria();
			}
			break;

			case 3:
			do{
			System.out.println("Ingrese el id del salon:");
				int eliminar=Scan.ingresarNumero();
				System.out.println("Eliminando...........");
				cSalon.eliminarSalon(idSalon,eliminar);
				cSalon.reporteSalon();
				System.out.println("Desea agregar otro salon? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuSalon();
			}	

			break;
			
			case 4:
			do{
			cSalon.reportetxt();
			System.out.println("Desea generar otro archivo? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuSalon();
			}	
			break;


			case 5:
			this.menuPrincipa();
			break;
			default:
			System.out.println("no existe");
			System.out.println("Vuelve a intentar!");
			this.menuSalon();
			break;
			
	}		
}
	public void menuInstructor(){
		String op;
		System.out.println("1. Agregar");
		System.out.println("2. Modificar");
		System.out.println("3. Eliminar");
		System.out.println("4. Reporte txt");
		System.out.println("5. Regresar <--");
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
			System.out.println("Desea agregar otro Instructor si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuInstructor();
			}
			break;
			
			case 2:
			do{
			cInstructor.modificarInstructor(idIns,nombre,apellido,telefono,direccion);
			System.out.println("Desea modificar otra persona? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuInstructor();
			}	
			break;
			
			case 3:
			do{
			System.out.println("Ingrese el id del Instructor:");
			int eliminar=Scan.ingresarNumero();
			System.out.println("---------------------------------");
			System.out.println("Eliminando...........");
			cInstructor.eliminarInstructor(idIns,eliminar);
			System.out.println("---------------------------------");
			cInstructor.reporteInstructor();
			System.out.println("Desea eliminar otro Instructor? si o no ");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuInstructor();
			}	


			break;
			case 4:
			do{
			cInstructor.reportetxt();
			System.out.println("Desea generar otro archivo? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuInstructor();
			}	
			break;
			case 5:
			this.menuPrincipa();
			break;		
			default:
			System.out.println("No existe la opcion");
			System.out.println("Vuelve a intentar!");
			this.menuInstructor();
			break;		
			
		}	
	}
	public void menuUsuario(){
		String op;
		System.out.println("1. Agregar");
		System.out.println("2. Modificar");
		System.out.println("3. Eliminar");
		System.out.println("4. Reporte txt");
		System.out.println("5. Regresar <--");
		opcion=Scan.ingresarNumero();
		switch(opcion){
			case 1:
			do{
			idUser++;
			System.out.println("Ingrese el nombre del Usuario");
			nombre=Scan.ingresarTexto();
			System.out.println("Ingrese el rol del user");
			rol=Scan.ingresarTexto();
			System.out.println("Ingrese la clave");
			rol=Scan.ingresarTexto();
			cUser.agregarUsuario(nombre,rol,clave,idUser);
			cUser.reporteUsuario();
			System.out.println("Desea agregar otro user? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuUsuario();
			}
			break;

			case 2:
			do{
			cUser.modificarUsuario(nombre,rol,clave,idUser);
			System.out.println("Desea modificar otro Usuario? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuUsuario();
			}	
			break;
			case 3:
			do{
			System.out.println("Ingrese el id del Usuario:");
			int eliminar=Scan.ingresarNumero();
			System.out.println("---------------------------------");
			System.out.println("Eliminando...........");
			cUser.eliminarUsuario(idUser,eliminar);
			System.out.println("---------------------------------");
			cUser.reporteUsuario();
			System.out.println("Desea eliminar otro Usuario? si o no ");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuUsuario();
			}	
			break;

			case 4:
			do{
			cUser.reportetxt();
			System.out.println("Desea generar otro archivo? si o no");
			op=Scan.ingresarTexto();
			}while(op.equals("si"));
			if(op.equals("no")){
				this.menuUsuario();
			}	
			break;

			case 5:
			this.menuPrincipa();
			break;

			default:
			System.out.println("No existe la opcion");
			System.out.println("Vuelve a intentar!");
			this.menuUsuario();
			break;		


		}	
	}

	public void menuLogin(){
		login.loginSec();
	}
	public void menuReporte(){
	int buscarReporte;
	System.out.println("Ingrese el id del Instructor: ");
			 buscarReporte=Scan.ingresarNumero();
}	}

