package br.com.rd.politeismo.ecommerce.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.rd.politeismo.ecommerce.orm.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long>, CrudRepository<Categoria, Long>{
	
	public List<Categoria> findAll();

}
