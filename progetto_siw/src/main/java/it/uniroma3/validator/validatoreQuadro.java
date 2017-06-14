package it.uniroma3.validator;
import it.uniroma3.model.Quadro;

import javax.servlet.http.HttpServletRequest;

 //tocca fare i set del quadro
public class validatoreQuadro {
			
	public boolean validatore(HttpServletRequest request){
		String titolo= request.getParameter("titolo");
		String anno= request.getParameter("anno");
		String tecnica= request.getParameter("tecnica");
		String lunghezza= request.getParameter("lunghezza");
		String larghezza= request.getParameter("larghezza");
		String autore= request.getParameter("autore");
		String luUnita=request.getParameter("luUnita");
		String laUnita=request.getParameter("laUnita");
		Quadro q= (Quadro)request.getAttribute("quadro");
		boolean ok=true;
		request.setAttribute("luUnita",luUnita);
		request.setAttribute("laUnita", laUnita);
		
		if(request.getParameter("titolo").equals("") || titolo==null){
			request.setAttribute("erroreTitolo", "Inserisci il titolo");		
			ok=false;
		}else{
			request.setAttribute("titolo", titolo);
			}
		
		
		if(request.getParameter("anno").equals("") || anno==null){		
			request.setAttribute("erroreAnno", "inserisci l'anno");
			ok=false;
		}
		else {
			try {
				request.setAttribute("anno", Integer.parseInt(anno));
			}
			catch (NumberFormatException e) {
				request.setAttribute("erroreAnno", "Deve essere un numero!");
				ok = false;
			}
		}
		
		if(request.getParameter("tecnica").equals("") || tecnica==null){
			request.setAttribute("erroreTecnica", "Inserisci la tecnica usata");		
			ok=false;
		}else{
			request.setAttribute("tecnica", tecnica);
			}
	
		if(request.getParameter("lunghezza").equals("") || lunghezza==null){
			request.setAttribute("erroreLunghezza", "inserisci lunghezza");		
			ok=false;
		}
		else {
			try {
				request.setAttribute("lunghezza", Float.parseFloat(lunghezza));
			}
			catch (NumberFormatException e) {
				request.setAttribute("erroreLunghezza", "Deve essere un numero!");
				ok = false;
			}
		}
		if(request.getParameter("larghezza").equals("") || larghezza==null){
			request.setAttribute("erroreLarghezza", "inserisci larghezza");		
			ok=false;
		}else {
			try {
				request.setAttribute("larghezza", Float.parseFloat(larghezza));
			}
			catch (NumberFormatException e) {
				request.setAttribute("erroreLarghezza", "Deve essere un numero!");
				ok = false;
			}
		}
		
		if(request.getParameter("autore").equals("") || autore==null){
			request.setAttribute("erroreAutore", "Inserisci autore");		
			ok=false;
		}else{
			request.setAttribute("autore", autore);
		}
		return ok;
		
		}	



}
