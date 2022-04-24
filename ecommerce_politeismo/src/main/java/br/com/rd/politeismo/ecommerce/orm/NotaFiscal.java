/*
 * package br.com.rd.politeismo.ecommerce.orm;
 * 
 * import java.math.BigDecimal; import java.time.LocalDate; import
 * javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.JoinColumn; import
 * javax.persistence.ManyToOne; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "nota_fiscal") public class NotaFiscal {
 * 
 * @Id
 * 
 * @Column(name= "id_nota_fiscal")
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 * 
 * @Column(name = "codigo_acesso_chave", nullable = false) private Long
 * acessoChave;
 * 
 * 
 * @Column(name = "data_nota_fiscal", nullable = false) private LocalDate
 * dataNf;
 * 
 * @Column(name = "numero_serie", nullable = false) private Long serie;
 * 
 * @Column(nullable = false) private BigDecimal valor;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "pedido_id_pedido", nullable = false) private Pedido
 * pedido;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "operacao_id_operacao", nullable = false) private Operacao
 * operacao;
 * 
 * 
 * 
 * public NotaFiscal() {
 * 
 * }
 * 
 * public Long getId() { return id; }
 * 
 * public void setId(Long id) { this.id = id; }
 * 
 * public Long getAcessoChave() { return acessoChave; }
 * 
 * public void setAcessoChave(Long acessoChave) { this.acessoChave =
 * acessoChave; }
 * 
 * public LocalDate getDataNf() { return dataNf; }
 * 
 * public void setDataNf(LocalDate dataNf) { this.dataNf = dataNf; }
 * 
 * public Long getSerie() { return serie; }
 * 
 * public void setSerie(Long serie) { this.serie = serie; }
 * 
 * public BigDecimal getValor() { return valor; }
 * 
 * public void setValor(BigDecimal valor) { this.valor = valor; }
 * 
 * public Pedido getPedido() { return pedido; }
 * 
 * public Operacao getOperacao() { return operacao; }
 * 
 * 
 * @Override public String toString() { return "NotaFiscal [id=" + id +
 * ", acessoChave=" + acessoChave + ", dataNf=" + dataNf + ", serie=" + serie +
 * ", valor=" + valor + ", pedido=" + pedido + ", operacao=" + operacao + "]"; }
 * 
 * }
 */