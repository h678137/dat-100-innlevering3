package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggstabell;
	private int nesteledig;

	public Blogg() {
		innleggstabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggstabell;
	}

	public int finnInnlegg(Innlegg innlegg) {
		
		boolean funnet = false;
		int pos = -1;
		int i = 0;
		if (nesteledig == 0) {
			System.out.println("innleggstabbellen er tom");
			return pos;
		}
		while (i < nesteledig && !funnet) {
			if (innleggstabell[i].erLik(innlegg)) {
				pos = i;
				funnet = true;
			}
			i++;
		}
		return pos;

	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean finnes = false;
		
		for (int i=0; i<nesteledig; i++) {
			if (innleggstabell[i].erLik(innlegg)) {
				finnes = true;
				break;
			}
		}return finnes;
	}
	
	public boolean ledigPlass() {
//		return nesteledig < innleggstabell.length;
		if(nesteledig<innleggstabell.length) {
			return true;
		}else {
			return false;
		}
		
	}

	public boolean leggTil(Innlegg innlegg) {

		if(nesteledig>=innleggstabell.length) {
			return false;
		}else if (finnes(innlegg)){
			return false;
		}else {
			innleggstabell[nesteledig]=innlegg;
			nesteledig++;
			return true;
		}
	}
	
	public String toString() {
		
		String ts = "";
		ts +=nesteledig + "\n";
		for (int i=0; i<nesteledig; i++) {
			ts+=innleggstabell[i].toString();
		}
		return ts;
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