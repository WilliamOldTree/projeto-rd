package br.com.rd.queroserdev.loja.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.Favoritos;


@Repository
public interface FavoritosRepository extends JpaRepository<Favoritos, Long>, CrudRepository<Favoritos, Long>  {

}
