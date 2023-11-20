package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		//skal retunere true hvis det blir skrevet til fil
		//Håndtere untak (try catch)
		
	String fil = mappe+filnavn;
	try {
		PrintWriter skriver = new PrintWriter(fil);
		
//		for(int i =0; i<samling.getAntall();i++) {
			skriver.println(samling.toString());
//		}
		skriver.close();
		return true;
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	

	}
}
