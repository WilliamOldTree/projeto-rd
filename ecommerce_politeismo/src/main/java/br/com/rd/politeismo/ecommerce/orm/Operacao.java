package br.com.rd.politeismo.ecommerce.orm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "OPERACAO")
public class Operacao {

	public Operacao() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_OPERACAO")
	private Long idOperacao;
	
	
	@ManyToOne
	@JoinColumn(name = "destinatario_id_destinatario", nullable = false)
	private Destinatario destinatario;
	
	@ManyToOne
	@JoinColumn(name = "remetente_id_remetente", nullable = false)
	private Remetente remetente;
	
	@OneToMany(mappedBy = "operacao")
	private List<NotaFiscal> notaFiscal;
	


	public Long getIdOperacao() {
		return idOperacao;
	}

	public void setIdOperacao(Long idOperacao) {
		this.idOperacao = idOperacao;
	}

	public Destinatario getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}

	public Remetente getRemetente() {
		return remetente;
	}

	public void setRemetente(Remetente remetente) {
		this.remetente = remetente;
	}

	public List<NotaFiscal> getNotaFiscal() {
		return notaFiscal;
	}


	@Override
	public String toString() {
		return "Operacao [idOperacao=" + idOperacao + "]";
	}
	
}
