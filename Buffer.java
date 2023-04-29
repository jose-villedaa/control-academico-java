package com.jose.modelo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
	public class Buffer{
				BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		    public String ingresarTexto(){
		   		String texto=null;
		    try {
		    	texto=bf.readLine();
		    } catch (IOException ioe) {
		        System.out.println("***ERROR***");
		        System.exit(1);
		    }
			return texto;
		}	
		 public int ingresarNumero(){
	    int num=0;
	    try {
	        num=Integer.parseInt(bf.readLine());
	    } catch (IOException ioe) {
	        System.out.println("***ERROR***");
	        System.exit(1);
	    }
	    return num;
	    }
	}    