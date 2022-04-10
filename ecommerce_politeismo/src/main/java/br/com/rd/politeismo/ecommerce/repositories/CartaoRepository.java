package br.com.rd.politeismo.ecommerce.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.orm.Cartao;

	@Repository
	public interface CartaoRepository  extends JpaRepository<Cartao, Long>, CrudRepository<Cartao, Long> {

		public List<Cartao> findAll();


}
