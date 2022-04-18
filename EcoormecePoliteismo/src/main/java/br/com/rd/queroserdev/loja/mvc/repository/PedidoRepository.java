package br.com.rd.queroserdev.loja.mvc.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>, CrudRepository<Pedido, Long>{
	
	public List<Pedido> findAll();
	
}
