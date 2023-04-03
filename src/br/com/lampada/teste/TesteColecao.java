package br.com.lampada.teste;

import java.util.ArrayList;

import br.com.lampada.Lampada;

/**
 * Classe para testes da classe Lustre.
 * 
 * @author Evelyn Natashy
 * 
 */
public class TesteColecao {

	public static void main(String[] args) {

		Lampada lamp = new Lampada("we", "rtgr", "rtd");
		lamp.ligar();
		
		System.out.println(lamp.getEstado());
			
		
		ArrayList<Lampada> lampadas = new ArrayList<Lampada>();

		Lampada l1 = new Lampada("10w", "220 V", "Incandescente1");
		Lampada l2 = new Lampada("15w", "220 V", "Florescente1");
		Lampada l3 = new Lampada("7w", "220 V", "Florescente2");
		Lampada l4 = new Lampada("22w", "220 V", "Incandescente2");
		Lampada l5 = new Lampada("8w", "220 V", "Florescente3");

		lampadas.add(l1);
		lampadas.add(l2);
		lampadas.add(l3);
		lampadas.add(l4);
		lampadas.add(l5);

		for (Lampada l : lampadas) {
			l.ligar();
		}

		lampadas.forEach(l -> l.imprimir());

	}

}
