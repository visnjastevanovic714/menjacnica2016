package menjacnica;

import java.util.LinkedList;

import menjacnica.sistemskeoperacije.SOIzvrsiTransakciju;
import menjacnica.sistemskeoperacije.SOUcitajIzfajla;

public class MenjacnicaJavna {

	private LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();

	public double izvrsiTransakciju(Valuta valuta, boolean prodaja, double iznos) {
		return SOIzvrsiTransakciju.izvrsi(valuta, prodaja, iznos);
	}

	public void ucitajIzFajla(String putanja) {
		SOUcitajIzfajla.izvrsi(putanja, kursnaLista);
	}
}
