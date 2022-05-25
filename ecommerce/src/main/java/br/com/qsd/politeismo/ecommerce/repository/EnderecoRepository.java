package br.com.qsd.politeismo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.qsd.politeismo.ecommerce.entities.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{


}
