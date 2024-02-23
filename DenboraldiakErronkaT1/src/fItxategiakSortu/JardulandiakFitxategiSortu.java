package fItxategiakSortu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import T1ERRONKA.Jardunaldia;
import T1ERRONKA.Taldeak;
import T1ERRONKA.Utils;

@SuppressWarnings("javadoc")
public class JardulandiakFitxategiSortu {
	
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<Taldeak> taldeakList = Utils.IrakurriTaldeakFitx();
		
		ArrayList<Jardunaldia> lista = Utils.generarJornadas(taldeakList,"2024-25");
		
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		
		
		try {
			 fos = new FileOutputStream("Jardunaldiak2024-25.dat");
			 oos = new ObjectOutputStream(fos);
			 
			 for (int i = 0; i < lista.size(); i++) {
				oos.writeObject(lista.get(i));
			}
			
//			oos.writeObject(carolinaHurricanes);
//			oos.writeObject(columbusBlueJackets);
//			oos.writeObject(newJerseyDevils);
//			oos.writeObject(newYorkIslanders);
//			oos.writeObject(newYorkRangers);
//			oos.writeObject(philadelphiaFlyers);
//			oos.writeObject(pittsburghPenguins);
//			oos.writeObject(washingtonCapitals);
			
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


