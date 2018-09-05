package categoria.view;

import java.util.Scanner;

import view.InputTypes;
import producto.entity.CategoriaInexistenteException;

public class Menu {
	
	
	public static int encabezado(Scanner scanner) {
		
		int opcion;
		while(true) {
			System.out.println("-----Categorias-----");
			System.out.println("1. Ingresar categoria.");
			System.out.println("2. Eliminar categoria.");
			System.out.println("3. Listar categorias.");
			System.out.println("4. Listar categoria por producto.");
			System.out.println("0. Salir.");

			opcion = InputTypes.readInt(scanner, "Ingrese la opcion deseada: ");

			if(opcion>=0 && opcion<=4) {
				return opcion;
			}
		}
	}
	
	public static void menu(Scanner scanner, CategoriasIO categoriasView) {
		
		boolean salir = false;
		
		while(!salir) {
			switch(encabezado(scanner)) {
			case 1:
				categoriasView.agregar();
				break;
			case 2:
				try {
					categoriasView.eliminar();
				} catch (CategoriaInexistenteException e) {
					//e.printStackTrace();
					System.out.println("No existe la categoria.");
				}
				break;
			case 3:
				categoriasView.listar();
				break;
			case 4:/*
				try {
					categoriasView.listarPorProducto();
				} catch (CategoriaInexistenteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;*/
			case 0:
				salir = true;
				break;
			}
		}
		
	}

}
