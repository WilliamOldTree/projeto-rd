package br.com.rd.queroserdev.loja.mvc.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.Cartao;


	@Repository
	public interface CartaoRepository  extends JpaRepository<Cartao, Long>, CrudRepository<Cartao, Long> {

		public List<Cartao> findAll();


}
