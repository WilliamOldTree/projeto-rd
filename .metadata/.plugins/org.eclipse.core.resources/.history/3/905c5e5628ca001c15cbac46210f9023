package com.springrobinson.crudjpahibernatemysql.service;

import com.springrobinson.crudjpahibernatemysql.model.Cliente;
import com.springrobinson.crudjpahibernatemysql.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente findCliente(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
}
