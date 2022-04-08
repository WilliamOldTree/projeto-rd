package br.com.rd.politeismo.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.rd.politeismo.ecommerce.orm.Pix;

@Repository
public interface PixRepository extends JpaRepository<Pix, Long>, CrudRepository<Pix, Long>{
		
		public List<Pix> findAll();


}
