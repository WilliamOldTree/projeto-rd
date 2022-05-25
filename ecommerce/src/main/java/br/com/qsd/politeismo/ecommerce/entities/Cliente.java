<<<<<<< HEAD
<<<<<<< HEAD
package br.com.qsd.politeismo.ecommerce.entities;

import java.time.LocalDate;
import java.util.List;

=======
package br.com.qsd.politeismo.ecommerce.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
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
<<<<<<< HEAD

import com.fasterxml.jackson.annotation.JsonIgnore;

=======
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import com.fasterxml.jackson.annotation.JsonIgnore;
>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
import br.com.qsd.politeismo.ecommerce.enums.Genero;

@Entity
@Table(name = "CLIENTE")
<<<<<<< HEAD
public class Cliente {
	
    @Id
=======
public class Cliente implements UserDetails{

	private static final long serialVersionUID = 1L;
	@Id
>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_cliente")
    private Long id;
    private String cpf;
    private String nome;
    private String email;
<<<<<<< HEAD
	private String password;
=======
    private String password;
>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
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
	
<<<<<<< HEAD
=======
	@Fetch(FetchMode.SELECT)
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Perfil> perfis = new ArrayList<>();

>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
	
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
<<<<<<< HEAD
	
	 public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	
=======

	public void setPassword(String password) {
		this.password = password;
	}

>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
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
<<<<<<< HEAD
		
	}
	
}// end class
=======
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
    private String password;
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
	
	
	public Cliente() {
		
	}

	public Long getId() {
		return id;
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
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}



	public void setId(Long id) {
		this.id = id;
	}
	
}
>>>>>>> 2a13be4dd739321b0ff51abb2a3466b580a8a98a
=======
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.perfis;
	}

	public String getUsername() {
		return this.email;
	}
	
	public String getPassword() {
		return this.password;
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
>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
