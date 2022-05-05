//package br.com.rd.politeismo.ecommerce.orm;
//
//import br.com.rd.politeismo.ecommerce.orm.Departamento;
//import br.com.rd.politeismo.ecommerce.orm.Produto;
//import javax.persistence.Entity;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "DEPARTAMENTO_CATEGORIA")
//public class DepartamentoCategoria {
//
//	public DepartamentoCategoria() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	@ManyToOne
//	private Departamento idDepartamento;
//	
//	@ManyToOne
//	private Categoria idCategoria;
//	
//	@ManyToOne
//	private Produto idProduto;
//
//	public Departamento getIdDepartamento() {
//		return idDepartamento;
//	}
//
//	public void setIdDepartamento(Departamento idDepartamento) {
//		this.idDepartamento = idDepartamento;
//	}
//
//	public Categoria getIdCategoria() {
//		return idCategoria;
//	}
//
//	public void setIdCategoria(Categoria idCategoria) {
//		this.idCategoria = idCategoria;
//	}
//
//	public Produto getIdProduto() {
//		return idProduto;
//	}
//
//	public void setIdProduto(Produto idProduto) {
//		this.idProduto = idProduto;
//	}
//
//	@Override
//	public String toString() {
//		return "DepartamentoCategoria [idDepartamento=" + idDepartamento + ", idCategoria=" + idCategoria + "]";
//	}
//	
//	
//	
//
//}