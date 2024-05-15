package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

public interface Transporte {
/*
 * Esto es la interfaz transoporte, aqui simplemente se crean las funcines
 */
	/*
	 * Para que se pueda incluir el paquete en la array o en el vector que se pida
	 */
	void incluirPaquete(Paquete paquete);
	/*
	 * Para calcular el peso total de un vehiculo ya sea camioneta o trailer
	 */
	float pesoTotal();
	/*
	 * Devuelve la distancia que recorre al vehiculo ya se camioneta o trailer
	 */
	int recorrerDistancia();
}
