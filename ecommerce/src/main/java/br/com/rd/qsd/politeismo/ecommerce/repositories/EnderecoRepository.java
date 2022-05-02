package br.com.rd.qsd.politeismo.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.qsd.politeismo.ecommerce.entities.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
