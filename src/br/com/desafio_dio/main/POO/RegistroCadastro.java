package br.com.desafio_dio.main.POO;

import java.util.ArrayList;
import java.util.List;

public  class RegistroCadastro {	
	public String registroCadastro(String cadastro ){
		while(cadastro != null) {
		    List<String> registro = new ArrayList<>();
		    registro.add(cadastro);		
			 return "{Usu�rio registrado " + registro + "}"; 			
		}
		return " Registro " + cadastro + "!";	
	}
}
