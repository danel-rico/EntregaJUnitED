package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

import java.util.ArrayList;

public class Factura {
	private ArrayList<Producto> productos;

	public Factura() {
		productos = new ArrayList<Producto>();
	}

	public void meterProducto(Producto producto) {
		productos.add(producto);
	}

	public float totalFactura() {
		float total = 0;
		for (Producto producto : productos) {
			total += producto.precioTotal();
		}
		return total;
	}

	public float aplicarIva(float iva) {
		float total = totalFactura();
		return total * (1 + iva);
	}

}
