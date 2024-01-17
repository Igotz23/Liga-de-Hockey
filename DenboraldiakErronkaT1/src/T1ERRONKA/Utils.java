package T1ERRONKA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Utils {

////////////////////////metodo para que lee el fichero Taldeak.dat y lo añada al array de TaldeakLISt ///////////////////////////////
	public static ArrayList<Taldeak> IrakurriTaldeakFitx(){
		List<Taldeak> taldeakList  = new ArrayList<Taldeak>();
		
		//irakurri fitxategitik eta listan sartu
		FileInputStream fis;
		ObjectInputStream ois;
		  
		try {
			fis=new FileInputStream ("Taldeak.dat");
			ois=new ObjectInputStream (fis);
			//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
			while (fis.available()>0) {
				Taldeak taldeaNHL=(Taldeak)ois.readObject();
				taldeakList.add(taldeaNHL);
				//System.out.println(taldeaNHL.toString());
			}
			 
			ois.close();
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return (ArrayList<Taldeak>) taldeakList;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////Jornadas Aleatorias///////////////////////////////////////////////////////////////////////////////
	public  static int[] jaurdunaldiLehenengo(int luzeera) {
        // Crear un array de 8 posiciones
        int[] array = new int[luzeera];

        // Crear un conjunto para asegurarse de que no hay repeticiones
        Set<Integer> numerosUtilizados = new HashSet<>();

        // Crear un generador de números aleatorios
        Random random = new Random();

        // Llenar el array con números aleatorios del 0 al (luzeera-1) sin repetir
        for (int i = 0; i < luzeera; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = random.nextInt(luzeera); // Genera números del 0 al (luzeera-1)
            } while (numerosUtilizados.contains(numeroAleatorio));

            // Agregar el número al conjunto para evitar repeticiones
            numerosUtilizados.add(numeroAleatorio);

            // Asignar el número al array
            array[i] = numeroAleatorio;
        }
        
        return array;
    }
}

