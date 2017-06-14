package it.uniroma3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;
	
	@Entity
	@NamedQuery(name="findAll", query="SELECT a FROM Autore a")
	public class Autore {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		@NotNull
		private String nome;
		@NotNull
		private String cognome;
		@NotNull
		private String nazionalita;
		
		@Temporal(TemporalType.DATE)
		@NotNull
		private Date dataNascita;
		
		@Temporal(TemporalType.DATE) //è possibile non sia ancora morto
		private Date dataMorte;
		
		private List<Quadro> quadri;
		
		public Autore(){
			
		}
		public String getNome(){
			return this.nome;
		}
		public void setNome(String nome){
			this.nome=nome;	
		}
		public String getCognome(){
			return this.cognome;
		}
		public void setCognome(String Cognome){
			this.cognome=cognome;
			
		}
		public String getNazionalita(){
			return this.nazionalita;
		}
		public void setNazionalita(String nazionalita){
			this.nazionalita=nazionalita;
			
		}
		public Date getDataNascita(){
			return this.dataNascita;
		}
		public void setDataNascita(Date dataNascita){
			this.dataNascita=dataNascita;
			
		}
		public Date getDataMorte(){
			return this.dataNascita;
		}
		public void setDataMorte(Date dataMorte){
			this.dataMorte=dataMorte;	
		}
		
		public List<Quadro> getListaQuadri(){
			return this.quadri;
		}
		public void setListaQuadri(List<Quadro> quadri){
			this.quadri=quadri;
		}
	}
