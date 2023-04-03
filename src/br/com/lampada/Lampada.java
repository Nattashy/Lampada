package br.com.lampada;

/**
 * Classe que representa uma lâmpada.
 * 
 * @author Evelyn Natashy
 * @version 0.1
 *
 */

public class Lampada {

	private String estado;
	private String potencia;
	private String voltagem;
	private String modelo;
	
	
	public Lampada(String potencia, String voltagem, String modelo) {
		this.estado = "Desligado";
		this.potencia = potencia;
		this.voltagem = voltagem;
		this.modelo = modelo;
	}

	public boolean ligar() {
		int random = (int)(Math.random()*100);
		if (random <= 50) {
			this.estado = "Queimada";
		} else {
			this.estado = "Ligada";
		}
		return true;
	}
	
	public boolean desligar() {	
		this.estado = "Apagada";
		return false;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Método que imprime o estado, a potência e a voltagem da lâmpada.
	 */
	public void imprimir() {
		System.out.println("Estado: " + this.estado + " Potencia: " + this.potencia + " Voltagem: "
	+ this.voltagem);
	}
	
}
