package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

public class Producto {

	String nombre;
	float precio;
	int cantidad;
	/*
	 * Constructor de la calse
	 */
	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	/*
	 * Esta funcion nos devuelve el precio total del producto es decir: precio x cantidad
	 */

	public float precioTotal() {
		return precio * cantidad;
	}
	/*
	 * ToString de la clase
	 */
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	/*
	 * A partir de aquçi son todos getters y setters de la clase
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
