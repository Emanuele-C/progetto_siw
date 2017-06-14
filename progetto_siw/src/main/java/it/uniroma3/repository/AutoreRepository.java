package it.uniroma3.repository;
import java.util.List;
import it.uniroma3.model.Autore;

import org.springframework.data.repository.CrudRepository;

public interface AutoreRepository extends CrudRepository<Autore,Long>{
	List<Autore> findByNome(String Nome);
	List<Autore> findByCognome(String cognome);
}
