package br.com.qsd.politeismo.ecommerce.controller.form;
import br.com.qsd.politeismo.ecommerce.entities.Produto;

 public class FormProdutoDTO {
	      
	    private Long   id_produto;
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
	   
	   
  public FormProdutoDTO (String descricao, String volume, String peso, String status, String preco, String estoque) {
                      //Produto_Destaque produto_destaque, Departamento departamento, Categoria categoria, Fornecedor fornecedor) {
	     
	     super();
	     
	     this.descricao           = descricao;
		 this.volume              = volume;
		 this.peso                = peso;
		 this.status              = status;
		 this.preco               = preco;
		 this.estoque             = estoque;
	   //this.produto_Destaque    = produto_Destaque;
	   //this.departamento        = departamento;
	   //this.categoria           = categoria;
	   //this.fornecedor          = fornecedor;
		
}

  public FormProdutoDTO(Produto produto) {
		  
         super();
         
         descricao        = produto.getDescricao();
         volume           = produto.getVolume();
         peso             = produto.getPeso();
         status           = produto.getStatus();
         preco            = produto.getPreco();	
         estoque          = produto.getEstoque();
       //produto_destaque = produto.getProduto_destaque();
       //departamento     = produto.getDepartamento();
       //categoria        = produto.getCategoria();
       //fornecedor       = produto.geFornecedor();

}

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
  
  
}//end
