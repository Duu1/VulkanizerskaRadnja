package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * Klasa koja predstavlja vulkanizersku radnju
 * sa svim gumama koje se nalaze u istoj.
 * 
 * @author Dusan
 * @version 1.0.0
 * 
 */

public class VulkanizerskaRadnja {
	/**
	 * Privatni atribut tipa liste koji sadrzi sve gume
	 * koje se nalaze u radnji.
	 */
	public LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje novi model gume na pocetak liste guma.
	 * 
	 * @param a novi model gume koji treba da se unese u listu.
	 * 
	 * @throws java.lang.NullPointerException u slucaju da je
	 * unet null parametar.
	 * 
	 * @throws java.lang.RuntimeException u slucaju da je guma
	 * koja je uneta kao parametar metoda vec sadrzana u listi
	 * svih guma iz radnje.
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Pronalazi odredjeni model gume u listi gume.
	 * 
	 * @param markaModel model gume koji treba da
	 * bude pronadjen u listi gume.
	 * 
	 * @return null vrednost, praznu listu ili novu listu
	 * sa trazenim elementom
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			throw new NullPointerException("markaModel ne sme biti null");
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
