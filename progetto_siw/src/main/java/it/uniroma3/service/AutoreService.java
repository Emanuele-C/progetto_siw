package it.uniroma3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.model.Autore;
import it.uniroma3.repository.AutoreRepository;

public class AutoreService  {

	@Autowired
    private AutoreRepository autoreRepository; 
	
	 public Iterable<Autore> findAll() {
	        return this.autoreRepository.findAll();
	    }

	    @Transactional
	    public void add(final Autore autore) {
	        this.autoreRepository.save(autore);
	    }

		public Autore findbyId(Long id) {
			return this.autoreRepository.findOne(id);
		}
		
		public void cancella(Long id) {
			this.autoreRepository.delete(id);
		}	


}
