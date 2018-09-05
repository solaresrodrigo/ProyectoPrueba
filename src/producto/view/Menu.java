package producto.view;

import java.util.Scanner;

import view.InputTypes;
import producto.entity.CategoriaInexistenteException;

public class Menu {


	public static int encabezado(Scanner scanner) {
		int opcion;

		while(true) {
			System.out.println("-----Productos-----");
			System.out.println("1. Ingresar producto.");
			System.out.println("2. Eliminar producto.");
			System.out.println("3. Listar productos.");
			System.out.println("4. Listar productos por categoria.");
			System.out.println("0. Salir.");


			opcion = InputTypes.readInt(scanner, "Ingrese la opcion deseada: ");

			if(opcion>=0 && opcion<=4) {
				return opcion;
			}
		}
	}

	public static void menu(Scanner scanner, ProductosIO productosView) {

		boolean salir = false;

		while(!salir) {
			switch(encabezado(scanner)) {
			case 0: 
				salir=true;
				break;
			case 1: 
				try {
					productosView.agregar();
				} catch (CategoriaInexistenteException e) {
					System.out.println("No existe tal categoria.");
				}
				break;
			case 2: 
				productosView.eliminar();
				break;
			case 3:
				try {
					productosView.listar();
				} catch (CategoriaInexistenteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 4:
				try {
					productosView.listarPorCategoria();
				} catch (CategoriaInexistenteException e) {
					System.out.println("No existe tal categoria.");
				}
				break;
			}
		}
	}

}
