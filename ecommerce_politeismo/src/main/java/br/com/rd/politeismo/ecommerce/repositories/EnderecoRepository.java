package br.com.rd.politeismo.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.orm.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>, CrudRepository<Endereco, Long> {

	public List<Endereco> findAll();

}
