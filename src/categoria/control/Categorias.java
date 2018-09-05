package categoria.control;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import categoria.entity.Categoria;
import producto.entity.CategoriaInexistenteException;

public class Categorias {

	
	private HashSet<Categoria> categorias;

	public Categorias() {
		 categorias = new HashSet<Categoria>();
	}

	public void ingresarCategoria(Categoria categoria) {
		
		categorias.add(categoria);
	}

	public Categoria buscarCategoria(int codigoCategoria) throws CategoriaInexistenteException{
		Categoria buscado=null;
		Categoria categoria;
		
		for(Iterator<Categoria> iterator = categorias.iterator(); iterator.hasNext();) {
			categoria = iterator.next();
			if( categoria.getCodigoCategoria().equals(codigoCategoria) ) { 
				buscado=categoria;
			}
		}
		if(buscado==null) {
			throw new CategoriaInexistenteException();
		}
		return buscado;
	}
	

	public void eliminarCategoria(int Codigocategoria) throws CategoriaInexistenteException{
		Categoria categoria=buscarCategoria(Codigocategoria);
		
		categorias.remove(categoria);
	}


	public HashSet<Categoria> getCategorias() {
		return categorias;
	}
	
	

}
