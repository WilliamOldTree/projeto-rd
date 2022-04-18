package br.com.rd.queroserdev.loja.mvc.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.Destinatario;

@Repository
public interface DestinatarioRepository extends JpaRepository<Destinatario, Long>, CrudRepository<Destinatario, Long> {

	public List<Destinatario> findAll();

}
