package br.com.rd.model;

public class Categoria {
	private Integer id;
	private String nome;
	private Boolean status_categoria;
	
	public Categoria(String nome) {
		super();
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nome=" + nome + "]";
	}

	public Boolean getStatus_categoria() {
		return status_categoria;
	}

	public void setStatus_categoria(Boolean status_categoria) {
		this.status_categoria = status_categoria;
	}
		
}//end Categoria
