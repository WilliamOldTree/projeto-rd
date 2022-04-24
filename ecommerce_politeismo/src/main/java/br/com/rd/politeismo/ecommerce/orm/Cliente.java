package br.com.rd.politeismo.ecommerce.orm;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String username;
	private String password;
	
	
	public Cliente () {
		
	}
	
	public Cliente(Long id, String nome, String email, String username, String password) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	/*
	 * @OneToMany(mappedBy="cliente") List <Telefone> telefone;
	 * 
	 * @OneToMany(mappedBy="cliente") List<Cartao>cartao;
	 * 
	 * @OneToMany(mappedBy="cliente") List<Pix> pix;
	 * 
	 * @OneToMany(mappedBy="cliente") List<Boleto> boleto;
	 * 
	 * 
	 * @OneToMany(mappedBy="cliente") List<Forma> forma;
	 * 
	 * public List<Boleto> getBoleto() { return boleto; } public List<Forma>
	 * getForma() { return forma; }
	 * 
	 * 
	 * public List<Telefone> getTelefone() { return telefone; }
	 * 
	 * 
	 * public List<Cartao> getCartao() { return cartao; }
	 * 
	 * 
	 * public List<Pix> getPix() { return pix; }
	 */
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}// end class
