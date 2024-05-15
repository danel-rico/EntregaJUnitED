package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

import java.util.Vector;

public class Factura {
	private Vector<Producto> productos;

	/*
	 * Constructor de la clase
	 */
	public Factura() {
		productos = new Vector<Producto>();
	}

	/*
	 * Nos permite añadir productos a la lista Productos
	 */
	public void meterProducto(Producto producto) {
		productos.add(producto);
	}
	/*
	 * Nos devuelve como valor float la factura total, es decir,
	 * el coste x cantidad de cada producto de la factura
	 */

	public float totalFactura() {
		float total = 0;
		for (Producto producto : productos) {
			total += producto.precioTotal();
		}
		return total;
	}

	/*
	 * Esta funcion hace practicamente lo mismo que la anterior, pero en este caso, además de
	 * devolver el coste x la cantidad a este valor también se le aplica el IVA que tu le introduzcas
	 */
	public float aplicarIva(float iva) {
		float total = totalFactura();
		return total * (1 + iva);
	}

}
