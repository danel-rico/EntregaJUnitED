package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

import java.util.ArrayList;

public class Camioneta implements Transporte {
	private ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
	private int distanciaRecorrida;

	/*
	 * Constructor de la clase
	 */
	public Camioneta() {
		this.distanciaRecorrida = (int) (Math.random() * 31) + 70;
	}
	/*
	 * Esta funcion nos permite incluir objetos de la clase paquete a la lista paquetes
	 */

	@Override
	public void incluirPaquete(Paquete paquete) {
		paquetes.add(paquete);
	}
	/*
	 * Nos devuelve en valor de float la suma del peso de todos los objetos de clase Paquete de la lista 
	 * Paquetes
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
	 * Nos devuelve la distancia que recorre la camioneta
	 */
	@Override
	public int recorrerDistancia() {
		return distanciaRecorrida;
	}

}
