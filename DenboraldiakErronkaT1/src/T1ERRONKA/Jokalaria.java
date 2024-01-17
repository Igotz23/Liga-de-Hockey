package T1ERRONKA;

import java.util.Objects;

public class Jokalaria {
	
	private String izena;
	private String abizena;
	
	
	public Jokalaria() {}
	
	public Jokalaria(String izena, String abizena) {
		super();
		this.izena = izena;
		this.abizena = abizena;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	@Override
	public int hashCode() {
		return Objects.hash(abizena, izena);
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
		return Objects.equals(abizena, other.abizena) && Objects.equals(izena, other.izena);
	}

	@Override
	public String toString() {
		return abizena + ", " + izena;
	}
	
	

}
