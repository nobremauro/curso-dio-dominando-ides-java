package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato Gato = new Gato();
		Livros Livros = new Livros();

		System.out.println(Gato);
		System.out.println(Livros);
		/*
		 * int a=2; int b=10; System.out.println("Hello World " + (a+b)); // TODO
		 * Auto-generated method stub
		 */

	}

}

class Livros {
	private String nome;
	private String npag;
}
