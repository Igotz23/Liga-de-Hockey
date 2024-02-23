package T1ERRONKA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * 
 */
public class Taldeak implements Serializable, Comparable<Taldeak> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1471102583088789878L;
	/**
	 * 
	 */
	public int taldeaID;
	/**
	 * 
	 */
	private String TaldeIzena;
	/**
	 * 
	 */
	private int puntoak;
	/**
	 * 
	 */
	private String sailkapenPosizioa;
	/**
	 * 
	 */
	private ArrayList<Jokalaria> taldeJokalariak;
	
	/**
	 * 
	 */
	public Taldeak() {	}

	/**
	 * @param taldeaID
	 * @param taldeIzena
	 * @param puntoak
	 * @param sailkapenPosizioa
	 * @param taldeJokalariak
	 */
	public Taldeak(int taldeaID, String taldeIzena, int puntoak, String sailkapenPosizioa,
			ArrayList<Jokalaria> taldeJokalariak) {
		super();
		this.taldeaID = taldeaID;
		TaldeIzena = taldeIzena;
		this.puntoak = puntoak;
		this.sailkapenPosizioa = sailkapenPosizioa;
		this.taldeJokalariak = taldeJokalariak;
	}

	/**
	 * @return the taldeaID
	 */
	public int getTaldeaID() {
		return taldeaID;
	}

	/**
	 * @param taldeaID the taldeaID to set
	 */
	public void setTaldeaID(int taldeaID) {
		this.taldeaID = taldeaID;
	}

	/**
	 * @return the taldeIzena
	 */
	public String getTaldeIzena() {
		return TaldeIzena;
	}

	/**
	 * @param taldeIzena the taldeIzena to set
	 */
	public void setTaldeIzena(String taldeIzena) {
		TaldeIzena = taldeIzena;
	}

	/**
	 * @return the puntoak
	 */
	public int getPuntoak() {
		return puntoak;
	}

	/**
	 * @param puntoak the puntoak to set
	 */
	public void setPuntoak(int puntoak) {
		this.puntoak = puntoak;
		//puntoak=0;
	}

	/**
	 * @return the sailkapenPosizioa
	 */
	public String getSailkapenPosizioa() {
		return sailkapenPosizioa;
	}

	/**
	 * @param sailkapenPosizioa the sailkapenPosizioa to set
	 */
	public void setSailkapenPosizioa(String sailkapenPosizioa) {
		this.sailkapenPosizioa = sailkapenPosizioa;
	}

	/**
	 * @return the taldeJokalariak
	 */
	public ArrayList<Jokalaria> getTaldeJokalariak() {
		return taldeJokalariak;
	}

	/**
	 * @param taldeJokalariak the taldeJokalariak to set
	 */
	public void setTaldeJokalariak(ArrayList<Jokalaria> taldeJokalariak) {
		this.taldeJokalariak = taldeJokalariak;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(TaldeIzena, puntoak, sailkapenPosizioa, taldeJokalariak, taldeaID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Taldeak other = (Taldeak) obj;
		return Objects.equals(TaldeIzena, other.TaldeIzena) && Objects.equals(puntoak, other.puntoak)
				&& Objects.equals(sailkapenPosizioa, other.sailkapenPosizioa)
				&& Objects.equals(taldeJokalariak, other.taldeJokalariak) && taldeaID == other.taldeaID;
	}

	@Override
	public String toString() {
		return "Taldeak [taldeaID=" + taldeaID + ", TaldeIzena=" + TaldeIzena + ", puntoak=" + puntoak
				+ ", sailkapenPosizioa=" + sailkapenPosizioa + ", taldeJokalariak=" + taldeJokalariak + "]";
	}

	@Override
	public int compareTo(Taldeak o) {
		// TODO Auto-generated method stub
		//return Integer.compare(o.getPuntoak(), this.getPuntoak());
		
		if (this.puntoak> o.puntoak) {
			return 1;
		}else if (this.puntoak<o.puntoak) {
			return -1;
		}else {
			return 0;
		}
	}
	
	

	
	
	
}