package T1ERRONKA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


@SuppressWarnings("unused")
/**
 * Utils Klasea
 */
public class Utils {

	
	/*----------		METODOS UTILS				------------*/
	public static ArrayList<Jokalaria> JokalariDenboraldiaFitxSortu(String denboraldia){
		
		ArrayList<Jokalaria> jokalariaList = Utils.IrakurriJokalariFitx();
		
		
		
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		
		
		try {
			 fos = new FileOutputStream("Jokalari"+denboraldia+".dat");
			 oos = new ObjectOutputStream(fos);
			 
			 for (int i = 0; i < jokalariaList.size(); i++) {
				oos.writeObject(jokalariaList.get(i));
			}
			 idatziLog("Jokalari denboraldi fitxategia sortu da"); 
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		
		
		return (ArrayList<Jokalaria>) jokalariaList;
	}
	
	/*
	 * Taldeak.dat irakurtzeko metodoa y gero taldeakList-ean gehitzeko 
	 */
	@SuppressWarnings("javadoc")
	public static ArrayList<Jokalaria> IrakurriJokalariFitx(){
		List<Jokalaria> jokalariaList  = new ArrayList<Jokalaria>();
		
		//Deklaratu fis eta ois
		FileInputStream fis;
		ObjectInputStream ois;
		  
		try {
			//Indikatu zein fitxero irakurri nahi duzu
			fis=new FileInputStream ("Jokalariak.dat");
			ois=new ObjectInputStream (fis);
			//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
			while (fis.available()>0) {
				Jokalaria jokalariaNHL=(Jokalaria)ois.readObject();
				jokalariaList.add(jokalariaNHL);
				
			}
			idatziLog("Jokalarien fitxategia irakurri da"); 
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
		
		return (ArrayList<Jokalaria>) jokalariaList;
	}
	
//	@SuppressWarnings("javadoc")
//	public static ArrayList<Jokalaria> IrakurriJokalariDenbFitx(String denboraldia){
//		List<Jokalaria> jokalariaList  = new ArrayList<Jokalaria>();
//		
//		//Deklaratu fis eta ois
//		FileInputStream fis;
//		ObjectInputStream ois;
//		  
//		try {
//			//Indikatu zein fitxero irakurri nahi duzu
//			fis=new FileInputStream ("Jokalaria"+denboraldia+".dat");
//			ois=new ObjectInputStream (fis);
//			//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
//			while (fis.available()>0) {
//				Jokalaria jokalariaNHL=(Jokalaria)ois.readObject();
//				jokalariaList.add(jokalariaNHL);
//				
//			}
//			idatziLog("Jokalarien fitxategia irakurri da"); 
//			ois.close();
//		}catch (FileNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}catch (IOException e) {
//			// TODO: handle exception
//		}catch (ClassNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		return (ArrayList<Jokalaria>) jokalariaList;
//	}
//	
	
	public static void gordeJokalariDenboraldiaList(List<Jokalaria> jokalariaList, String denboraldia) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("jokalaria"+denboraldia+".dat");
			oos = new ObjectOutputStream(fos);
			//oos.writeObject(jardunaldiaList);
			for (Jokalaria j : jokalariaList) {
				oos.writeObject(j);
			}
			idatziLog("Jardunaldien fitxategia gorde da");	
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	/*
	 * Taldeak.dat irakurtzeko metodoa y gero taldeakList-ean gehitzeko 
	 */
	@SuppressWarnings("javadoc")
	public static ArrayList<Taldeak> IrakurriTaldeakFitx(){
		List<Taldeak> taldeakList  = new ArrayList<Taldeak>();
		
		//Deklaratu fis eta ois
		FileInputStream fis;
		ObjectInputStream ois;
		  
		try {
			//Indikatu zein fitxero irakurri nahi duzu
			fis=new FileInputStream ("Taldeak.dat");
			ois=new ObjectInputStream (fis);
			//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
			while (fis.available()>0) {
				Taldeak taldeaNHL=(Taldeak)ois.readObject();
				taldeakList.add(taldeaNHL);
				
			}
			idatziLog("Taldeen fitxategiia irakurri da"); 
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
	
	
	
		/**
		 * Denboraldia.dat Irakurtzeko metodoa
		 * @return 
		 */
		@SuppressWarnings("javadoc")
		public static ArrayList<Denboraldia> IrakurriDenboraldiaFitx() {
		
		 ArrayList<Denboraldia> denboraldiaList = new ArrayList<Denboraldia>();
		
		//irakurri fitxategitik eta listan sartu
		FileInputStream fis;
		ObjectInputStream ois;
		
		try {
			fis=new FileInputStream ("Denboraldiak.dat");
			ois=new ObjectInputStream (fis);
			//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
			while (fis.available()>0) {
					Denboraldia denboraldiaNHL=(Denboraldia)ois.readObject();
					denboraldiaList.add(denboraldiaNHL);
					//System.out.println(taldeaNHL.toString());
			}
			idatziLog("Denboraldien fitxategiia irakurri da"); 
		
			ois.close();
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
	}
	
	return (ArrayList<Denboraldia>) denboraldiaList;
	}
	//irakurri Jardunaldiak.dat (metodo antiguo sin uso)
//		public static ArrayList<Jardunaldia> IrakurriJardunaldiaFitx() {
//			 ArrayList<Jardunaldia> jardunaldiaList = new ArrayList<Jardunaldia>();
//			
//			//irakurri fitxategitik eta listan sartu
//			FileInputStream fis;
//			ObjectInputStream ois;
//			
//			try {
//				fis=new FileInputStream ("Jardunaldiak.dat");
//				ois=new ObjectInputStream (fis);
//				//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
//				while (fis.available()>0) {
//						Jardunaldia jardunaldiaNHL=(Jardunaldia)ois.readObject();
//						jardunaldiaList.add(jardunaldiaNHL);
//						//System.out.println(taldeaNHL.toString());
//				}
//			
//				ois.close();
//			}catch (FileNotFoundException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}catch (IOException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}catch (ClassNotFoundException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//		}
//		
//		return (ArrayList<Jardunaldia>) jardunaldiaList;
//		}
		
		
		
		
		/**
		 * Denboraldi konkretu baten Jardunaldiak sortzeko 
		 * horain ez dut erabiltzen "JardunaldiakFitxategiaSortu.java"
		 * @param jardunaldiak jardunaldien zerrenda
		 * @param denboraldia denboraldiaren izena fitxategian jartzeko
		 * @return sortutako denboraldiaren jardunaldiak itzultzen ditu
		 */
		
		public static ArrayList<Jardunaldia> JardunaldiaDenboraldiaFitxSortu(String denboraldia){
			
			ArrayList<Taldeak> taldeakList = Utils.IrakurriTaldeakFitx();
			
			ArrayList<Jardunaldia> lista = Utils.generarJornadas(taldeakList,denboraldia);
			
			
			FileOutputStream fos;
			ObjectOutputStream oos;
			
			
			
			try {
				 fos = new FileOutputStream("Jardunaldiak"+denboraldia+".dat");
				 oos = new ObjectOutputStream(fos);
				 
				 for (int i = 0; i < lista.size(); i++) {
					oos.writeObject(lista.get(i));
				}
				 idatziLog("Jardunaldien fitxategia sortu da"); 
				oos.close();
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}catch (IOException e) {
				// TODO: handle exception
			e.printStackTrace();
			}
			
			return lista;
		}
		
		/**
		 * Goiko metodoa sortzen duen fitxategiak irakurtzeko
		 * @param denboraldia
		 * @return
		 */
		@SuppressWarnings("javadoc")
		public static ArrayList<Jardunaldia> IrakurriJardunaldiaDenboraldiaFitx(String denboraldia) {
			 ArrayList<Jardunaldia> jardunaldiaList = new ArrayList<Jardunaldia>();
			
			//irakurri fitxategitik eta listan sartu
			FileInputStream fis;
			ObjectInputStream ois;
			
			try {
				fis=new FileInputStream ("Jardunaldiak"+denboraldia+".dat");
				ois=new ObjectInputStream (fis);
				//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
				while (fis.available()>0) {
						Jardunaldia jardunaldiaNHL=(Jardunaldia)ois.readObject();
						jardunaldiaList.add(jardunaldiaNHL);
						//System.out.println(taldeaNHL.toString());
				}
				idatziLog("Jardunaldien fitxategia irakurri da"); 
				ois.close();
			}catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
		}
		
		return (ArrayList<Jardunaldia>) jardunaldiaList;
		}
		
		
		
/**
 * @param jardunaldiaList
 * @param denboraldia
 * Jardunaldiak Gordetzeko botoain erabiltzen dut
 */
//Gorde JardunaldiaDenboraldia List

	public static void gordeJardunaldiaDenboraldiaList(List<Jardunaldia> jardunaldiaList, String denboraldia) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("Jardunaldiak"+denboraldia+".dat");
			oos = new ObjectOutputStream(fos);
			//oos.writeObject(jardunaldiaList);
			for (Jardunaldia j : jardunaldiaList) {
				oos.writeObject(j);
			}
			idatziLog("Jardunaldien fitxategia gorde da");	
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	/**
	 * Gorde Denboraldia botoian erabiltzen dut 
	 * tablan gehitu dudana denboraldiaList-ean gehitu da
	 * Horregatik hau egiten duena denboraldiaList errekorritzen du eta hor dagoena idazten du
	 * @param denboraldiaList
	 */
	//Gorde denboraldia List
	public static void gordeDenboraldiaList(List<Denboraldia> denboraldiaList) {
	FileOutputStream fos;
	ObjectOutputStream oos;
	try {
		 fos = new FileOutputStream("Denboraldiak.dat");
		 oos = new ObjectOutputStream(fos);
		
	
		    for (Denboraldia d : denboraldiaList) {
	           oos.writeObject(d);
	           
	       }
		    
		
		oos.close();
		idatziLog("Denboraldia Listan gorde da");
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}catch (IOException e) {
		// TODO: handle exception
	e.printStackTrace();
	}
	
	}
	
	/**
	 * Jardunaldiak Random eran idazteko xml fitxategi batean
	 * @param taldeakList
	 * @param xmlFilePath
	 */
	//Jornadas Aleatorias en xml
	public static void writeJarduanaldiakRandom(ArrayList<Taldeak> taldeakList, String xmlFilePath) {

		try {

            FileWriter writer = new FileWriter(xmlFilePath);
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<denboraldia>\n");
            int numEquipos = taldeakList.size();
            int mitadEquipos = numEquipos / 2;
            //para barajar automaticament los equipos
            Collections.shuffle(taldeakList);
            for (int jardunaldia = 1; jardunaldia <= numEquipos; jardunaldia++) {
            	writer.write("\t<jardunaldia."+jardunaldia+ ">\n");              
            	for (int j = 0; j < mitadEquipos; j++) {
                    int etxekoTaldea = j;
                    int kanpokoTaldea = numEquipos - 1 - j;                
                    if (j % 2 == 0) {
                        int temp = etxekoTaldea;
                        etxekoTaldea = kanpokoTaldea;
                        kanpokoTaldea = temp;
                        idatziLog("xml fitxategia idatzi da");
                    }                 
	               String etxekoTaldeaIzena = taldeakList.get(etxekoTaldea).getTaldeIzena();
	               String kanpokoTaldeaIzena = taldeakList.get(kanpokoTaldea).getTaldeIzena();
	               writer.write("\t\t<partida id=\"" + (j+1) + "\">\n");
	               writer.write("\t\t\t<taldea>" + etxekoTaldeaIzena + "</taldea>\n");
	               writer.write("\t\t\t<taldea>" + kanpokoTaldeaIzena + "</taldea>\n");
	               writer.write("\t\t</partida>\n");

            	}
            	writer.write("\t</jardunaldia>\n");
            	//cambiar el orden para la siguiente jornada
            	Collections.rotate(taldeakList.subList(1, numEquipos), 1);

            }
            //para que siga haciendo jornadas hasta llegar a 7
            for (int i = 1; i <= numEquipos; i++) {
            	writer.write("\t<jardunaldia."+ (5+i) + ">\n");             
            	for (int j = 0; j < mitadEquipos; j++) {
                    int etxekoTaldea2 = j;
                    int kanpokoTaldea2 = numEquipos - 1 - j;                 
                    if (j % 2 == 0) {
                    	//cambia los valores de 
                        int temp = etxekoTaldea2;
                        etxekoTaldea2 = kanpokoTaldea2;
                        kanpokoTaldea2 = temp;

                    }
                   

	               String etxekoTaldeaIzena = taldeakList.get(etxekoTaldea2).getTaldeIzena();
	               String kanpokoTaldeaIzena = taldeakList.get(kanpokoTaldea2).getTaldeIzena();
	               writer.write("\t\t<partida id=\"" + (j+1) + "\">\n");
	               writer.write("\t\t\t<taldea>" + kanpokoTaldeaIzena + "</taldea>\n");
	               writer.write("\t\t\t<taldea>" + etxekoTaldeaIzena + "</taldea>\n");
	               writer.write("\t\t</partida>\n");
            	}

            writer.write("\t</jardunaldia>\n");
            Collections.rotate(taldeakList.subList(1, numEquipos), 1);
            }   
            writer.write("</denboraldiak>\n");
            writer.close();            

        } catch (IOException e) {

            e.printStackTrace();

        }

    }


	//Jornadas Aleatorias metodo (sin uso ya )
	
//	public static ArrayList<Jardunaldia> JarduanaldiakRandomList(ArrayList<Taldeak> taldeakList) {
//	    int numEquipos = taldeakList.size();
//	    int mitadEquipos = numEquipos / 2;
//	    Collections.shuffle(taldeakList);
//
//	    ArrayList<Jardunaldia> jardunaldiakList = new ArrayList<>();
//
//	    for (int i = 1; i < numEquipos; i++) {
//	        Jardunaldia jardunaldia = new Jardunaldia();
//	        jardunaldia.setId(i);
//	        jardunaldia.setJardunaldiaZbk(i);
//
//	        Taldeak equipoInicial = taldeakList.get(0);
//
//	        for (int j = 1; j <= mitadEquipos; j++) {  // Change loop condition to include the last team
//	            Taldeak rival = taldeakList.get(j);
//
//	            Partidoa partida = new Partidoa(
//	                    equipoInicial.getTaldeaID(),
//	                    equipoInicial.getTaldeIzena(),
//	                    rival.getTaldeaID(),
//	                    rival.getTaldeIzena());
//
//	            jardunaldia.getPartidoaList().add(partida);
//
//	            // Cambiar el equipo inicial para el próximo partido
//	            equipoInicial = rival;
//	        }
//
//	        jardunaldiakList.add(jardunaldia);
//
//	        // Rotar la lista de equipos para la próxima jornada
//	        Collections.rotate(taldeakList.subList(1, taldeakList.size()), 1);
//	    }
//
//	    return jardunaldiakList;
//	}

	
	/////BEERIAK
	
		
    /**
     * Jardunaldiak Sortzen dituen metodoa da gero JardunaldiaDenboraldia fitxategia sortzeko balio du
     * @param taldeakList
     * @param denboraldia
     * @return
     */
    @SuppressWarnings("javadoc")
	public static  ArrayList<Jardunaldia>  generarJornadas(ArrayList<Taldeak> taldeakList, String denboraldia) {
    	ArrayList<Jardunaldia> jardunaldiak = new ArrayList<>();

        // Mezclar aleatoriamente los equipos
        //Collections.shuffle(taldeakList);

        // Generar las primeras 7 jornadas de ida
        for (int i = 1; i <= 7; i++) {
        	ArrayList<Partidoa> partidoak = generarPartidoak(taldeakList);
            Jardunaldia j = new Jardunaldia(i, i, partidoak, denboraldia);
            		//(i, "Jornada " + i + " (Ida)", partidoak);
            jardunaldiak.add(j);
        }

        // Copiar las jornadas de ida y cambiar equipos de casa por fuera para las jornadas de vuelta
        for (int i = 8; i <= 14; i++) {
            Jardunaldia jardunaldiaIda = jardunaldiak.get(i - 8);
            ArrayList<Partidoa> partidoakVuelta = intercambiarEquipos(jardunaldiaIda.getPartidoaList());
            Jardunaldia jardunaldiaVuelta = new Jardunaldia(i, i , partidoakVuelta, denboraldia);
            jardunaldiak.add(jardunaldiaVuelta);
        }

        return jardunaldiak;
    }

    
    /**
     * Partidoak Sortzeko balio du gero Jardunaldiak sortzeko balio zaigu Jardunaldiak sortzeko metodoan erabiltzen dugu
     * @param taldeakList
     * @return
     */
    private static ArrayList<Partidoa> generarPartidoak(ArrayList<Taldeak> taldeakList) {
        List<Partidoa> partidoak = new ArrayList<>();
        List<Taldeak> copiaEquipos = new ArrayList<>(taldeakList);
        Collections.shuffle(copiaEquipos);

        for (int i = 0; i < 8; i += 2) {
            Partidoa partido = new Partidoa(
            		copiaEquipos.get(i).getTaldeaID(), copiaEquipos.get(i).getTaldeIzena(), 
            		copiaEquipos.get(i + 1).getTaldeaID(),copiaEquipos.get(i + 1).getTaldeIzena());
            partidoak.add(partido);
        }

        ArrayList<Partidoa> itzulera = new ArrayList<>(partidoak);
        return itzulera;
    }

    /**
     * bueltako partidoak sortzeko balio du.
     * @param partidoak
     * @return
     */
    private static ArrayList<Partidoa> intercambiarEquipos(List<Partidoa> partidoak) {
        List<Partidoa> partidoakVuelta = new ArrayList<>();

        for (Partidoa partido : partidoak) {
            Partidoa partidoVuelta = new Partidoa(partido.getIdKanpokoTaldea(),partido.getKanpokoTaldea(),
            		partido.getIdEtxekoTaldea(),partido.getEtxekoTaldea());
            partidoakVuelta.add(partidoVuelta);
        }

        ArrayList<Partidoa> itzulera = new ArrayList<>(partidoakVuelta);
        return itzulera;
    }

    
    //////////////////////////Gorde Jardunaldia List///////////////////////////////
//    public static void gordeJardunaldiaList(List<Jardunaldia> jardunaldiaList) {
//    	FileOutputStream fos;
//		ObjectOutputStream oos;
//    	try {
//    		fos = new FileOutputStream("Jardunaldiak.dat");
//    		oos = new ObjectOutputStream(fos);
//    		//oos.writeObject(jardunaldiaList);
//    		for (Jardunaldia j : jardunaldiaList) {
//				oos.writeObject(j);
//			}
//           
//        } catch (IOException e) {
//            
//        }
//    }
    
  

	
	
    
    /**
     * Listan gehitzeko gauzak
     * @param <E>
     * @param list
     * @param objetuMota
     * @return
     */
    @SuppressWarnings("javadoc")
	public static <E> Object[][] arrayListObjectArrayBihurtu (ArrayList<E> list, String objetuMota) {
		
		Object[][] itzulera = null;
		if(objetuMota=="Denboraldia") {
			itzulera = new Object[list.size()][4];
			for (int i = 0; i < list.size(); i++) {
				Denboraldia d = (Denboraldia) list.get(i);
				itzulera[i][0]= d.getDenboraldiaIzena();
				itzulera[i][1]= d.getHasierakoData();
				itzulera[i][2]= d.getAmaierakoData();
				if(d.isIrekia()) {
					itzulera[i][3]="Bai";
				}else {
					itzulera[i][3]="Ez";
				}
				
				
			}
		} else if(objetuMota=="Taldeak") {
			itzulera = new Object[list.size()][3];
			for (int i = 0; i < list.size(); i++) {
				Taldeak d = (Taldeak) list.get(i);
				itzulera[i][0]= i+1;
				itzulera[i][1]= d.getTaldeIzena();
				itzulera[i][2]= d.getPuntoak();
				
			}
			
		} 
		return itzulera;
	}
    /**
     * @param lerroa
     * log fitxeroa sortzeko eta sortuta dogoenean Lerroa parametroan dagoena idazten du fitxeroan, eta fitxeroa sortuta badago
     */
    public static void idatziLog( String lerroa) {
    	FileWriter fitxategia = null;
    	PrintWriter pw = null;
    	try {
			fitxategia = new FileWriter ("nireLog.log", true);
			pw= new PrintWriter (fitxategia);
			Date d = new Date();
			String data = "[" + d.toString() + "]";
			pw.println(data + " -- "+ lerroa);
			System.out.println(data + " -- "+ lerroa);
			fitxategia.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    	
    	
    }
}

