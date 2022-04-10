package br.com.rd.politeismo.ecommerce.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.rd.politeismo.ecommerce.orm.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long>, CrudRepository<Pagamento, Long> {

	public List<Pagamento> findAll();

}