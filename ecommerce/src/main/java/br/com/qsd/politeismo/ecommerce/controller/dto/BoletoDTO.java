package br.com.qsd.politeismo.ecommerce.controller.dto;

import br.com.qsd.politeismo.ecommerce.entities.Boleto;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;

public class BoletoDTO {
	
	private Long id;
	private String nome;
	private String cpf;
	private String codigoBarra;
	private Double valor;
	private Cliente cliente;

	public BoletoDTO () {
		
	}
		
	public BoletoDTO(Boleto boleto) {
		
		this.id = boleto.getId();
		this.nome = boleto.getNome();
		this.cpf = boleto.getCpf();
		this.codigoBarra =  boleto.getCodigoBarra();
		this.valor = boleto.getValor();
		this.cliente = boleto.getCliente();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}//End Class

