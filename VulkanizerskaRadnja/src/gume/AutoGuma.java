package gume;

/**
 * Klasa koja predstavlja karakteristike
 * automobilske gume.
 * 
 * @author Dusan
 * @version 1.0.0
 * 
 */

public class AutoGuma {
	
	/**
	 * Privatni atribut tipa String koji oznacava model gume.
	 */
	private String markaModel = null;
	/**
	 * Privatni atribut tipa int koji oznacava precnik gume.
	 */
	private int precnik = 0;
	/**
	 * Privatni atribut tipa int koji oznacava sirinu gume.
	 */
	private int sirina = 0;
	/**
	 * Privatni atribut tipa int koji oznacava visinu gume.
	 */
	private int visina = 0;

	/**
	 * Metoda kojom se dobija informacija o modelu gume.
	 * 
	 * @return model gume kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	/**
	 * Metoda kojom se za model gume postavlja konkretna vrednost.
	 * 
	 * @param markaModel nova vrednost modela gume
	 * 
	 * @throws java.lang.RuntimeException u slucaju da je 
	 * parametar model null String ili String kraci od 3 karaktera.
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	/**
	 * Metoda kojom se dobija informacija o precniku gume.
	 * 
	 * @return precnik gume kao celobrojnu vrednost.
	 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * Metoda kojom se za precnik gume postavlja konkretna vrednost.
	 * 
	 * @param precnik nova vrednost precnika gume
	 * 
	 * @throws java.lang.RuntimeException u slucaju da je 
	 * vrednost parametra precnik manja od 13 ili veca od 22.
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * Metoda kojom se dobija informacija o sirini gume.
	 * 
	 * @return sirinu gume kao celobrojnu vrednost.
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * Metoda kojom se za sirina gume postavlja konkretna vrednost.
	 * 
	 * @param sirina nova vrednost sirine gume
	 * 
	 * @throws java.lang.RuntimeException u slucaju da je 
	 * vrednost parametra sirina manja od 135 ili veca od 355.
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * Metoda kojom se dobija informacija o visini gume.
	 * 
	 * @return visinu gume kao celobrojnu vrednost.
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Metoda kojom se za visinu gume postavlja konkretna vrednost.
	 * 
	 * @param visina nova vrednost visine gume
	 * 
	 * @throws java.lang.RuntimeException u slucaju da je 
	 * vrednost parametra visina manja od 25 ili veca od 95.
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	/**
	 * Vraca sve informacije o gumi.
	 * 
	 * @return vrednosti svih atributa gume u obliku jednog Stringa
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}
	/**
	 * Uporedjuje gumu unetu kao parametar i vraca vrednost true u slucaju
	 * poklapanje i false u suprotnom.
	 * 
	 * @return true ako je guma identicna
	 * @return false ako se guma razlikuje
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}