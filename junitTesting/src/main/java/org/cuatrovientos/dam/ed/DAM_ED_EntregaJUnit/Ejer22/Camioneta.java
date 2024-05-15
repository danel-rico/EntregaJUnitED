package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

import java.util.ArrayList;

public class Camioneta implements Transporte {
	private ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
	private int distanciaRecorrida;

	public Camioneta() {
		this.distanciaRecorrida = (int) (Math.random() * 31) + 70;
	}

	@Override
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
