package br.com.rd.politeismo.ecommerce.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.entities.Sexo;

@Repository
public interface SexoRepository extends JpaRepository<Sexo, Long>, CrudRepository<Sexo, Long> {

	public List<Sexo> findAll();

}