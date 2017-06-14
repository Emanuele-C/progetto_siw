package it.uniroma3.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import it.uniroma3.model.Quadro;
public interface QuadroRepository extends CrudRepository<Quadro, Long> {
	
	List <Quadro> findByTitolo(String titolo);
	List <Quadro> findByAutore(String autore);

}
