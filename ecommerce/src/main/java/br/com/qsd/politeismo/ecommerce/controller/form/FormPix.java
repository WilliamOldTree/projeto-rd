package br.com.qsd.politeismo.ecommerce.controller.form;



public class FormPix {
	
	private String chave = "88faa317-c217-4c29-8228-38f3d978bb6f";
	private String urlImagem;
	private Long cliente;
	
	
	public FormPix(String chave, String urlImagem, String cliente) {
	
		this.chave = chave;
		this.urlImagem = urlImagem;
		this.cliente = Long.parseLong(cliente);
	}

	

	public FormPix() {
		
	}


	public String getChave() {
		return chave;
	}


	public void setChave(String chave) {
		this.chave = chave;
	}


	public String getUrlImagem() {
		return urlImagem;
	}


	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}


	public Long getCliente() {
		return cliente;
	}


	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}
	
	
	
}//EndClass
