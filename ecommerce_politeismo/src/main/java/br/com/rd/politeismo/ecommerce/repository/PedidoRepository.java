package br.com.rd.politeismo.ecommerce.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.orm.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>, CrudRepository<Pedido, Long>{
	
	public List<Pedido> findAll();
	
}
