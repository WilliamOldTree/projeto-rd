package br.com.qsd.politeismo.ecommerce.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento {
	
	@Id
	@Column(name= "id_departamento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepartamento;
	
	@Column(nullable = false)
    private String nome;

	@Column(name = "fl_inativo")
	private boolean flInativo = true; // flag inativo
	
	@OneToMany(mappedBy = "departamento")
	private  List<Produto> produtos;
	
		
	public Departamento() {
		
	}

	public Long getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Long idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isFlInativo() {
		return flInativo;
	}

	public void setFlInativo(boolean flInativo) {
		this.flInativo = flInativo;
	}

	public List<Produto> getProduto() {
		return produtos;
	}
	
}// end