package producto.view;

import java.util.Iterator;
import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.Categoria;
import view.InputTypes;
import producto.control.Productos;
import producto.entity.CategoriaInexistenteException;
import producto.entity.Producto;

public class ProductosIO {
	private Productos productos;
	private Scanner scanner;
	private Categorias categorias;
	
	public ProductosIO(Productos productos, Scanner scanner, Categorias categorias) {
		this.productos = productos;
		this.categorias = categorias;
		this.scanner = scanner;
	}

	public void agregar() throws CategoriaInexistenteException{
		Producto producto=null;
		
		producto = ProductoIO.ingresarProducto(scanner, categorias);
		
		try {
			productos.ingresar(producto);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("No queda espacio.");
		}
	}

	public void eliminar() {
		int codigoProducto;
		codigoProducto = InputTypes.readInt(scanner, "Ingrese el codigo del producto: ");
		productos.eliminar(codigoProducto);
	}

	public void listar() throws CategoriaInexistenteException {
		Producto producto;
		Categoria categoria;
		for(Iterator<Producto> iterator = productos.getProductos().iterator(); iterator.hasNext();) {
			producto = iterator.next();
			categoria = categorias.buscarCategoria(producto.getCodigoCategoria());
			System.out.println(categoria);
			System.out.println(producto);
			System.out.println();
		}
	}
	
	public void listarPorCategoria() throws CategoriaInexistenteException {
		
		int codigoCategoria=InputTypes.readInt(scanner, "Ingrese el codigo de la categoria a listar: ");
		Categoria categoria;
		Producto producto;
		categoria = categorias.buscarCategoria(codigoCategoria);
		System.out.println();
		System.out.println(categoria);
		for(Iterator<Producto> iterator = productos.getProductos().iterator(); iterator.hasNext();) {
			producto = iterator.next();
			if( producto.getCodigoCategoria().equals(codigoCategoria) ) {

				System.out.println(producto);
			}
		}
		System.out.println();
	}
	
	public Productos getProductos() {
		return productos;
	}
}
