package T1ERRONKA;

import java.io.Serializable;
import java.util.Objects;
/*
 * partidoetarako balioko digu
 */
@SuppressWarnings("javadoc")
public class Partidoa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8482213710866846802L;
	private int etxekoemaitza;
	private int idEtxekoTaldea;
	private String etxekoTaldea;
	
	private int kanpokoEmaitza;
	private int idKanpokoTaldea;
	private String kanpokoTaldea;
	
	public Partidoa() {}
	

	

	/**
	 * @param etxekoemaitza
	 * @param idEtxekoTaldea
	 * @param kanpokoEmaitza
	 * @param idKanpokoTaldea
	 */
	public Partidoa(int etxekoemaitza, int idEtxekoTaldea, int kanpokoEmaitza, int idKanpokoTaldea) {
		super();
		this.etxekoemaitza = etxekoemaitza;
		this.idEtxekoTaldea = idEtxekoTaldea;
		this.kanpokoEmaitza = kanpokoEmaitza;
		this.idKanpokoTaldea = idKanpokoTaldea;
	}


	/**
	 * @param idEtxekoTaldea
	 * @param etxekoTaldea
	 * @param idKanpokoTaldea
	 * @param kanpokoTaldea
	 */
	public Partidoa(int idEtxekoTaldea, String etxekoTaldea, int idKanpokoTaldea, String kanpokoTaldea) {
		super();
		this.idEtxekoTaldea = idEtxekoTaldea;
		this.etxekoTaldea = etxekoTaldea;
		this.idKanpokoTaldea = idKanpokoTaldea;
		this.kanpokoTaldea = kanpokoTaldea;
	}
	
	

	/**
	 * @return the idEtxekoTaldea
	 */
	public int getIdEtxekoTaldea() {
		return idEtxekoTaldea;
	}




	/**
	 * @param idEtxekoTaldea the idEtxekoTaldea to set
	 */
	public void setIdEtxekoTaldea(int idEtxekoTaldea) {
		this.idEtxekoTaldea = idEtxekoTaldea;
	}




	/**
	 * @return the idKanpokoTaldea
	 */
	public int getIdKanpokoTaldea() {
		return idKanpokoTaldea;
	}




	/**
	 * @param idKanpokoTaldea the idKanpokoTaldea to set
	 */
	public void setIdKanpokoTaldea(int idKanpokoTaldea) {
		this.idKanpokoTaldea = idKanpokoTaldea;
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

