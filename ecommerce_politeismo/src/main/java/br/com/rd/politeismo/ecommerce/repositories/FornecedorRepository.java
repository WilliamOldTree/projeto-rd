package br.com.rd.politeismo.ecommerce.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.rd.politeismo.ecommerce.orm.Fornecedor;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>, CrudRepository<Fornecedor, Long> {

	public List<Fornecedor> findAll();

}
