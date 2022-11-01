package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	
//	private Blogg[] blogg;
	private Innlegg[] innleggtabell;
	private int nesteLedig;
	

	// TODO: objektvariable 

	public Blogg() {
		
		innleggtabell = new Innlegg[20];
		
//		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
		
//		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		
		int test = innleggtabell.length;
		
		return test;
		
//		throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		
		return this.innleggtabell;
//		throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int posisjon = 0;
		boolean funnet = false;
		
		while (posisjon < nesteLedig && !funnet) {
			if(innleggtabell[posisjon].getId() == innlegg.getId()) {
				funnet = true;
				
				}
			else {
					posisjon++;
			}
		}
		if (funnet) {
			return posisjon;
		}
		else {
			return -1;
		}
//		while (posisjon < nesteLedig && !Innlegg.erLik(innlegg)) {
//			if (Innlegg.erLik(innlegg)) {
////				int index = innleggtabell[posisjon];
//			return posisjon;
//		}
//		
//		else {
//			return -1;
//		}
////		for (int i = 0; i < innleggtabell.length; i++) {
////			int id = innlegg.getId();
//			
//		}
		
		
//		try {
//			while (posisjon < nesteLedig && !Innlegg.erLik(innlegg)){
//				if (innleggtabell[posisjon].getid() == innlegg) {
//					
//				}
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		
		int posisjon = 0;
		boolean funnet = false;
		
		while (posisjon < nesteLedig && !funnet) {
			if(innleggtabell[posisjon].getId() == innlegg.getId()) {
				funnet = true;
				
				}
			else {
					posisjon++;
			}
		}
		if (funnet) {
			return true;
		}
		else {
			return false;
		}
			
//		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] == null) {
				return true;
			}
			
		}
		return false;
//		throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean ny = finnInnlegg(innlegg) == -1;
		if (ny && nesteLedig < innleggtabell.length) {
			innleggtabell[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		}
		else {
			return false;
		}
//		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		String f = Integer.toString(getAntall());
		String tekst = f + "\n" + ;
//		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}