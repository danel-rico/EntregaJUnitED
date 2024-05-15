package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

public class Paquete {
	String destino;
	float peso;

	/*
	 * Constructor de la clase
	 */
	public Paquete(String destino, float peso) {
		this.destino = destino;
		this.peso = peso;
	}
	/*
	 * Getters y Setters de la clase
	 */
	
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	/*
	 * ToString de la clase
	 */
	@Override
	public String toString() {
		return "Paquete [destino=" + destino + ", peso=" + peso + "]";
	}

}
