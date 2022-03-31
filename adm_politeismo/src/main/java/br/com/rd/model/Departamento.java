package br.com.rd.model;

public class Departamento {
	private Integer id;
	private String nome;

	public Departamento(String nome) {
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
	
	
	public String toString() {
		return "Departamento [id=" + id + ", nome=" + nome + "]";
	}
}
