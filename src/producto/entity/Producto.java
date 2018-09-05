package producto.entity;

import categoria.entity.Categoria;

public class Producto {
	
	int codigoProducto;
	String nombre;
	double precio;
	String descripcion;
	int codigoCategoria;
	
	public Producto(int codigoProducto, String nombre, double precio, String descripcion, int codigoCategoria) {
		
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.codigoCategoria = codigoCategoria;
	}

	public Integer getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}
	
	public boolean equals(Object objeto) {
		boolean respuesta = false;
		if(objeto != null) {
			Producto producto = (Producto) objeto;
			if(this.getCodigoProducto()==producto.getCodigoProducto()) {
				respuesta = true;
			}
		}
		return respuesta;
	}

	public int hashCode() {
		return this.getCodigoProducto().hashCode();
	}
	
	
	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", precio=" + precio
				+ ", descripcion=" + descripcion + ", codigoCategoria=" + codigoCategoria + "]";
	}
	
	
	
}
