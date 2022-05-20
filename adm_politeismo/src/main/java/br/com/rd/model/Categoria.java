package br.com.rd.model;

public class Categoria {
	private Integer id;
	private String nome;
	private Boolean fl_inativo;
	
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

	public Boolean getFl_inativo() {
		return fl_inativo;
	}

	public void setFl_inativo(Boolean fl_inativo) {
		this.fl_inativo = fl_inativo;
	}

	
		
}//end Categoria