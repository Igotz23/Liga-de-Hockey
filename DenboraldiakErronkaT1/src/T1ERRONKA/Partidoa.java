package T1ERRONKA;

import java.util.Objects;

public class Partidoa {
	private int etxekoemaitza;
	private int idEtxekoTaldea;
	private String etxekoTaldea;
	
	private int kanpokoEmaitza;
	private int idKanpokoTaldea;
	private String kanpokoTaldea;
	
	public Partidoa() {}
	
	public Partidoa(int etxekoemaitza, String etxekoTaldea, int kanpokoEmaitza, String kanpokoTaldea) {
		super();
		this.etxekoemaitza = etxekoemaitza;
		this.etxekoTaldea = etxekoTaldea;
		this.kanpokoEmaitza = kanpokoEmaitza;
		this.kanpokoTaldea = kanpokoTaldea;
	}

	public int getEtxekoemaitza() {
		return etxekoemaitza;
	}

	public void setEtxekoemaitza(int etxekoemaitza) {
		this.etxekoemaitza = etxekoemaitza;
	}

	public String getEtxekoTaldea() {
		return etxekoTaldea;
	}

	public void setEtxekoTaldea(String etxekoTaldea) {
		this.etxekoTaldea = etxekoTaldea;
	}

	public int getKanpokoEmaitza() {
		return kanpokoEmaitza;
	}

	public void setKanpokoEmaitza(int kanpokoEmaitza) {
		this.kanpokoEmaitza = kanpokoEmaitza;
	}

	public String getKanpokoTaldea() {
		return kanpokoTaldea;
	}

	public void setKanpokoTaldea(String kanpokoTaldea) {
		this.kanpokoTaldea = kanpokoTaldea;
	}

	@Override
	public String toString() {
		return "Jardunaldiak [etxekoemaitza=" + etxekoemaitza + ", etxekoTaldea=" + etxekoTaldea + ", kanpokoEmaitza="
				+ kanpokoEmaitza + ", kanpokoTaldea=" + kanpokoTaldea + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(etxekoTaldea, etxekoemaitza, kanpokoEmaitza, kanpokoTaldea);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partidoa other = (Partidoa) obj;
		return Objects.equals(etxekoTaldea, other.etxekoTaldea) && etxekoemaitza == other.etxekoemaitza
				&& kanpokoEmaitza == other.kanpokoEmaitza && Objects.equals(kanpokoTaldea, other.kanpokoTaldea);
	}

	
	
}

