package br.com.rd.queroserdev.loja.mvc.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long>, CrudRepository<Departamento, Long> {

	public List<Departamento> findAll();

}
