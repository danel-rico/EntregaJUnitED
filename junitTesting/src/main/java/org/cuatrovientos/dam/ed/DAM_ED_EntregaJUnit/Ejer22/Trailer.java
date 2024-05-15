package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

import java.util.Vector;

public class Trailer implements Transporte {
	private Vector<Paquete> paquetes = new Vector<>();
	private int distanciaRecorrida;

	public Trailer() {
		this.distanciaRecorrida = (int) (Math.random() * 31) + 270;
	}

	public void incluirPaquete(Paquete paquete) {
		paquetes.add(paquete);
	}

	@Override
	public float pesoTotal() {
		float pesoTotal = 0;
		for (Paquete paquete : paquetes) {
			pesoTotal += paquete.getPeso();
		}
		return pesoTotal;
	}

	@Override
	public int recorrerDistancia() {
		return distanciaRecorrida;
	}

}
