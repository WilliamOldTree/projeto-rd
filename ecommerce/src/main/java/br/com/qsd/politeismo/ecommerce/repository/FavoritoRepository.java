<<<<<<< HEAD
package br.com.qsd.politeismo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.qsd.politeismo.ecommerce.entities.Favoritos;

@Repository
public interface FavoritoRepository extends JpaRepository<Favoritos, Long>, CrudRepository<Favoritos, Long> {

=======
package br.com.qsd.politeismo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.qsd.politeismo.ecommerce.entities.Favoritos;

@Repository
public interface FavoritoRepository extends JpaRepository<Favoritos, Long>, CrudRepository<Favoritos,Long> {

>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
}