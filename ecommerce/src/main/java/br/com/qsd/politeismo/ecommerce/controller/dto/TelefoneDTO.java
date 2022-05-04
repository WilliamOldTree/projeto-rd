package br.com.qsd.politeismo.ecommerce.controller.dto;

public class TelefoneDTO {

	private String ddd;
	private String celular;
	private String fixo;
	
	public TelefoneDTO() {
		// TODO Auto-generated constructor stub
	}
	

	public TelefoneDTO(String ddd, String celular, String fixo) {
		super();
		this.ddd = ddd;
		this.celular = celular;
		this.fixo = fixo;
	}

	
	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getFixo() {
		return fixo;
	}

	public void setFixo(String fixo) {
		this.fixo = fixo;
	}
	
	
}
