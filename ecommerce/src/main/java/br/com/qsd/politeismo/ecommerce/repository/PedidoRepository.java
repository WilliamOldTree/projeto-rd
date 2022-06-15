package br.com.qsd.politeismo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	void save(Cliente cliente);

}
