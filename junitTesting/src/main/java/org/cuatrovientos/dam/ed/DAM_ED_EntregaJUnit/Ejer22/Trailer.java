package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

import java.util.Vector;

public class Trailer implements Transporte {
	private Vector<Paquete> paquetes = new Vector<>();
	private int distanciaRecorrida;

	/*
	 * Constructor de la clase
	 */
	public Trailer() {
		this.distanciaRecorrida = (int) (Math.random() * 31) + 270;
	}
	/*
	 * Esta funcion nos permite añadir objetos de la clase Paquete al Vector paquetes
	 */
	public void incluirPaquete(Paquete paquete) {
		paquetes.add(paquete);
	}
	/*
	 * Nos devuelve como float la suma del peso de todos los objetos de la clase Paquete que hay en paquetes
	 */

	@Override
	public float pesoTotal() {
		float pesoTotal = 0;
		for (Paquete paquete : paquetes) {
			pesoTotal += paquete.getPeso();
		}
		return pesoTotal;
	}

	/*
	 * Nos devuelve la distancia que hace el Trailer
	 */
	@Override
	public int recorrerDistancia() {
		return distanciaRecorrida;
	}

}
