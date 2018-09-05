package categoria.entity;

public class Categoria {

	private int codigoCategoria;
	private String nombre;
	private String descripcion;
	
	
	public Categoria(int codigoCategoria, String nombre, String descripcion) {
		this.codigoCategoria = codigoCategoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public Integer getCodigoCategoria() {
		return codigoCategoria;
	}
	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public boolean equals(Object objeto) {
		boolean respuesta = false;
		if(objeto != null) {
			Categoria categoria = (Categoria) objeto;
			if(this.getCodigoCategoria()==categoria.getCodigoCategoria()) {
				respuesta = true;
			}
		}
		return respuesta;
	}

	public int hashCode() {
		return this.getCodigoCategoria().hashCode();
	}
	
	@Override
	public String toString() {
		return "Categoria [codigoCategoria=" + codigoCategoria + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ "]";
	}

}
