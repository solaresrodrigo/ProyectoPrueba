package categoria.view;

import java.util.Iterator;
import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.Categoria;
import view.InputTypes;
import producto.control.Productos;
import producto.entity.CategoriaInexistenteException;

public class CategoriasIO {

	private Categorias categorias;
	private Scanner scanner;
	private Productos productos;

	public CategoriasIO(Categorias categorias, Scanner scanner, Productos productos) {
		this.scanner=scanner;
		this.categorias = categorias;
		this.productos=productos;
	}

	public void agregar() {

		Categoria categoria = CategoriaIO.ingresarCategoria(scanner);
		categorias.ingresarCategoria(categoria);
	}


	public void eliminar() throws CategoriaInexistenteException{
		int codigoCategoria;

		codigoCategoria=InputTypes.readInt(scanner, "Codigo de categoria: ");
		categorias.eliminarCategoria(codigoCategoria);
	}

	public void listar() {

		Categoria categoria;

		for(Iterator<Categoria> iterator = categorias.getCategorias().iterator(); iterator.hasNext();) {
			categoria = iterator.next();
			System.out.println(categoria);
		}
	}

	/*public void listarPorProducto() throws CategoriaInexistenteException {

		int indice;
		int indiceC;
		int codigoCategoria;
		int codigoProducto;

		codigoProducto=InputTypes.readInt(scanner, "Ingrese el codigo del producto a listar: ");


		indice=productos.buscar(codigoProducto);

		codigoCategoria=productos.getCategoriaProducto(indice);
		indiceC=categorias.buscarCategoria(codigoCategoria);

		System.out.println( categorias.getCategorias().get(indiceC)	);

		for(int i=0; i<productos.getProductos().size(); i++) {

			if(productos.getCategoriaProducto(i)==codigoCategoria) {
				System.out.println();
				System.out.println(productos.getProductos().get(i)	/*productos.getProductos()[i]);
				System.out.println();
			}
		}
	}*/

	public Categorias getCategorias() {
		return categorias;
	}



}
