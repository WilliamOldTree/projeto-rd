<<<<<<< HEAD
package br.com.qsd.politeismo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.qsd.politeismo.ecommerce.entities.Favoritos;

@Repository
public interface FavoritoRepository extends JpaRepository<Favoritos, Long>, CrudRepository<Favoritos,Long> {

=======
package br.com.qsd.politeismo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.qsd.politeismo.ecommerce.entities.Favoritos;

@Repository
public interface FavoritoRepository extends JpaRepository<Favoritos, Long>, CrudRepository<Favoritos, Long> {

>>>>>>> 4c080c22c4c7cdd9603e7a8907c133b2dea15553
}