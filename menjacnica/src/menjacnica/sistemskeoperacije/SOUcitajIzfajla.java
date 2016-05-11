package menjacnica.sistemskeoperacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import menjacnica.Valuta;

public class SOUcitajIzfajla {

	public static void izvrsi(String putanja, List<Valuta> kursnaLista) {
		try{
			ObjectInputStream in = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(putanja)));
			
			LinkedList<Valuta> kursnaLista2 = (LinkedList<Valuta>)(in.readObject());		
			kursnaLista.clear();
			kursnaLista.addAll(kursnaLista2);
			in.close();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
