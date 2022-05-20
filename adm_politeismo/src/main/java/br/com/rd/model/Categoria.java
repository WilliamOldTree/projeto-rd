package br.com.rd.model;

public class Categoria {
	private Integer id;
	private String nome;
<<<<<<< HEAD
	private Boolean flInativo;
=======
	private Boolean fl_inativo;
>>>>>>> 647b63eda594e92c6bc4d3079b1c4fb2f17e1d3b
	
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

<<<<<<< HEAD
	public Boolean getFlInativo() {
		return flInativo;
	}

	public void setFlInativo(Boolean flInativo) {
		this.flInativo = flInativo;
	}
	
=======
	public Boolean getFl_inativo() {
		return fl_inativo;
	}

	public void setFl_inativo(Boolean fl_inativo) {
		this.fl_inativo = fl_inativo;
	}

>>>>>>> 647b63eda594e92c6bc4d3079b1c4fb2f17e1d3b
	
		
}//end Categoria