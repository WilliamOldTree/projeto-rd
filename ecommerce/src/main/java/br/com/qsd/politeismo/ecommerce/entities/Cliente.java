package br.com.qsd.politeismo.ecommerce.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.qsd.politeismo.ecommerce.enums.Genero;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_cliente")
    private Long id;
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private String celular;
    private String fixo;
    
    private LocalDate nascimento;
    
	@Enumerated(EnumType.STRING)
    private Genero genero;
	
	@ManyToMany(mappedBy="clientes",fetch = FetchType.EAGER)
	private List<Endereco> enderecos;
	
	@JsonIgnore
	@OneToMany(mappedBy="cliente")
	List<Cartao> cartao;
	
	@JsonIgnore
	@OneToMany(mappedBy="cliente")
	List<Forma> forma;
	
	@JsonIgnore
	@OneToMany(mappedBy="cliente")
	List<Pedido> pedido;
	
	@JsonIgnore
	@OneToMany(mappedBy="cliente")
	List<Favoritos> favoritos;
	
	
	public Cliente() {
		
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return senha;
	}

	public void setPassword(String password) {
		this.senha = senha;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
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

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Cartao> getCartao() {
		return cartao;
	}

	public List<Forma> getForma() {
		return forma;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}
	
}// end class
