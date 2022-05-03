package br.com.qsd.politeismo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.qsd.politeismo.ecommerce.entities.Cartao;




public interface CartaoRepository extends JpaRepository<Cartao, Long>, CrudRepository<Cartao,Long>{

}
