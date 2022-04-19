package br.com.rd.politeismo.ecommerce.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.rd.politeismo.ecommerce.orm.Remetente;


@Repository
public interface RemetenteRepository extends JpaRepository<Remetente, Long>, CrudRepository<Remetente, Long> {

	public List<Remetente> findAll();

}
