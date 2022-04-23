/*
 * package br.com.rd.politeismo.ecommerce.orm;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.JoinColumn; import
 * javax.persistence.ManyToOne; import javax.persistence.Table;
 * 
 * 
 * @Entity
 * 
 * @Table(name = "TELEFONE") public class Telefone {
 * 
 * @Id
 * 
 * @Column(name= "id_telefone")
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 * 
 * 
 * @Column(nullable = false) private int ddd; private String celular;
 * 
 * @Column(nullable = true) private String fixo;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name="cliente_id_cliente", nullable=false) private Cliente
 * cliente;
 * 
 * public Long getId() { return id; }
 * 
 * public void setId(Long id) { this.id = id; }
 * 
 * public int getDdd() { return ddd; }
 * 
 * public void setDdd(int ddd) { this.ddd = ddd; }
 * 
 * public String getCelular() { return celular; }
 * 
 * public void setCelular(String celular) { this.celular = celular; }
 * 
 * public String getFixo() { return fixo; }
 * 
 * 
 * public void setFixo(String fixo) { this.fixo = fixo; }
 * 
 * }
 */