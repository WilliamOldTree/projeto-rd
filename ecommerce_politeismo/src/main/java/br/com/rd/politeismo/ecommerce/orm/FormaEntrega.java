/*
 * package br.com.rd.politeismo.ecommerce.orm;
 * 
 * import java.util.List;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.OneToMany; import
 * javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "FORMA_ENTREGA") public class FormaEntrega {
 * 
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY)
 * 
 * @Column(name="ID_FORMA_ENTREGA") private Long idFormaEntrega;
 * 
 * @Column(nullable = true, name = "EMPRESA") private String empresa;
 * 
 * 
 * @OneToMany(mappedBy = "formaEntrega") private List<Entrega> entrega;
 * 
 * 
 * public FormaEntrega() { // TODO Auto-generated constructor stub }
 * 
 * 
 * public Long getIdFormaEntrega() { return idFormaEntrega; }
 * 
 * public void setIdFormaEntrega(Long idFormaEntrega) { this.idFormaEntrega =
 * idFormaEntrega; }
 * 
 * public String getEmpresa() { return empresa; }
 * 
 * public void setEmpresa(String empresa) { this.empresa = empresa; }
 * 
 * public List<Entrega> getEntrega() { return entrega; }
 * 
 * 
 * }
 */