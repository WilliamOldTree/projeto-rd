package br.com.rd.queroserdev.loja.mvc.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long>, CrudRepository<Pagamento, Long> {

	public List<Pagamento> findAll();

}