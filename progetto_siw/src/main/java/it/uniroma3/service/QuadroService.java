package it.uniroma3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import it.uniroma3.model.Quadro;
import it.uniroma3.repository.QuadroRepository;
public class QuadroService {

	 @Autowired
	    private QuadroRepository QuadroRepository; 

	    public Iterable<Quadro> findAll() {
	        return this.QuadroRepository.findAll();
	    }

	    @Transactional
	    public void add(final Quadro quadro) {
	        this.QuadroRepository.save(quadro);
	    }

		public Quadro findbyId(Long id) {
			return this.QuadroRepository.findOne(id);
		}
		
		public void cancella(Long id) {
			this.QuadroRepository.delete(id);
		}	
}
