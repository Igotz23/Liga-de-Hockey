package fItxategiakSortu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import T1ERRONKA.Taldeak;

/**
 * Taldeak fitxategiak sortzeko 
 */
public class TaldeFitxategiSortu {
	
	 @SuppressWarnings({ "javadoc", "unused" })
	private static List<Taldeak> taldeakList;
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taldeak carolinaHurricanes = new Taldeak(1,"Carolina Hurricanes",0,null,null);
	    Taldeak columbusBlueJackets = new Taldeak(2,"Columbus Blue Jackets",0,null,null);
		Taldeak newJerseyDevils = new Taldeak(3,"New Jersey Devils",0,null,null);
		Taldeak newYorkIslanders = new Taldeak(4,"New York Islanders",0,null,null);
		Taldeak newYorkRangers = new Taldeak(5,"New York Rangers",0,null,null);
		Taldeak philadelphiaFlyers = new Taldeak(6,"Philadelphia Flyers",0,null,null);
		Taldeak pittsburghPenguins = new Taldeak(7,"Pittsburgh Penguins",0,null,null);
		Taldeak washingtonCapitals = new Taldeak(8,"Washington Capitals",0,null,null);

		
		
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		
		
		try {
			 fos = new FileOutputStream("Taldeak.dat");
			 oos = new ObjectOutputStream(fos);
			
			oos.writeObject(carolinaHurricanes);
			oos.writeObject(columbusBlueJackets);
			oos.writeObject(newJerseyDevils);
			oos.writeObject(newYorkIslanders);
			oos.writeObject(newYorkRangers);
			oos.writeObject(philadelphiaFlyers);
			oos.writeObject(pittsburghPenguins);
			oos.writeObject(washingtonCapitals);
			
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		
	}




	}


