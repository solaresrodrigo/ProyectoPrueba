package view;

import java.util.Scanner;

import categoria.control.Categorias;
import categoria.view.CategoriasIO;
import producto.view.ProductosIO;

public class Pantalla {

	public static void main(String[] args) {
		
	
		
		Scanner scanner = new Scanner(System.in);
		
		Menu.menu(scanner);
	}
}

