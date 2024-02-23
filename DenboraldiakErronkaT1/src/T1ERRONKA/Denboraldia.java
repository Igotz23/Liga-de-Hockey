package T1ERRONKA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Denboraldi klase honetan deklaratuta dago erabili behar dugun guztia, getters setters konstruktorea...
 */
@SuppressWarnings("unused")
public class Denboraldia implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 4485460690633828303L;
	@SuppressWarnings("javadoc")
	private int denboraldiaId;
	/**
	 * 
	 */
	private String denboraldiaIzena;
	/**
	 * 
	 */
	private String hasierakoData;
	/**
	 * 
	 */
	private String amaierakoData;
	/**
	 * 
	 */
	private boolean irekia;
	/**
	 * 
	 */
	private static List<Taldeak> taldeakList;
	/**
	 * 
	 */
	private static List<Jardunaldia> jardunaldiaList;
	
	
	@SuppressWarnings("javadoc")
	public Denboraldia(int denboraldiaId, String denboraldiaIzena, String hasierakoData, String amaierakoData, boolean irekia) {
		super();
		this.denboraldiaId = denboraldiaId;
		this.denboraldiaIzena = denboraldiaIzena;
		this.hasierakoData = hasierakoData;
		this.amaierakoData = amaierakoData;
		this.irekia=irekia;	
	}


	@Override
	public String toString() {
	return "Denboraldia [denboraldiaId=" + denboraldiaId + ", denboraldiaIzena=" + denboraldiaIzena + ", hasierakoData="
			+ hasierakoData + ", amaierakoData=" + amaierakoData + "]";
	}


	@SuppressWarnings("javadoc")
	public int getDenboraldiaId() {
	return denboraldiaId;
	}
	@SuppressWarnings("javadoc")
	public void setDenboraldiaId(int denboraldiaId) {
	this.denboraldiaId = denboraldiaId;
	}
	@SuppressWarnings("javadoc")
	public String getDenboraldiaIzena() {
	return denboraldiaIzena;
	}
	/**
	 * @param denboraldiaIzena
	 */
	public void setDenboraldiaIzena(String denboraldiaIzena) {
	this.denboraldiaIzena = denboraldiaIzena;
	}
	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public String getHasierakoData() {
	return hasierakoData;
	}
	/**
	 * @param hasierakoData
	 */
	public void setHasierakoData(String hasierakoData) {
	this.hasierakoData = hasierakoData;
	}
	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public String getAmaierakoData() {
	return amaierakoData;
	}
	/**
	 * @param amaierakoData
	 */
	public void setAmaierakoData(String amaierakoData) {
	this.amaierakoData = amaierakoData;
	}
	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public static List<Taldeak> getTaldeakList() {
	return taldeakList;
	}
	/**
	 * @param taldeakList
	 */
	public static void setTaldeakList(List<Taldeak> taldeakList) {
	Denboraldia.taldeakList = taldeakList;
	}
	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public static List<Jardunaldia> getJardunaldiaList() {
	return jardunaldiaList;
	}
	/**
	 * @param jardunaldiaList
	 */
	public static void setJardunaldiaList(List<Jardunaldia> jardunaldiaList) {
	Denboraldia.jardunaldiaList = jardunaldiaList;
	}

	

	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public boolean isIrekia() {
		return irekia;
	}


	/**
	 * @param irekia
	 */
	public void setIrekia(boolean irekia) {
		this.irekia = irekia;
	}


	@Override
	public int hashCode() {
		return Objects.hash(amaierakoData, denboraldiaId, denboraldiaIzena, hasierakoData);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Denboraldia other = (Denboraldia) obj;
		return Objects.equals(amaierakoData, other.amaierakoData) && denboraldiaId == other.denboraldiaId
				&& Objects.equals(denboraldiaIzena, other.denboraldiaIzena)
				&& Objects.equals(hasierakoData, other.hasierakoData);
	}



}
