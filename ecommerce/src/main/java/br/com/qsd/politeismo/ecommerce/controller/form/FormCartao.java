package br.com.qsd.politeismo.ecommerce.controller.form;


public class FormCartao {
	private String titular_cartao;
	private String numero_cartao;
	private String cvv_cartao;
	private String validade_cartao;
	private Long cliente;
	private Long forma;
	
    



	public FormCartao(String titular_cartao, String numero_cartao, String cvv_cartao, String validade_cartao,
			String cliente, String forma) {
		super();
		this.titular_cartao = titular_cartao;
		this.numero_cartao = numero_cartao;
		this.cvv_cartao = cvv_cartao;
		this.validade_cartao = validade_cartao;
		this.cliente =Long.parseLong(cliente) ;
		this.forma = Long.parseLong(forma);
	}



	public FormCartao() {
	
	}



	public Long getCliente() {
		return cliente;
	}



	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}



	public Long getForma() {
		return forma;
	}



	public void setForma(Long forma) {
		this.forma = forma;
	}



	public String getTitular_cartao() {
		return titular_cartao;
	}


	public void setTitular_cartao(String titular_cartao) {
		this.titular_cartao = titular_cartao;
	}


	public String getCvv_cartao() {
		return cvv_cartao;
	}


	public void setCvv_cartao(String cvv_cartao) {
		this.cvv_cartao = cvv_cartao;
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
	
	
	
	
}



