package T1ERRONKA;

import javax.swing.JPanel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import fItxategiakSortu.SailkapenaPDFsortu;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;


/*
 * Sailkapena Panel-aren elementu guztiak hemen ditugu
 */
@SuppressWarnings({ "unused", "javadoc" })





public class SailkapenaPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	//private DefaultListModel<String> dlmIzena;
	public JTable table;
	private SailkapenaPanel SP;
	private JardunaldiaPanel JP;
	private denboraldiaPanel DP;
	private JokalariaPanel JKP;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("serial")
	public SailkapenaPanel(String denboraldia) {
		
			
			
			
			
			
				
		
		
		setLayout(null);
		
		JPanel spanel = new JPanel();
		spanel.setBounds(0, 5, 700, 600);
		add(spanel);
		spanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 680, 57);
		spanel.add(panel);
		
		JLabel lblSailkapena = new JLabel("Sailkapena\r\n");
		panel.add(lblSailkapena);
		setVisible(true);
		
		table = new JTable();
		table.setBounds(0, 0, 414, 137);
		//panel_taula.add(table);
		
		/*
		 * hasierako datuak lortzeko Taldeak eta denboraldia fitxeroak irakutzen ditu Utils daukadan metodoaren bitartez
		 */
		
		/// Kargatu taldeak list fitxategitik
		ArrayList<Taldeak> taldeakList = Utils.IrakurriTaldeakFitx();		
				
		/*        PUNTOAK EMAN               */
     	/// Kargatu jarnudaldaik list fitxategitik
     	ArrayList<Jardunaldia> jardunaldiaList = Utils.IrakurriJardunaldiaDenboraldiaFitx(denboraldia);
     	
     	/// Kargatu taldeak list fitxategitik
     	
     	/*--------------------         FUNTZIONALITATEA         -----------------*/
     
     	/*
     	 * Jardunaldiei puntoak emateko  era honetan egin dut:
     	 * 
     	 */
     	// jardunaldiakList errekorritu
     	for (Jardunaldia j : jardunaldiaList) {
     		//Jardunaldi bakoitzeko partidoa  errekorritu 
     	    for (Partidoa p : j.partidoaList) {
     	    	//baldintzak ipini etxekoTalde emaitza  kanpokoemaitza baino handiagoa bada  
     	        if (p.getEtxekoemaitza() > p.getKanpokoEmaitza()) {
     	            for (Taldeak t : taldeakList) {
     	                if (t.getTaldeIzena().equals(p.getEtxekoTaldea())) {
     	                    t.setPuntoak(t.getPuntoak() + 3);
     	                }
     	            }
     	            
     	         //baldintzak berdina al reves
     	        } else if (p.getEtxekoemaitza() < p.getKanpokoEmaitza()) {
     	            for (Taldeak t : taldeakList) {
     	                if (t.getTaldeIzena().equals(p.getKanpokoTaldea())) {
     	                    t.setPuntoak(t.getPuntoak() + 3);
     	                }
     	            }
     	        } else {
     	            // Enpatatzen badute ez heman punto inori.
     	        }
     	    }
     	}

		/*---------------------------------------*/
		
   
		
     	/*
		 * taldeakList ordenatu puntoen arabera
		 */
     	
		// n taldeakList-en tamaña da		
     	int n = taldeakList.size();
     	
     	//n  errekoritu
     	for (int i = 0; i < n - 1; i++) {
     	    for (int j = 0; j < n - i - 1; j++) {
     	    	//TaldeakActual j-ren posizioa hartzen du
     	        Taldeak taldeaActual = taldeakList.get(j);
     	        //TaldeaSiguiente j+1-ren posizioa hartzen du
     	        Taldeak taldeaSiguiente = taldeakList.get(j + 1);
     	        
     	        
     	        if (taldeaActual.getPuntoak() < taldeaSiguiente.getPuntoak()) {
     	            // aldatu talden posizioa TaldeActual Taldesiguiente baino punto baino gehiago baditu
     	            taldeakList.set(j, taldeaSiguiente);
     	            taldeakList.set(j + 1, taldeaActual);
     	        }
     	    }
     	}	
     	
     
		
     	//Tablaren datuak betetzeko Utils dagoen metodo bat erabiltzen dut 
		Object[][] hasierakoDatuak= Utils.arrayListObjectArrayBihurtu(taldeakList,"Taldeak");
		
		//zutaben izenak
		Object[] zutabeizena = {"Sailkapena","izena","puntoak" }; 
		
		//lehenengo 3 Talden bariableak sortu ditut posizioarekin 
		Taldeak lider = taldeakList.get(0);
		Taldeak segundo = taldeakList.get(1);
		Taldeak tercero = taldeakList.get(2);
		

	
		//Tablaren modeloa definitu eta datuak sarty 
		DefaultTableModel model = new DefaultTableModel(hasierakoDatuak, zutabeizena) {
		    
			//Guzti hau bakarrik balio du  lehenengoa posiziko taldea colore verdea izateko eta 2  eta 3 posizioko taldeak colore urdina
			@Override
		    public Class<?> getColumnClass(int columnIndex) {
		        // Asegúrate de que la columna de puntos sea tratada como números para la comparación
		        return columnIndex == 2 ? Integer.class : super.getColumnClass(columnIndex);
		    }

		    @Override
		    public boolean isCellEditable(int row, int column) {
		        // Deshabilita la edición de celdas
		        return false;
		    }
		};

		// Setear un Renderizador personalizado para cambiar el color del fondo
		table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

		        // Comprobar si la fila actual corresponde al equipo líder
		        if (taldeakList.get(row).equals(lider)) {
		            c.setBackground(Color.green); // Cambiar el color de fondo para el líder (puedes usar cualquier color que prefieras)
		        } else if(taldeakList.get(row).equals(segundo)||taldeakList.get(row).equals(tercero)) {
		        	c.setBackground(Color.cyan);
				} else {
		            c.setBackground(table.getBackground());
		        }

		        return c;
		    }
		});
		/*---------------------------------------*/
		
		
		
		
		/*--------------------          FIN FUNTZIONALITATEA         -----------------*/
        // setratu Jtablearen modeloa
        table.setModel(model);
     // Sortu JScrollPane bat JTable-rentzat eta gehitu taula
     	JScrollPane panel_taula = new JScrollPane(table);
     	panel_taula.setBounds(10, 83, 680, 250);
     	spanel.add(panel_taula);
     	
     	JPanel panel_1 = new JPanel();
     	panel_1.setBounds(10, 333, 680, 109);
     	spanel.add(panel_1);
     	panel_1.setLayout(null);
     	
     	JButton btnJardunaldiak = new JButton("Jardunaldiak\r\n");
     	
     	btnJardunaldiak.setBounds(10, 10, 124, 21);
     	panel_1.add(btnJardunaldiak);
     	
     	JButton btnDenboraldiak = new JButton("Denboraldiak");
     	
     	btnDenboraldiak.setBounds(144, 10, 124, 21);
     	panel_1.add(btnDenboraldiak);
     	
     	JButton btnJokalariak = new JButton("Jokalariak");
     	
     	btnJokalariak.setBounds(278, 10, 124, 21);
     	panel_1.add(btnJokalariak);
     	
     		/*----------				BOTONES				------------*/
     	btnDenboraldiak.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     			//enseñar panel
     			DP = new denboraldiaPanel();
    			DP.setSize(700,600);
    			DP.setLocation(0, 0);
     			Dashboard.ShowPanel(DP);
     		}
     	});
     	
     	btnJardunaldiak.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     			//enseñar panel
     			JP = new JardunaldiaPanel(denboraldia);
    			JP.setSize(700,600);
    			JP.setLocation(0, 0);
     			Dashboard.ShowPanel(JP);
     		}
     	});
     	
     	
     	btnJokalariak.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     			JKP = new JokalariaPanel (denboraldia);
    			JKP.setSize(700,600);
    			JKP.setLocation(0, 0);
     			Dashboard.ShowPanel(JKP);
     			
     		}
     	});
     	
     	
     	
     	/*----------				FIN BOTONES				------------*/
     	
     	
     

	}
	
	/*----------				METODOS				------------*/
	
	public void pdfsortu(String denboraldia) {
        // Tu código existente aquí

        // Recopilar los datos de la tabla
        ArrayList<String[]> sailkapenaData = new ArrayList<>();
        for (int i = 0; i < table.getRowCount(); i++) {
            String[] row = new String[3];
            row[0] = table.getValueAt(i, 0).toString(); // Sailkapena
            row[1] = table.getValueAt(i, 1).toString(); // Izena
            row[2] = table.getValueAt(i, 2).toString(); // Puntoak
            sailkapenaData.add(row);
        }

        // Llamar al método para exportar a PDF
        SailkapenaPDFsortu.exportToPDF(sailkapenaData, "sailkapena.pdf");
    }
	
	/*----------				FIN METODOS				------------*/
	

}
