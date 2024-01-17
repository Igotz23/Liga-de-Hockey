package T1ERRONKA;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TaldeFitxategiSortu {
	
	 private static List<Taldeak> taldeakList;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taldeak carolinaHurricanes = new Taldeak("Carolina Hurricanes",null,null,null);
	    Taldeak columbusBlueJackets = new Taldeak("Columbus Blue Jackets",null,null,null);
		Taldeak newJerseyDevils = new Taldeak("New Jersey Devils",null,null,null);
		Taldeak newYorkIslanders = new Taldeak("New York Islanders",null,null,null);
		Taldeak newYorkRangers = new Taldeak("New York Rangers",null,null,null);
		Taldeak philadelphiaFlyers = new Taldeak("Philadelphia Flyers",null,null,null);
		Taldeak pittsburghPenguins = new Taldeak("Pittsburgh Penguins",null,null,null);
		Taldeak washingtonCapitals = new Taldeak("Washington Capitals",null,null,null);

		
		
		
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


