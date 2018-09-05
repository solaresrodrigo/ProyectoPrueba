package producto.entity;

public class CategoriaInexistenteException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public CategoriaInexistenteException(){
		super("No existe tal cateogoria.");
	}

}