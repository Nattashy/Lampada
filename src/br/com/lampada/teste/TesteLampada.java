package br.com.lampada.teste;

import br.com.lampada.Lampada;

/**
 * Classe para testes da classe Lampada.
 * 
 * @author Evelyn Natashy
 * 
 */
public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada("10w", "220 V", "Incandescente");
		
		lamp.ligar();
		
		lamp.imprimir();
		
		lamp.desligar();
		
		lamp.imprimir();

	}

}
