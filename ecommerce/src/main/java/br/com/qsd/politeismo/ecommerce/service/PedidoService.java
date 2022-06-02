package br.com.qsd.politeismo.ecommerce.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.com.qsd.politeismo.ecommerce.controller.dto.PedidoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormPedido;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;
import br.com.qsd.politeismo.ecommerce.enums.StatusPedido;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;
import br.com.qsd.politeismo.ecommerce.repository.EnderecoRepository;
import br.com.qsd.politeismo.ecommerce.repository.PedidoRepository;

@Service
public class PedidoService {
	
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Transactional(readOnly = true)
	public List<PedidoDTO> findAll(){
		List <Pedido> list = pedidoRepository.findAll();
		return list.stream().map(x-> new PedidoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public PedidoDTO findById(Long id) {
		Pedido entity = pedidoRepository.findById(id).get();
		PedidoDTO dto = new PedidoDTO(entity);
		return dto;
	}
	
	@Transactional
	public PedidoDTO insert(FormPedido form) {
		Pedido entity = new Pedido();
		
        entity.setData(LocalDate.parse(form.getData(), formatter));
        entity.setValor(new BigDecimal(form.getValor()));
        entity.setStatusPedido(StatusPedido.AGUARDANDO_PAGAMENTO);
		Optional<Cliente> cliente = clienteRepository.findById(Long.parseLong(form.getCliente()));
		Optional<Endereco> endereco = enderecoRepository.findById(Long.parseLong(form.getEndereco()));
		
		if (cliente.isPresent() && endereco.isPresent()) {
			entity.setCliente(cliente.get());
			entity.setEndereco(endereco.get());
			entity = pedidoRepository.save(entity);
		}else {
			cliente.orElseThrow();
		}
		
		return new PedidoDTO(entity);
	}
	
	public PedidoDTO update(Long id, FormPedido dto) {
		try {
			Pedido entity = pedidoRepository.getById(id);
			copy(entity, dto);
			entity = pedidoRepository.save(entity);
			return new PedidoDTO(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("ID não existe");
		}
	}
	
	
	private void copy(Pedido entity, FormPedido dto) {
        entity.setStatusPedido(dto.getStatusPedido());
	}	
	
}
