package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		boolean harskrevet = true;
		// skal retunere true hvis det blir skrevet til fil
		// Håndtere untak (try catch)
		PrintWriter skriver = null;
		String fil = mappe + filnavn;
		String melding = "Teksten er lagret i fil";

		try {
			skriver = new PrintWriter(fil);
			skriver.println(samling.toString());

//		}
			skriver.close();
			return true;
		} catch (FileNotFoundException e) {
			melding = "Fikk ikke skrevet til fil";
			e.printStackTrace();
			harskrevet = false;
		} finally {
			if (skriver != null) {
				skriver.close();
				System.out.println(melding);
			}
		}
		return harskrevet;
	}
}
