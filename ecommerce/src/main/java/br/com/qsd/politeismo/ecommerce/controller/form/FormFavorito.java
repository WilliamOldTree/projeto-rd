<<<<<<< HEAD
package br.com.qsd.politeismo.ecommerce.controller.form;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Favoritos;

public class FormFavorito {
	
	private Long id_favoritos;
    private String lista_favoritos;
    private Cliente cliente;

    public FormFavorito (Long id_favoritos, String lista_favoritos, Cliente cliente ) {
    	    	
    	this.id_favoritos = id_favoritos;
		 this.lista_favoritos = lista_favoritos;
		 this.cliente = cliente;
    }
    
    public FormFavorito (Favoritos favorito) {
    	    
    	id_favoritos = favorito.getId_favoritos();
        lista_favoritos = favorito.getLista_favoritos();
        cliente = favorito.getCliente();
    }

	public Long getId_favoritos() {
		return id_favoritos;
	}

	public void setId_favoritos(Long id_favoritos) {
		this.id_favoritos = id_favoritos;
	}

	public String getLista_favoritos() {
		return lista_favoritos;
	}

	public void setLista_favoritos(String lista_favoritos) {
		this.lista_favoritos = lista_favoritos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    
    

=======
package br.com.qsd.politeismo.ecommerce.controller.form;



public class FormFavorito {
	
	private String id_favoritos;
    private String cliente;
    private String produto;
    
    public FormFavorito() {
    	
    }
    
	public String getId_favoritos() {
		return id_favoritos;
	}
	
	public void setId_favoritos(String id_favoritos) {
		this.id_favoritos = id_favoritos;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getProduto() {
		return produto;
	}
	
	public void setProduto(String produto) {
		this.produto = produto;
	}

    
    
    

>>>>>>> 4c080c22c4c7cdd9603e7a8907c133b2dea15553
}//end