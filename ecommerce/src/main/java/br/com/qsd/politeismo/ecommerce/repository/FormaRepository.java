package br.com.qsd.politeismo.ecommerce.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import br.com.qsd.politeismo.ecommerce.entities.Forma;






public interface FormaRepository extends JpaRepository<Forma, Long>, CrudRepository<Forma,Long>{

}
