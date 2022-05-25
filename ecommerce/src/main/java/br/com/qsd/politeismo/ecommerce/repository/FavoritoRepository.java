package br.com.qsd.politeismo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.qsd.politeismo.ecommerce.entities.Favoritos;

@Repository
public interface FavoritoRepository extends JpaRepository<Favoritos, Long>, CrudRepository<Favoritos, Long> {

}