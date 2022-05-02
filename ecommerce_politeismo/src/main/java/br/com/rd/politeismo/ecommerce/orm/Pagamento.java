/*
 * package br.com.rd.politeismo.ecommerce.orm;
 * 
 * import java.math.BigDecimal; import java.time.LocalDate;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.JoinColumn; import
 * javax.persistence.ManyToOne; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "PAGAMENTO") public class Pagamento {
 * 
 * @Id
 * 
 * @Column(name = "id_pagamento")
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 * 
 * @Column(nullable = false) private LocalDate data_pagamento; private String
 * status_pagamento; private BigDecimal valor_pagamento;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "pedido_id_pedido", nullable = false) private Pedido
 * pedido;
 * 
 * 
 * 
 * public Pedido getPedido() { return pedido; }
 * 
 * public void setPedido(Pedido pedido) { this.pedido = pedido; }
 * 
 * public Long getId() { return id; }
 * 
 * public void setId(Long id) { this.id = id; }
 * 
 * public LocalDate getData_pagamento() { return data_pagamento; }
 * 
 * public void setData_pagamento(LocalDate data_pagamento) { this.data_pagamento
 * = data_pagamento; }
 * 
 * public String getStatus_pagamento() { return status_pagamento; }
 * 
 * public void setStatus_pagamento(String status_pagamento) {
 * this.status_pagamento = status_pagamento; }
 * 
 * public BigDecimal getValor_pagamento() { return valor_pagamento; }
 * 
 * public void setValor_pagamento(BigDecimal valor_pagamento) {
 * this.valor_pagamento = valor_pagamento; }
 * 
 * 
 * }
 */