package br.com.qsd.politeismo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.qsd.politeismo.ecommerce.entities.ItemPedido;
import br.com.qsd.politeismo.ecommerce.entities.PedidoProdutoID;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, PedidoProdutoID>, CrudRepository<ItemPedido, PedidoProdutoID>{
	
    

}
