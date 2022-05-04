package br.com.rd.politeismo.ecommerce.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>, CrudRepository<Categoria, Long> {

	public List<Categoria> findAll();

}
