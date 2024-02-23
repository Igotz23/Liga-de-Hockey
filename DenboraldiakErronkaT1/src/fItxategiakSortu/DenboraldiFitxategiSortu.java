package fItxategiakSortu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import T1ERRONKA.Denboraldia;
import T1ERRONKA.Partidoa;
/**
 * Denboraldi objetuak sortzen dira eta Denboraldi.dat -ean gehitzen da
 */
@SuppressWarnings("unused")
public class DenboraldiFitxategiSortu {
	
	
	
	 /**
	 * Denboraldia List esto lo usaba al principio 
	 * se puede seguir usando pero para que sobre escriba cuanfo le doy al boton sartu en denboraldia
	 * se usara el metodo de utils llamado "gordeDenboraldiaList" esta explicado su funcionalidad en el utils
	 */
	public static List<Denboraldia> DenboraldiaList;
	 /**
	 * ArrayLisr de denboraldia deklarado
	 */
	public static ArrayList<Denboraldia> denboraldiaList = new ArrayList<Denboraldia>();
	 
	@SuppressWarnings("javadoc")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Denboraldia d1 = new Denboraldia(24, "2023-24", "01/08/2023", "01/05/2024", false);
		Denboraldia d2 = new Denboraldia(25, "2024-25", "01/08/2024", "01/05/2025", false);
		Denboraldia d3 = new Denboraldia(26, "2025-26", "01/08/2025", "01/05/2026", false);
		denboraldiaList.add(d1);
		denboraldiaList.add(d2);
		denboraldiaList.add(d3);
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		
		
		try {
			 fos = new FileOutputStream("Denboraldiak.dat");
			 oos = new ObjectOutputStream(fos);
			
//			oos.writeObject(d1);
//			oos.writeObject(d2);
//			oos.writeObject(d3);
			    for (Denboraldia d : denboraldiaList) {
	                oos.writeObject(d);
	            }

			
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


