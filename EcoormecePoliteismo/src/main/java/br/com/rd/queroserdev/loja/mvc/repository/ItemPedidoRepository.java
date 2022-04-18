package br.com.rd.queroserdev.loja.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.ItemPedido;


@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido,Long>, CrudRepository<ItemPedido,Long> {

}
