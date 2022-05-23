<<<<<<< HEAD
<<<<<<< HEAD
package br.com.qsd.politeismo.ecommerce.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qsd.politeismo.ecommerce.controller.dto.ClienteDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormCliente;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@Autowired
	private ClienteRepository repository;
	private PasswordEncoder passwordEncoder;

	public ClienteService(ClienteRepository repository) {
	
		this.repository = repository;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}

	// listar
	public List<ClienteDTO> findAll() {
		List<Cliente> list = repository.findAll();
		return list.stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
	}

	// busca por ID
	@Transactional(readOnly = true)
	public ClienteDTO findById(Long id) {
		Cliente entity = repository.findById(id).get();
		ClienteDTO dto = new ClienteDTO(entity);
		return dto;
	}

	// inclusao
	public ClienteDTO insert(FormCliente form) {
		Cliente entity = new Cliente();
		entity.setPassword(this.passwordEncoder.encode(form.getPassword()));
		entity.setCpf(form.getCpf());
		entity.setNome(form.getNome());
		entity.setEmail(form.getEmail()); 
		entity.setNascimento(LocalDate.parse(form.getNascimento(), formatter));
		entity.setGenero(form.getGenero());
		entity.setFixo(form.getFixo());
		entity.setCelular(form.getCelular());


		entity = this.repository.save(entity);

		return new ClienteDTO(entity);

	}
	
	//buscar objeto pelo id para atualizar
	public ClienteDTO update(Long id, FormCliente dto) {
		try {
			Cliente entity = repository.getById(id);
			copy(entity, dto);
			entity = repository.save(entity);
			return new ClienteDTO(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("ID não existe");
		}
	}
	
	// novos dados do objeto a ser atualizado
	private void copy(Cliente entity, FormCliente dto) {
		entity.setCpf(dto.getCpf());
		entity.setNome(dto.getNome());
		entity.setEmail(dto.getEmail());
		entity.setPassword(this.passwordEncoder.encode(dto.getPassword()));
		entity.setNascimento(LocalDate.parse(dto.getNascimento(), formatter));
		entity.setGenero(dto.getGenero());
		entity.setFixo(dto.getFixo());
		entity.setCelular(dto.getCelular());
	}
	
	//deletar po id
	public void deletar(Long id) {
		repository.deleteById(id);
	}
	

}// end class
=======
=======
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
package br.com.qsd.politeismo.ecommerce.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qsd.politeismo.ecommerce.controller.dto.ClienteDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormCliente;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@Autowired
	private ClienteRepository repository;
	private PasswordEncoder passwordEncoder;

	public ClienteService(ClienteRepository repository) {
	
		this.repository = repository;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}

	// listar
	public List<ClienteDTO> findAll() {
		List<Cliente> list = repository.findAll();
		return list.stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
	}

	// busca por ID
	@Transactional(readOnly = true)
	public ClienteDTO findById(Long id) {
		Cliente entity = repository.findById(id).get();
		ClienteDTO dto = new ClienteDTO(entity);
		return dto;
	}

	// inclusao
	public ClienteDTO insert(FormCliente form) {
		Cliente entity = new Cliente();
		entity.setPassword(this.passwordEncoder.encode(form.getPassword()));
		entity.setCpf(form.getCpf());
		entity.setNome(form.getNome());
		entity.setEmail(form.getEmail());
		entity.setNascimento(LocalDate.parse(form.getNascimento(), formatter));
		entity.setGenero(form.getGenero());
		entity.setFixo(form.getFixo());
		entity.setCelular(form.getCelular());


		entity = this.repository.save(entity);

		return new ClienteDTO(entity);

	}
	
	//buscar objeto pelo id para atualizar
	public ClienteDTO update(Long id, FormCliente dto) {
		try {
			Cliente entity = repository.getById(id);
			copy(entity, dto);
			entity = repository.save(entity);
			return new ClienteDTO(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("ID não existe");
		}
	}
	
	// novos dados do objeto a ser atualizado
	private void copy(Cliente entity, FormCliente dto) {
		entity.setCpf(dto.getCpf());
		entity.setNome(dto.getNome());
		entity.setEmail(dto.getEmail());
		entity.setPassword(this.passwordEncoder.encode(dto.getPassword()));
		entity.setNascimento(LocalDate.parse(dto.getNascimento(), formatter));
		entity.setGenero(dto.getGenero());
		entity.setFixo(dto.getFixo());
		entity.setCelular(dto.getCelular());
	}
	
	//deletar po id
	public void deletar(Long id) {
		repository.deleteById(id);
	}
	

}// end class
<<<<<<< HEAD
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
=======
=======
package br.com.qsd.politeismo.ecommerce.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qsd.politeismo.ecommerce.controller.dto.ClienteDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormCliente;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@Autowired
	private ClienteRepository repository;
	private PasswordEncoder passwordEncoder;

	public ClienteService(ClienteRepository repository) {
	
		this.repository = repository;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}

	// listar
	public List<ClienteDTO> findAll() {
		List<Cliente> list = repository.findAll();
		return list.stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
	}

	// busca por ID
	@Transactional(readOnly = true)
	public ClienteDTO findById(Long id) {
		Cliente entity = repository.findById(id).get();
		ClienteDTO dto = new ClienteDTO(entity);
		return dto;
	}

	// inclusao
	public ClienteDTO insert(FormCliente form) {
		Cliente entity = new Cliente();
		entity.setPassword(this.passwordEncoder.encode(form.getPassword()));
		entity.setCpf(form.getCpf());
		entity.setNome(form.getNome());
		entity.setEmail(form.getEmail()); 
		entity.setNascimento(LocalDate.parse(form.getNascimento(), formatter));
		entity.setGenero(form.getGenero());
		entity.setFixo(form.getFixo());
		entity.setCelular(form.getCelular());


		entity = this.repository.save(entity);

		return new ClienteDTO(entity);

	}
	
	//buscar objeto pelo id para atualizar
	public ClienteDTO update(Long id, FormCliente dto) {
		try {
			Cliente entity = repository.getById(id);
			copy(entity, dto);
			entity = repository.save(entity);
			return new ClienteDTO(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("ID não existe");
		}
	}
	
	// novos dados do objeto a ser atualizado
	private void copy(Cliente entity, FormCliente dto) {
		entity.setCpf(dto.getCpf());
		entity.setNome(dto.getNome());
		entity.setEmail(dto.getEmail());
		entity.setPassword(this.passwordEncoder.encode(dto.getPassword()));
		entity.setNascimento(LocalDate.parse(dto.getNascimento(), formatter));
		entity.setGenero(dto.getGenero());
		entity.setFixo(dto.getFixo());
		entity.setCelular(dto.getCelular());
	}
	
	//deletar po id
	public void deletar(Long id) {
		repository.deleteById(id);
	}
	

}// end class
>>>>>>> 4c080c22c4c7cdd9603e7a8907c133b2dea15553
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
