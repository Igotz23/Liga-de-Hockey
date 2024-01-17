package T1ERRONKA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Taldeak implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1471102583088789878L;
	private String TaldeIzena;
	private String puntoak;
	private String sailkapenPosizioa;
	private ArrayList<Jokalaria> taldeJokalariak;
	
	public Taldeak() {	}
	
	
	public Taldeak(String taldeIzena, String puntoak, String sailakapenPosizioa, ArrayList<Jokalaria> taldeJokalariak) {
		super();
		TaldeIzena = taldeIzena;
		this.puntoak = puntoak;
		this.sailkapenPosizioa = sailakapenPosizioa;
		this.taldeJokalariak = taldeJokalariak;
	}


	public String getTaldeIzena() {
		return TaldeIzena;
	}


	public void setTaldeIzena(String taldeIzena) {
		TaldeIzena = taldeIzena;
	}


	public String getPuntoak() {
		return puntoak;
	}


	public void setPuntoak(String puntoak) {
		this.puntoak = puntoak;
	}


	public String getSailakapenPosizioa() {
		return sailkapenPosizioa;
	}


	public void setsailkapenPosizioa(String sailkapenPosizioa) {
		this.sailkapenPosizioa = sailkapenPosizioa;
	}


	public ArrayList<Jokalaria> getTaldeJokalariak() {
		return taldeJokalariak;
	}


	public void setTaldeJokalariak(ArrayList<Jokalaria> taldeJokalariak) {
		this.taldeJokalariak = taldeJokalariak;
	}


	@Override
	public int hashCode() {
		return Objects.hash(TaldeIzena, puntoak, sailkapenPosizioa, taldeJokalariak);
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
				&& Objects.equals(taldeJokalariak, other.taldeJokalariak);
	}


	@Override
	public String toString() {
		return "Taldeak [TaldeIzena=" + TaldeIzena + ", puntoak=" + puntoak + ", sailkapenPosizioa=" + sailkapenPosizioa
				+ ", taldeJokalariak=" + taldeJokalariak + "]";
	}
	
	
	
}