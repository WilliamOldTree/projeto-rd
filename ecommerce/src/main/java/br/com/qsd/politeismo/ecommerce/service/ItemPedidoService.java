package br.com.qsd.politeismo.ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qsd.politeismo.ecommerce.controller.dto.ItemPedidoDTO;
import br.com.qsd.politeismo.ecommerce.controller.dto.ItemPedidoDetalheDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormItemPedido;
import br.com.qsd.politeismo.ecommerce.entities.ItemPedido;
import br.com.qsd.politeismo.ecommerce.entities.PedidoProdutoID;
import br.com.qsd.politeismo.ecommerce.repository.ItemPedidoRepository;

@Service
public class ItemPedidoService {
	
	@Autowired
	private ItemPedidoRepository itemRepository;
	
	@Transactional(readOnly = true)
	public List<ItemPedidoDetalheDTO> findAll() {
		List <ItemPedido> list = itemRepository.findAll();
		return list.stream().map(x-> new ItemPedidoDetalheDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public ItemPedidoDTO insert(FormItemPedido form) {
		ItemPedido entity = new ItemPedido();
		PedidoProdutoID id = new PedidoProdutoID();
        
		id.setIdPedido(Long.parseLong(form.getPedido()));
		id.setIdProduto(Long.parseLong(form.getProduto()));
		

		entity.setPedidoProdutoID(id);
		entity.setQuantidade(Integer.parseInt(form.getQuantidade()));
		entity = itemRepository.save(entity);
	
		return new ItemPedidoDTO(entity);
	}
	
	
}
