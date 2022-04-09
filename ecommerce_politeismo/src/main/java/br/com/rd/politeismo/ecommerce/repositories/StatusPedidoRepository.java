package br.com.rd.politeismo.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.orm.StatusPedido;

@Repository
public interface StatusPedidoRepository extends JpaRepository<StatusPedido, Long>, CrudRepository<StatusPedido, Long> {

	public List<StatusPedido> findAll();

}
