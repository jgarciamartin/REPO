package com.example.demo;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


public interface ContactoRepository extends CrudRepository<Contacto, Integer> {	
//	List<Contacto> findAll();
	Page<Contacto> findAll(Pageable pageable);
}
