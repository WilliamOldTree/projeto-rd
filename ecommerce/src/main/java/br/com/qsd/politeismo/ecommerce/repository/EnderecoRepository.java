package br.com.qsd.politeismo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import br.com.qsd.politeismo.ecommerce.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>, CrudRepository<Endereco, Long>{


}
