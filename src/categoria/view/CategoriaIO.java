package categoria.view;

import java.util.Scanner;

import categoria.entity.Categoria;
import view.InputTypes;

public class CategoriaIO {
	
	public static Categoria ingresarCategoria(Scanner scanner) {
		int codigoCategoria = InputTypes.readInt(scanner, "Codigo categoria: ");
		String nombreCategoria = InputTypes.readString(scanner, "Nombre de categoria: ");
		String descripcionCategoria = InputTypes.readString(scanner, "Descripcion: ");
		
		
		return new Categoria(codigoCategoria, nombreCategoria, descripcionCategoria);
		
	}

}

