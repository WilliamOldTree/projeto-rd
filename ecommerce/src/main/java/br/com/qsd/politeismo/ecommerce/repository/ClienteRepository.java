package br.com.qsd.politeismo.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>, JpaRepository<Cliente, Long> {

<<<<<<< HEAD
=======
<<<<<<< HEAD
	Optional<Cliente> findByEmail(String username);
//	Optional<Cliente>findById(String cliente);
	
=======
>>>>>>> 86e1c0a1c78de88577ad12078da4115158ec772a
	Optional<Cliente> findById(String cliente);

	Optional<Cliente> findByEmail(String email);
	
	@Query("SELECT ec FROM Cliente ec WHERE ec.email = :email")
	Cliente getClienteByEmail(@Param("email")String email);

<<<<<<< HEAD
}
=======
>>>>>>> 955bc3b69e1378e89cea6b984af3ec473700e377
}
>>>>>>> 86e1c0a1c78de88577ad12078da4115158ec772a
