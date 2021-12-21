package br.com.desafio_dio.main;

import java.util.Scanner;
import br.com.desafio_dio.main.POO.RegistroCadastro;
import br.com.desafio_dio.main.POO.CadastroPessoal;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CadastroPessoal id = new CadastroPessoal();
		RegistroCadastro  cadastro = new RegistroCadastro();
		
		System.out.println("Digite nome e cpf.");
		
		String confere = id.verificaCadastro(teclado.next(), teclado.next());		
        if(confere != null) {
		System.out.println("Usuário cadastrado com sucesso => " + confere);
        }
		/*
		 * confirmaRegistro pega todos os cadastros
		 *  digitados no cadastro.listaCasdastro(confere).
	    */
		String confirmaRegistro = cadastro.registroCadastro(confere);		
		if(confirmaRegistro != null) {
		 System.out.println(confirmaRegistro); 
		}

		teclado.close();
	}

}
