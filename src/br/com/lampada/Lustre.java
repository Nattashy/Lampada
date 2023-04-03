package br.com.lampada;

/**
 * Classe que representa um lustre.
 * 
 * @author Evelyn Natashy
 * @version 0.1
 *
 */
import java.util.ArrayList;

public class Lustre {

	private ArrayList<Lampada> lustres = new ArrayList<Lampada>();
	
	
	public Lustre(int quantidadeDeLampadas) {
		
		for (int i = 0; i < quantidadeDeLampadas; i++) {
			lustres.add(new Lampada("10w", "220 V", "Incandescente"));
		}	

	}

	public void ligarLustre() {
		for (Lampada l : lustres) {
			l.ligar();
		}
	}
	
	public void desligarLustre() {
		for (Lampada l : lustres) {
			l.ligar();
		}
	}
	
	public String verificaEstado() {
		String retorno = "Ligado";
		
		for (Lampada l : this.lustres) {
			if (l.getEstado() == "Apagada") {
				retorno = "Desligado";
				break;
			}
		}
		return retorno;
	}
	
}
