package br.com.rd.model;

public class Categoria {
<<<<<<< HEAD:adm_politeismo/adm_politeismo/src/main/java/br/com/rd/model/Categoria.java
	private int id;
	private String nome;
	
	public Categoria(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Categoria(String nameBack) {
		super();
		this.nome = nameBack;
	}
=======
	private Integer id;
	private String nome;
	
	public Categoria(String nome) {
		super();
		this.nome = nome;
	}
	
>>>>>>> 91616c18c7967b54bed6eaea67cee424c81290f0:adm_politeismo/src/main/java/br/com/rd/model/Categoria.java
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
		
}//end Categoria
