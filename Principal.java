package com.jose;
import com.jose.vista.*;
import com.jose.manejador.*;
import com.jose.modelo.*;

public class Principal{
	public static void main(String args[]){
		MenuPrincipal menu=new MenuPrincipal();
		Login login=new Login();
		login.loginPrincipal();
	}
}