package br.com.rd.queroserdev.loja.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OPERACAO")
public class Operacao {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_OPERACAO")
	private Long idOperacao;
	
	

	public Long getIdOperacao() {
		return idOperacao;
	}

	public void setIdOperacao(Long idOperacao) {
		this.idOperacao = idOperacao;
	}



	
	
	
}
