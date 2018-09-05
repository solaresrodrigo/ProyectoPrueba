package producto.control;

import java.util.HashSet;
import java.util.Iterator;

import categoria.entity.Categoria;
import producto.entity.CategoriaInexistenteException;
import producto.entity.Producto;

public class Productos {

	private HashSet<Producto> productos;

	public Productos() {
		productos = new HashSet<Producto>();
	}

	public void ingresar(Producto producto) {

		productos.add(producto);

	}

	public void eliminar(int codigoProducto) {

		Producto producto = buscar(codigoProducto);
		productos.remove(producto);
	}

	public Producto buscar(int codigoProducto) {

		Producto buscado = null;
		Producto producto;

		for(Iterator<Producto> iterator = productos.iterator(); iterator.hasNext();) {
			producto = iterator.next();
			if( producto.getCodigoProducto().equals(codigoProducto) ) {
				buscado = producto;
			}
		}
		return buscado;
	}

	public HashSet<Producto> getProductos() {
		return productos;
	}

	/*public int getCategoriaProducto(int i) {

		return productos.get(i).getCodigoCategoria();

	}*/


}
