package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private String tekst;
	private int likes;

	// TODO: objektvariable 
	
	public Tekst () {
		
//		id = getId();
//		bruker = getBruker();
//		dato = getDato();
//		likes = getLikes();
		
//		this.id = id;
//		this.bruker = bruker;
//		this.dato = dato;
//		this.tekst = tekst;
//		this.likes = likes;
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		
//		this.id = id;
//		this.bruker = bruker;
//		this.dato = dato;
		super(id,bruker,dato);
		this.tekst = tekst;
		
		likes = 0;
		
//		throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
//		this.id = id;
//		this.bruker = bruker;
//		this.dato = dato;
		
		super(id,bruker,dato,likes);
		this.tekst = tekst;
//		this.likes = likes;
		
//		throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public String getTekst() {
		
		return tekst;
		
//		throw new UnsupportedOperationException(TODO.method());

	}

	public void setTekst(String tekst) {
		
		this.tekst = tekst;
		
//		throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		
//		String tekst = "TEKST" + "\n" + id + "\n" + bruker + "\n" + dato + 
//		Tekst string1 = new Tekst();
//		String te = 
		
		String tekst = "TEKST" + "\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + getTekst() + "\n";
		
		System.out.print(tekst);
		return tekst;
		
//		throw new UnsupportedOperationException(TODO.method());

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
