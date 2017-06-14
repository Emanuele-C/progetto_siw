package it.uniroma3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name="findAll", query="SELECT q FROM Quadro q")
public class Quadro {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@NotNull
	private String titolo;
	@NotNull
	private int anno;
	@NotNull
	private String tecnica;
	@NotNull
	private float lunghezza;
	@NotNull
	private String luUnita;
	@NotNull
	private String laUnita;
	@NotNull
	private float larghezza;
	@NotNull
	private String autore;
	
	
	public Quadro(){
	}

	public String getTitolo(){
		return this.titolo;
	}
	public void setTitolo(String titolo){
		this.titolo=titolo;	
	}
	public int getAnno(){
		return this.anno;
	}
	public void setAnno(int anno){
		this.anno=anno;
		
	}
	public String getTecnica(){
		return this.tecnica;
	}
	public void setTecnica(String tecnica){
		this.tecnica=tecnica;
		
	}
	public Float getLunghezza(){
		return this.lunghezza;
	}
	public void setLunghezza(float lunghezza){
		this.lunghezza=lunghezza;	
	}
	public void setLuUnita(String luUnita){
		this.luUnita=luUnita;
	}
	public void setLaUnita(String laUnita){
		this.laUnita=laUnita;
	}
	public Float getLarghezza(){
		return this.larghezza;
	}
	public void setLarghezza(float larghezza){
		this.larghezza= larghezza;
	}
	public String getAutore(){
		return this.autore;
	}
	public void setAutore(String autore){
		this.autore=autore;
		
	}
}
