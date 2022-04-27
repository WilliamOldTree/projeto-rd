package br.com.rd.politeismo.ecommerce.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Fisica extends Cliente{
	
	@Column(nullable = false)
	private String cpf;
	
	@Column(nullable = false)
	private LocalDate nascimento;
	
	@ManyToOne
	@JoinColumn(name="fk_id_sexo", nullable = false)
	private Sexo sexo;
	
	@ManyToMany(mappedBy="clientesFisica",fetch = FetchType.EAGER)
	private List<Endereco> enderecos;

	public Fisica() {

	}

	public Fisica(String cpf, LocalDate nascimento, Sexo idSexo) {
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.sexo = idSexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Sexo getIdSexo() {
		return sexo;
	}

	public void setIdSexo(Sexo idSexo) {
		this.sexo = idSexo;
	}


	@Override
	public String toString() {
		return "[Cliente Físico: ID= " + getId() + "Nome= " + getNome() + "Email= " + getEmail() +"CPF=" + cpf + ", Data de Nascimento= " + nascimento + ", Sexo= " + sexo + "]";
	}
}// end class
