package br.com.qsd.politeismo.ecommerce.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

  @Entity
  @Table(name = "PRODUTO")
  public class Produto {
	  
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name="ID_PRODUTO")
	  private Long id_produto;
      
      @Column(nullable = false)
      private String descricao;
      private String volume;
      private String peso;
      private String status;
      private String preco;
      private String estoque;
    //private Produto_Destaque produto_destaque;
    //private Categoria categoria;
    //private Departamento departamento;
    //private Fornecedor   fornecedor;
      
      
   public Long getId_produto() {
	   
		  return id_produto;
}
   public void setId_produto(Long id_produto) {
	   
		  this.id_produto = id_produto;
}
   
   
   public String getDescricao() {
	   
		  return descricao;
}
   public void setDescricao(String descricao) {
	   
		this.descricao = descricao;
}
   
   
	public String getVolume() {
		
		   return volume;
}
	public void setVolume(String volume) {
		
		   this.volume = volume;
}
	
	public String getPeso() {
		
		   return peso;
}
	public void setPeso(String peso) {
		
		   this.peso = peso;
}
	
	
	public String getStatus() {
		
		   return status;
}
	public void setStatus(String status) {
		
		   this.status = status;
}
	
	
	public String getPreco() {
		
		   return preco;
}
	public void setPreco(String preco) {
		this.preco = preco;
}
	
	
	public String getEstoque() {
		
		   return estoque;
}
	public void setEstoque(String estoque) {
		
		   this.estoque = estoque;
}
	public Produto get() {
		// TODO Auto-generated method stub
		return null;
	}

}//end