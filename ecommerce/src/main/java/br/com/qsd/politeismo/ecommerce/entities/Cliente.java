package br.com.qsd.politeismo.ecommerce.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.qsd.politeismo.ecommerce.enums.Genero;

@Entity
@Table(name = "cliente")

public class Cliente implements UserDetails{

	private static final long serialVersionUID = 1L;
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
    
    private String nascimento;
    
	@Enumerated(EnumType.STRING)
    private Genero genero;
	
	@JsonIgnore
	@ManyToMany(mappedBy="clientes",fetch = FetchType.EAGER)
	private List<Endereco> enderecos;
	
	@JsonIgnore
	@OneToMany(mappedBy="cliente")
	List<Cartao> cartao;
	
	@JsonIgnore
	@OneToMany(mappedBy="cliente")
	List<Pedido> idPedido;
	
	@JsonIgnore
	@OneToMany(mappedBy="cliente")
	List<Favoritos> favoritos;
	
	@JsonIgnore
	@Fetch(FetchMode.SELECT)
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Perfil> perfis = new ArrayList<>();

	
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

	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
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



	public String getNascimento() {
		return nascimento;
	}



	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}



	public Genero getGenero() {
		return genero;
	}



	public void setGenero(Genero genero) {
		this.genero = genero;
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



	public void setCartao(List<Cartao> cartao) {
		this.cartao = cartao;
	}



	public List<Pedido> getPedido() {
		return idPedido;
	}



	public void setPedido(List<Pedido> pedido) {
		this.idPedido = pedido;
	}



	public List<Favoritos> getFavoritos() {
		return favoritos;
	}



	public void setFavoritos(List<Favoritos> favoritos) {
		this.favoritos = favoritos;
	}



	public List<Perfil> getPerfis() {
		return perfis;
	}



	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}



	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.perfis;
	}

	public String getUsername() {
		return this.email;
	}
	
	public String getPassword() {
		return this.senha;
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return true;
	}
	
}// end class
