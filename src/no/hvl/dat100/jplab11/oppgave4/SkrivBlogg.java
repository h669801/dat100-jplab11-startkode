package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		String fil = filnavn;
		String mappen = mappe;
		PrintWriter skriver = new PrintWriter (fil);
		
		String sam = samling.toString();
		
		skriver.println(sam);
		
		skriver.close();
		

//		throw new UnsupportedOperationException(TODO.method());
	}
}
