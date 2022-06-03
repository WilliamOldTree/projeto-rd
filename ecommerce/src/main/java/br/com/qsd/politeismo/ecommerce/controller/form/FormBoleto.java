package br.com.qsd.politeismo.ecommerce.controller.form;

public class FormBoleto {
	
	private String nome;
	private String cpf;
	private String codigoBarra;
	private Double valor;
	private Long cliente;
	

	public FormBoleto(String nome, String cpf, String codigoBarra, Double valor, String cliente ) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.codigoBarra = codigoBarra;
		this.valor = valor;
		this.cliente =Long.parseLong(cliente) ;	
	}
	
	public FormBoleto() {
		
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

	public Long getCliente() {
		return cliente;
	}

	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}
}//End Class
