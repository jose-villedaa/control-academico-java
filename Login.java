package com.jose.vista;
import com.jose.vista.*;
import com.jose.manejador.*;
import com.jose.modelo.*;
public class Login{
    String usuario;
    String clave;

    Buffer Scan=new Buffer();
    ManejadorUser mUsuario=new ManejadorUser();
    public void loginPrincipal(){
        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println("Para Administrador predeterminado el admin es: admin");
        System.out.println("La clave para usuario predeterminado es: 1234");
        System.out.println("------------------------------------------------------");
        System.out.println("");

        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println("Para coordinador predeterminado el usuario es: coor");
        System.out.println("La clave para coordinador es: 4321");
        System.out.println("------------------------------------------------------");
        System.out.println("");
        
        System.out.println("Ingrese el usuario: ");
        usuario=Scan.ingresarTexto();
        System.out.println("Ingrese la clave");
        clave=Scan.ingresarTexto();
        mUsuario.logInicial(usuario,clave);
    }
    public void loginSec(){
        System.out.println("Ingrese el usuario: ");
        usuario=Scan.ingresarTexto();
        System.out.println("Ingrese la clave");
        clave=Scan.ingresarTexto();
        mUsuario.logInicial(usuario,clave);
    }
}
