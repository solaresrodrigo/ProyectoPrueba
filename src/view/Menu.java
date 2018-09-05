package view;

import java.util.Scanner;

import categoria.control.Categorias;
import categoria.view.CategoriasIO;
import view.InputTypes;
import producto.control.Productos;
import producto.view.ProductosIO;

public class Menu {
	
	
	
	public static int encabezado(Scanner scanner) {
		int opcion;

		while(true) {
			System.out.println("-----Mi Tienda-----");
			System.out.println("1. Menu productos.");
			System.out.println("2. Menu categorias.");
			System.out.println("0. Salir.");

			opcion = InputTypes.readInt(scanner, "Ingrese la opcion deseada: ");

			if(opcion>=0 && opcion<=3) {
				return opcion;
			}
		}
	}
	
	public static void menu(Scanner scanner) {
		boolean salir=false;
		
		
		CategoriasIO categoriasView;
		ProductosIO productosView ;
		
		Categorias categorias = new Categorias();
		Productos productos = new Productos();
		
		categoriasView = new CategoriasIO(categorias, scanner, productos);
		
		productosView = new ProductosIO(productos, scanner, categorias);
		
		
		
		while(!salir) {
			switch(encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1: 
				producto.view.Menu.menu(scanner, productosView);
				break;
			case 2:
				categoria.view.Menu.menu(scanner, categoriasView);
				break;
			}
		}
	}

}
