package T1ERRONKA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Jardunaldia klase honetan deklaratuta dago erabili behar dugun guztia, getters setters konstruktorea...
 */
	public class Jardunaldia implements Serializable {
		
	/**
		 *  generated serial version
		 */
		private static final long serialVersionUID = -2456671123703274816L;
	/**
		 *  Jardunaldiaren identifikatzailea
		 */
		
	private int id;	
	/**
	 * Jardunaldiaren zenbakia
	 */
	private int jardunaldiaZbk;
	/**
	 * Denboraldiaren zenbakia
	 */
	private String denboraldia;
	
	@SuppressWarnings("javadoc")
	ArrayList<Partidoa> partidoaList = new ArrayList<Partidoa>();
	@SuppressWarnings("javadoc")
	public List<Partidoa> partidoak;
	
	/**
	 * Jardunaldietarko konstruktorea
	 */
	public Jardunaldia() {	}

	/**
	 * @param id
	 * @param jardunaldiaZbk
	 * @param partidoaList
	 * @param denboraldia
	 */
	public Jardunaldia(int id, int jardunaldiaZbk, ArrayList<Partidoa> partidoaList, String denboraldia) {
		super();
		this.id = id;
		this.jardunaldiaZbk = jardunaldiaZbk;
		this.partidoaList = partidoaList;
		this.denboraldia= denboraldia;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the jardunaldiaZbk
	 */
	public int getJardunaldiaZbk() {
		return jardunaldiaZbk;
	}

	/**
	 * @param jardunaldiaZbk the jardunaldiaZbk to set
	 */
	public void setJardunaldiaZbk(int jardunaldiaZbk) {
		this.jardunaldiaZbk = jardunaldiaZbk;
	}

	/**
	 * @return the partidoaList
	 */
	public ArrayList<Partidoa> getPartidoaList() {
		return partidoaList;
	}

	/**
	 * @param partidoaList the partidoaList to set
	 */
	public void setPartidoaList(ArrayList<Partidoa> partidoaList) {
		this.partidoaList = partidoaList;
	}


	/**
	 * @return the denboraldia
	 */
	public String getDenboraldia() {
		return denboraldia;
	}

	/**
	 * @param denboraldia the denboraldia to set
	 */
	public void setDenboraldia(String denboraldia) {
		this.denboraldia = denboraldia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, jardunaldiaZbk, partidoaList);
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jardunaldia other = (Jardunaldia) obj;
		return id == other.id && jardunaldiaZbk == other.jardunaldiaZbk
				&& Objects.equals(partidoaList, other.partidoaList);
	}

	@Override
	public String toString() {
		return "Jardunaldia [id=" + id + ", jardunaldiaZbk=" + jardunaldiaZbk + ", partidoaList=" + partidoaList + "]";
	}

	
	

	
	/*
	 * Jardunaldia metodo hau oraindik ez dut ezertarako erabili baina jardunaldi zenbakia eta jardunaldi data ipintzeko balioko dit
	 * */
	
}