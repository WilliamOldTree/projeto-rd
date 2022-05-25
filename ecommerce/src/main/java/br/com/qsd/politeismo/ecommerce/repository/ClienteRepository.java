package br.com.qsd.politeismo.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Optional<Cliente> findById(String cliente);

	//Optional<Cliente> findByNome(String string);

}
