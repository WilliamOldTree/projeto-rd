package br.com.qsd.politeismo.ecommerce.controller.dto;

import br.com.qsd.politeismo.ecommerce.entities.Cartao;

public class CartaoDTO {

	private Long id_cartao;
	private String titular_cartao;
	private String validade_cartao;
	private String numero_cartao;
	private String cliente;
	private String forma;

	public CartaoDTO() {

	}

	public CartaoDTO(Long id_cartao, String titular_cartao, String validade_cartao, String numero_cartao,
			String cliente, String forma) {
		super();
		this.id_cartao = id_cartao;
		this.titular_cartao = titular_cartao;
		this.validade_cartao = validade_cartao;
		this.numero_cartao = numero_cartao;
		this.cliente = cliente;
		this.forma = forma;
	}

	public CartaoDTO(Cartao cartao) {
		super();
		id_cartao = cartao.getId();
		titular_cartao = cartao.getTitular_cartao();
		numero_cartao = cartao.getNumero_cartao();
		validade_cartao = cartao.getValidade_cartao();
		cliente = cartao.getCliente().getNome();
		forma = cartao.getFormaPagamento().getInstituicao();
	}

	public Long getId_cartao() {
		return id_cartao;
	}

	public void setId_cartao(Long id_cartao) {
		this.id_cartao = id_cartao;
	}

	public String getTitular_cartao() {
		return titular_cartao;
	}

	public void setTitular_cartao(String titular_cartao) {
		this.titular_cartao = titular_cartao;
	}

	public String getValidade_cartao() {
		return validade_cartao;
	}

	public void setValidade_cartao(String validade_cartao) {
		this.validade_cartao = validade_cartao;
	}

	public String getNumero_cartao() {
		return numero_cartao;
	}

	public void setNumero_cartao(String numero_cartao) {
		this.numero_cartao = numero_cartao;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

}
