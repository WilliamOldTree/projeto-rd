package com.springrobinson.crudjpahibernatemysql.controller;

import com.springrobinson.crudjpahibernatemysql.model.Cliente;
import com.springrobinson.crudjpahibernatemysql.service.ClienteService;
import com.springrobinson.crudjpahibernatemysql.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private IClienteService interCliente;

    @GetMapping("/clientes/traer")
    public List<Cliente> getClientes(){
        return interCliente.getClientes();
    }

    @PostMapping("/clientes/crear")
    public String crearCliente(@RequestBody Cliente cliente){
        interCliente.saveCliente(cliente);

        return "Cliente creado Correctamente";
    }

    @DeleteMapping("/clientes/borrar/{id}")
    public String borrarCliente(@PathVariable Long id) {
        interCliente.deleteCliente(id);
        return "Cliente borrado correctamente";
    }

    @PutMapping("/clientes/editar/{id}")
    public Cliente editarCliente(@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("apellido") String nuevoApellido,
                                @RequestParam ("edad") int nuevaEdad){
        Cliente cliente = interCliente.findCliente(id);

        cliente.setApellido(nuevoApellido);
        cliente.setNombre(nuevoNombre);
        cliente.setEdad(nuevaEdad);

        interCliente.saveCliente(cliente);

        return cliente;

    }


}
