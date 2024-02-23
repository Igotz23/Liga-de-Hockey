package T1ERRONKA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/*
 * Jokalariak Sortzerakoan balioko dit
 * */
public class Jokalaria implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String izena;
	private String abizena;
	Taldeak taldeak;
	
	
	public Jokalaria() {}
	
	public Jokalaria(String izena, String abizena, Taldeak taldea) {
		super();
		this.izena = izena;
		this.abizena = abizena;
		this.taldeak=taldea;
	}

	/**
	 * @return the izena
	 */
	public String getIzena() {
		return izena;
	}

	/**
	 * @param izena the izena to set
	 */
	public void setIzena(String izena) {
		this.izena = izena;
	}

	/**
	 * @return the abizena
	 */
	public String getAbizena() {
		return abizena;
	}

	/**
	 * @param abizena the abizena to set
	 */
	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	/**
	 * @return the taldeak
	 */
	public Taldeak getTaldeak() {
		return taldeak;
	}

	/**
	 * @param taldeak the taldeak to set
	 */
	public void setTaldeak(Taldeak taldeak) {
		this.taldeak = taldeak;
	}

	@Override
	public String toString() {
		return abizena + ", "+ izena ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(abizena, izena, taldeak);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jokalaria other = (Jokalaria) obj;
		return Objects.equals(abizena, other.abizena) && Objects.equals(izena, other.izena)
				&& Objects.equals(taldeak, other.taldeak);
	}



}
