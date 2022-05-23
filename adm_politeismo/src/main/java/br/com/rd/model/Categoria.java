package br.com.rd.model;

public class Categoria {
	private Integer id;
	private String nome;

	private Boolean flInativo;

	
	public Categoria(String nome) {
		super();
		this.nome = nome;
	}

//	public Categoria(Integer id, String nome, Boolean flInativo) {
//		super();
//		this.id = id;
//		this.nome = nome;
//		this.flInativo = flInativo;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Boolean getFlInativo() {
		return flInativo;
	}

	public void setFlInativo(Boolean flInativo) {
		this.flInativo = flInativo;
	}
	
		
}//end Categoria