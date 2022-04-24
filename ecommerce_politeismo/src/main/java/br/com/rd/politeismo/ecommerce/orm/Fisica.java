package br.com.rd.politeismo.ecommerce.orm;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Fisica extends Cliente{

	
	private String cpf;
	private LocalDate nascimento;
	private Long idSexo;
	private Long idCliente;

	public Fisica() {

	}

	public Fisica(String cpf, LocalDate nascimento, Long idSexo, Long idCliente) {
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.idSexo = idSexo;
		this.idCliente = idCliente;
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

	public Long getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(Long idSexo) {
		this.idSexo = idSexo;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	
	
}// end class
