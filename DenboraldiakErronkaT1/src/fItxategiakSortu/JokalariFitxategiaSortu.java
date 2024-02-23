package fItxategiakSortu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import T1ERRONKA.Jokalaria;
import T1ERRONKA.Taldeak;
import T1ERRONKA.Utils;

/**
 * 
 */
public class JokalariFitxategiaSortu  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Taldeak> taldeakList = Utils.IrakurriTaldeakFitx();
	
		/*
		 * LEHENENGO TALDEA
		 * */
		Jokalaria T1J1 = new Jokalaria("Sebastian", "Aho", taldeakList.get(0));
		Jokalaria T1J2 = new Jokalaria("Andrei", "Svechnikov", taldeakList.get(0));
		Jokalaria T1J3 = new Jokalaria("Teuvo", "Teravainen", taldeakList.get(0));
		Jokalaria T1J4 = new Jokalaria("Dougie", "Hamilton", taldeakList.get(0));
		Jokalaria T1J5 = new Jokalaria("Jordan ", "Staal", taldeakList.get(0));
	
	
		/*
		 * BIGARREN TALDEA
		 * */
		
		
		Jokalaria T2J1 = new Jokalaria("Seth ", "Jones", taldeakList.get(1));
		Jokalaria T2J2 = new Jokalaria("Zach ", "Werenski", taldeakList.get(1));
		Jokalaria T2J3 = new Jokalaria("Cam ", "Atkinson", taldeakList.get(1));
		Jokalaria T2J4 = new Jokalaria("Patrik ", "Laine", taldeakList.get(1));
		Jokalaria T2J5 = new Jokalaria("Boone  ", "Jenner", taldeakList.get(1));
	
		
		/*
		 * HIRUGARREN TALDEA
		 * */
		
		Jokalaria T3J1 = new Jokalaria("Jack", "Hughes", taldeakList.get(2));
		Jokalaria T3J2 = new Jokalaria("Nic", "Hischier", taldeakList.get(2));
		Jokalaria T3J3 = new Jokalaria("Mackenzie", "Blackwood", taldeakList.get(2));
		Jokalaria T3J4 = new Jokalaria("Pavel", "Zacha", taldeakList.get(2));
		Jokalaria T3J5 = new Jokalaria("Jesper", "Bratt", taldeakList.get(2));
		
		
		/*
		 * LAUGARREN TALDEA
		 * */
		
		Jokalaria T4J1 = new Jokalaria("Mathew", "Barzal", taldeakList.get(3));
		Jokalaria T4J2 = new Jokalaria("Anders", "Lee", taldeakList.get(3));
		Jokalaria T4J3 = new Jokalaria("Brock", "Nelson", taldeakList.get(3));
		Jokalaria T4J4 = new Jokalaria("Jean", "Gabriel", taldeakList.get(3));
		Jokalaria T4J5 = new Jokalaria("Ryan", "Pulock", taldeakList.get(3));
		
		/*
		 * BOSTGARREN TALDEA
		 * */
		
		Jokalaria T5J1 = new Jokalaria("Artemi ", "Panarin", taldeakList.get(4));
		Jokalaria T5J2 = new Jokalaria("Mika ", "Zibanejad", taldeakList.get(4));
		Jokalaria T5J3 = new Jokalaria("Alexis ", "Lafrenière", taldeakList.get(4));
		Jokalaria T5J4 = new Jokalaria("Adam ", "Fox", taldeakList.get(4));
		Jokalaria T5J5 = new Jokalaria("Chris ", "Kreider", taldeakList.get(4));
		
		
		/*
		 * SEIGARREN TALDEA
		 * */
		
		Jokalaria T6J1 = new Jokalaria("Claude  ", "Giroux", taldeakList.get(5));
		Jokalaria T6J2 = new Jokalaria("Sean ", "Couturier", taldeakList.get(5));
		Jokalaria T6J3 = new Jokalaria("Ivan  ", "Provorov", taldeakList.get(5));
		Jokalaria T6J4 = new Jokalaria("Travis  ", "Konecny", taldeakList.get(5));
		Jokalaria T6J5 = new Jokalaria("Carter  ", "Hart", taldeakList.get(5));
		
		
		/*
		 * SAZPIARREN TALDEA
		 * */
		
		Jokalaria T7J1 = new Jokalaria("Claude  ", "Giroux", taldeakList.get(6));
		Jokalaria T7J2 = new Jokalaria("Sean ", "Couturier", taldeakList.get(6));
		Jokalaria T7J3 = new Jokalaria("Ivan  ", "Provorov", taldeakList.get(6));
		Jokalaria T7J4 = new Jokalaria("Travis  ", "Konecny", taldeakList.get(6));
		Jokalaria T7J5 = new Jokalaria("Carter  ", "Hart", taldeakList.get(6));
		
		/*
		 * 8 TALDEA
		 * */
		
		Jokalaria T8J1 = new Jokalaria("Alex   ", "Ovechkin", taldeakList.get(7));
		Jokalaria T8J2 = new Jokalaria("Nicklas  ", "Backstrom", taldeakList.get(7));
		Jokalaria T8J3 = new Jokalaria("John   ", "Carlson", taldeakList.get(7));
		Jokalaria T8J4 = new Jokalaria("Evgeny   ", "Kuznetsov", taldeakList.get(7));
		Jokalaria T8J5 = new Jokalaria("Tom   ", "Wilson", taldeakList.get(7));
		
		
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		
		
		try {
			 fos = new FileOutputStream("Jokalariak.dat");
			 oos = new ObjectOutputStream(fos);
			//LEHENENGOTALDEA
			oos.writeObject(T1J1);
			oos.writeObject(T1J2);
			oos.writeObject(T1J3);
			oos.writeObject(T1J4);
			oos.writeObject(T1J5);
			
			//BIGARREN TALDEA
			oos.writeObject(T2J1);
			oos.writeObject(T2J2);
			oos.writeObject(T2J3);
			oos.writeObject(T2J4);
			oos.writeObject(T2J5);
			
			//HIRUGARRENTALDEA
			oos.writeObject(T3J1);
			oos.writeObject(T3J2);
			oos.writeObject(T3J3);
			oos.writeObject(T3J4);
			oos.writeObject(T3J5);
			
			//LAUGARREN TALDEA
			oos.writeObject(T4J1);
			oos.writeObject(T4J2);
			oos.writeObject(T4J3);
			oos.writeObject(T4J4);
			oos.writeObject(T4J5);
			
			//BOSTGARRENTALDEA
			oos.writeObject(T5J1);
			oos.writeObject(T5J2);
			oos.writeObject(T5J3);
			oos.writeObject(T5J4);
			oos.writeObject(T5J5);
			
			//SEIGARREN TALDEA
			oos.writeObject(T6J1);
			oos.writeObject(T6J2);
			oos.writeObject(T6J3);
			oos.writeObject(T6J4);
			oos.writeObject(T6J5);
			
			//ZAZPIGARREN TALDEA
			oos.writeObject(T7J1);
			oos.writeObject(T7J2);
			oos.writeObject(T7J3);
			oos.writeObject(T7J4);
			oos.writeObject(T7J5);
			
			//ZAZPIGARREN TALDEA
			oos.writeObject(T8J1);
			oos.writeObject(T8J2);
			oos.writeObject(T8J3);
			oos.writeObject(T8J4);
			oos.writeObject(T8J5);
			
			
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
