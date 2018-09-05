package producto.view;

import java.util.Scanner;

import producto.entity.CategoriaInexistenteException;
import producto.entity.Producto;
import categoria.control.Categorias;
import categoria.entity.Categoria;
import view.InputTypes;

public class ProductoIO {


	public static Producto ingresarProducto(Scanner scanner, Categorias categorias) throws CategoriaInexistenteException { //Registra un producto.

		int codigoProducto = InputTypes.readInt(scanner, "Ingrese el codigo del producto.");
		String nombre = InputTypes.readString(scanner, "Ingrese el nombre del producto.");
		double precio = InputTypes.readDouble(scanner, "Ingrese el precio del producto.");
		String descripcion = InputTypes.readString(scanner, "Ingrese la descripcion del producto.");
		
		int codigoCategoria = InputTypes.readInt(scanner, "Ingrese el codigo de la categoria del producto.");
		categorias.buscarCategoria(codigoCategoria);
	


		return new Producto(codigoProducto, nombre, precio, descripcion, codigoCategoria);
	}

	public static boolean existeCategoria(Categoria[] categorias, int codigoBuscado) {
		boolean existe=false;

		for(int i=0; i<3; i++) {
			if(categorias[i].getCodigoCategoria()==codigoBuscado) {
				existe=true;
			}
		}

		return existe;


	}

}
