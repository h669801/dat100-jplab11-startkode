package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {
	
	private int id;
	private String bruker;
	private String dato;
	private String tekst;
	private String url;
	private int likes;

	// TODO - objekt variable
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.url = url;
		likes = 0;
		
		
//		throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.url = url;
		this.likes = likes;
		
		
//		throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}
	
	public String getUrl() {
		
		return url;
		
//		throw new UnsupportedOperationException(TODO.method());

	}

	public void setUrl(String url) {
		
		this.url = url;
		
//		throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		
		String tekst = 
		
		System.out.println(tekst);
		
		return tekst;
		
//		throw new UnsupportedOperationException(TODO.method ());

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
