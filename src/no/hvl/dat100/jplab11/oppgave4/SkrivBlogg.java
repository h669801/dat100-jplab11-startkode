package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		String fil = filnavn;
		String mappen = mappe;
		PrintWriter skriver;
		String sam = samling.toString();
//		File fil1 = new File(MAPPE_STR + filnavn);
		try {
			skriver = new PrintWriter (mappen + fil);
			skriver.println(sam);
			if (skriver.equals(sam)) {
				skriver.close();
				return true;
				
			}
			else {
				skriver.close();
				return false;
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;
			
		}
		
		
		
		
		

//		throw new UnsupportedOperationException(TODO.method());
	}
}
