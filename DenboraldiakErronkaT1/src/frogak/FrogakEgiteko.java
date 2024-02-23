package frogak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import T1ERRONKA.Jardunaldia;
import T1ERRONKA.Partidoa;
import T1ERRONKA.Taldeak;
import T1ERRONKA.Utils;
import fItxategiakSortu.JardulandiakFitxategiSortu;

/**
 * Frogak egiteko horrialdea da hau metodoei deitzeko...
 */
public class FrogakEgiteko {


	public static void main(String[] args) {
		
	ArrayList<Jardunaldia> lista= Utils.IrakurriJardunaldiaDenboraldiaFitx("2023-24");
		// TODO Auto-generated method stub
		
		ArrayList<Taldeak> taldeakList = Utils.IrakurriTaldeakFitx();
////		
//		ArrayList<Jardunaldia> lista = Utils.generarJornadas(taldeakList);
//		
//		for (Jardunaldia jardunaldia : lista) {
//			System.out.println();
//			System.out.println("-----------------------------------");
//			System.out.println("J"+jardunaldia.getJardunaldiaZbk() + "[" + jardunaldia.getDenboraldia() +"]");
//			System.out.println("-----------------------------------");
//			for (Partidoa p : jardunaldia.getPartidoaList()) {
//				System.out.println(p.getIdEtxekoTaldea() +"."+p.getEtxekoTaldea()+" "
//				+ p.getEtxekoemaitza() + " "
//				+" vs "
//				+ p.getIdKanpokoTaldea()+"." +p.getKanpokoTaldea()+" "
//				+ p.getKanpokoEmaitza() + " ");
//			}
//		}
		
		for (Taldeak taldeak : taldeakList) {
			System.out.println(taldeak.toString());
			
		}
		
//		System.out.println("kaixo");
//		
//		  
//		
//	}
//	
//	 public static  ArrayList<Jardunaldia>  generarJornadas(ArrayList<Taldeak> taldeakList) {
//	    	ArrayList<Jardunaldia> jardunaldiak = new ArrayList<>();
//
//	        // Mezclar aleatoriamente los equipos
//	        Collections.shuffle(taldeakList);
//
//	        // Generar las primeras 7 jornadas de ida
//	        for (int i = 1; i <= 7; i++) {
//	        	ArrayList<Partidoa> partidoak = generarPartidoak(taldeakList);
//	            Jardunaldia j = new Jardunaldia(i, i, partidoak);
//	            		//(i, "Jornada " + i + " (Ida)", partidoak);
//	            jardunaldiak.add(j);
//	        }
//
//	        // Copiar las jornadas de ida y cambiar equipos de casa por fuera para las jornadas de vuelta
//	        for (int i = 8; i <= 14; i++) {
//	            Jardunaldia jardunaldiaIda = jardunaldiak.get(i - 8);
//	            ArrayList<Partidoa> partidoakVuelta = intercambiarEquipos(jardunaldiaIda.getPartidoaList());
//	            Jardunaldia jardunaldiaVuelta = new Jardunaldia(i, i , partidoakVuelta);
//	            jardunaldiak.add(jardunaldiaVuelta);
//	        }
//
//	        return jardunaldiak;
//	    }
//
//	    private static ArrayList<Partidoa> generarPartidoak(ArrayList<Taldeak> taldeakList) {
//	        List<Partidoa> partidoak = new ArrayList<>();
//	        List<Taldeak> copiaEquipos = new ArrayList<>(taldeakList);
//	        Collections.shuffle(copiaEquipos);
//
//	        for (int i = 0; i < 8; i += 2) {
//	            Partidoa partido = new Partidoa(
//	            		copiaEquipos.get(i).getTaldeaID(), copiaEquipos.get(i).getTaldeIzena(), 
//	            		copiaEquipos.get(i + 1).getTaldeaID(),copiaEquipos.get(i + 1).getTaldeIzena());
//	            partidoak.add(partido);
//	        }
//
//	        ArrayList<Partidoa> itzulera = new ArrayList<>(partidoak);
//	        return itzulera;
//	    }
//
//	    private static ArrayList<Partidoa> intercambiarEquipos(List<Partidoa> partidoak) {
//	        List<Partidoa> partidoakVuelta = new ArrayList<>();
//
//	        for (Partidoa partido : partidoak) {
//	            Partidoa partidoVuelta = new Partidoa(partido.getIdKanpokoTaldea(),partido.getKanpokoTaldea(),
//	            		partido.getIdEtxekoTaldea(),partido.getKanpokoTaldea());
//	            partidoakVuelta.add(partidoVuelta);
//	        }
//
//	        ArrayList<Partidoa> itzulera = new ArrayList<>(partidoakVuelta);
//	        return itzulera;
	    }

}
