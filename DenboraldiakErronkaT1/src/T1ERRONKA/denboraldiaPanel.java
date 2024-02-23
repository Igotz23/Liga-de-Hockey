package T1ERRONKA;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import fItxategiakSortu.DenboraldiFitxategiSortu;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

/**
 * 
 */
@SuppressWarnings({ "unused", "serial" })



public class denboraldiaPanel extends JPanel {
	
	/**
	 * table
	 */
	private JTable table;
	/**
	 * Sailkapena Panel
	 */
	private SailkapenaPanel SP;
	/**4
	 * txt
	 */
	private JTextField txtUrtea;
	/**
	 * txt
	 */
	private JTextField txtHasiera;
	/**
	 * txt
	 */
	private JTextField txtAmaiera;
	/**
	 *Jardunaldia Panel
	 */
	private JardunaldiaPanel JP;
	/**
	 * Denboraldia panel
	 */
	private denboraldiaPanel DP;
	/**
	 * Array List Jardunaldia
	 */
	ArrayList<Jardunaldia> jardunaldiaList;
	/**
	 * cBox
	 */
	private JComboBox<?> jolastenCBox;
	/**
	 *  Array List Denboraldia
	 */
	private ArrayList<Denboraldia> denboraldiaList;

	
	
	/**
	 *elementu guztiak hemen daude botoiak, panelak labelak
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public denboraldiaPanel() {
		

		setLayout(null);
		
		JPanel spanel = new JPanel();
		spanel.setBounds(0, 5, 700, 600);
		add(spanel);
		spanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 10, 700, 34);
		spanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblDenboraldia = new JLabel("Denboraldia");
		lblDenboraldia.setBounds(10, 0, 205, 13);
		panel.add(lblDenboraldia);
		
		JButton btnAukeratu = new JButton("Aukeratu");
		
		btnAukeratu.setBounds(10, 536, 204, 21);
		spanel.add(btnAukeratu);
		
		JButton btnGordeFitx = new JButton("Gorde Fitx\r\n");
		
		btnGordeFitx.setBounds(490, 536, 210, 21);
		spanel.add(btnGordeFitx);
		
		table = new JTable();
		table.setBounds(24, -16, 339, 135);
		setVisible(true);
		
		
		JScrollPane panel_taula = new JScrollPane(table);
		panel_taula.setBounds(0, 174, 700, 158);
		spanel.add(panel_taula);
		
		/*
		 * zutabeizena tablaren titulua da
		 * Gero denboraldiList arrayList bat deklaratu dut eta Utils.IrakurriDenboraldiaFitx(); metodoarekin betetzen da.
		 *	hasierakoDatuak Utils.arrayListObjectArrayBihurtu metodoarekin sartu dut. 
		 *  
		  */
		Object[] zutabeizena = {"Urtea","Hasierako Data","Amaierako Data","Jolasten" }; 
		
		/*
		 * hasierakoDatuak Utils metodo batekin betetzen da "Denboraldia" izeneko partearekin 
		 */
		ArrayList<Denboraldia>denboraldiaList =Utils.IrakurriDenboraldiaFitx();
		Object[][] hasierakoDatuak= Utils.arrayListObjectArrayBihurtu(denboraldiaList,"Denboraldia");
	
		// hemen model bat sortzen dut eta taularen datuak barruan ipintzen dizkiot, titulua eta barruko datuak
        DefaultTableModel model = new DefaultTableModel(hasierakoDatuak, zutabeizena);

        // Jtablearen modeloa ipini
        table.setModel(model);
        
        JPanel paneltextfields = new JPanel();
        paneltextfields.setBounds(0, 43, 392, 132);
        spanel.add(paneltextfields);
        
        JLabel lblAmaieraData = new JLabel("Amaiera Data\r\n");
        lblAmaieraData.setBounds(10, 70, 95, 21);
        
        txtUrtea = new JTextField();
        txtUrtea.setBounds(104, 9, 156, 19);
        txtUrtea.setColumns(10);
        
        txtHasiera = new JTextField();
        txtHasiera.setBounds(104, 38, 156, 19);
        txtHasiera.setColumns(10);
        paneltextfields.setLayout(null);
        paneltextfields.add(lblAmaieraData);
        paneltextfields.add(txtUrtea);
        paneltextfields.add(txtHasiera);
        paneltextfields.setVisible(false);

        
        
        JButton btnSartu = new JButton("Sartu");
     
        btnSartu.setBounds(295, 20, 85, 21);
        paneltextfields.add(btnSartu);
        
        JLabel lblHasierakoData = new JLabel("Hasierako Data\r\n");
        lblHasierakoData.setBounds(10, 37, 95, 21);
        paneltextfields.add(lblHasierakoData);
        
        txtAmaiera = new JTextField();
        txtAmaiera.setColumns(10);
        txtAmaiera.setBounds(104, 71, 156, 19);
        paneltextfields.add(txtAmaiera);
        
        JLabel lblUrtea = new JLabel("Urtea");
        lblUrtea.setBounds(10, 8, 95, 21);
        paneltextfields.add(lblUrtea);
        
        JButton btnEditatu = new JButton("Editatu\r\n");
        
        btnEditatu.setBounds(295, 51, 85, 21);
        paneltextfields.add(btnEditatu);
        
        JLabel lblJolazten = new JLabel("Jolasten\r\n");
        lblJolazten.setBounds(10, 101, 95, 21);
        paneltextfields.add(lblJolazten);
        
         jolastenCBox = new JComboBox();
         jolastenCBox.setModel(new DefaultComboBoxModel(new String[] {"Bai", "Ez"}));
        jolastenCBox.setBounds(104, 100, 156, 21);
        paneltextfields.add(jolastenCBox);
        
        JPanel panelbotones = new JPanel();
        panelbotones.setBounds(393, 43, 307, 132);
        spanel.add(panelbotones);
        panelbotones.setLayout(null);
        								
        
        			/*----------				BOTONES				------------*/
        JButton btnAldatu = new JButton("Aldatu\r\n");
        btnAldatu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		paneltextfields.setVisible(true);

        	}
        });
        btnGordeFitx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//taulan dagoen informazioa denboraldiaList-en sartu botoiaren bitartez
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				ArrayList<Denboraldia> denboraldiaList = new ArrayList<Denboraldia>();
				
				for (int i = 0; i < model.getRowCount(); i++) {
					
					 String urtea = (String) model.getValueAt(i, 0);
			            String hasiera = (String) model.getValueAt(i, 1);
			            String amaiera = (String) model.getValueAt(i, 2);
			            String jolasten = (String) model.getValueAt(i, 3);
			            String denboraldiaid= urtea.substring(5);
					Denboraldia d = new Denboraldia(Integer.parseInt(denboraldiaid), urtea, hasiera, amaiera, false);
					
					denboraldiaList.add(d);
				}
				Utils.gordeDenboraldiaList(denboraldiaList);
			}
		});
        
        
        btnAldatu.setBounds(10, 20, 85, 21);
        panelbotones.add(btnAldatu);
        
        JButton btnEzabatu = new JButton("Ezabatu");
        
        btnEzabatu.setBounds(244, 536, 210, 21);
        spanel.add(btnEzabatu);
        
        btnSartu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		paneltextfields.setVisible(false);
        		gehituElementua();  		
        		
        		String denb = txtUrtea.getText();
        		
        		//Denboraldi berri bat sortu dut, beraz loturik dituen jardunaldiak sortu behar dira
        		Utils.JardunaldiaDenboraldiaFitxSortu(denb);
        		Utils.JokalariDenboraldiaFitxSortu(denb);
        	}
        });
        
        
        btnAukeratu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	
            	
                
            		// Obtener el índice de la fila seleccionada lortu indikatutako zutabearen indicea
                int selectedRowIndex = table.getSelectedRow();

                	// Errenkada bat hautatu den egiaztatu
                if (selectedRowIndex != -1) {
                    // lortu "denboraldia" errenkadaren balioa 
                    String denboraldiaValue = (String) table.getValueAt(selectedRowIndex,0);

                    //Sortu jardunaldiaren panelak
        			JP = new JardunaldiaPanel(denboraldiaValue);
        			JP.setSize(700,600);
        			JP.setLocation(0, 0);
                    
                   
                    Dashboard.ShowPanel(JP);
                    
                } else {
                	JOptionPane.showMessageDialog(null, "Aukeratu denboraldia bat");
                    // errenkada ez badago hautatuta, arazo mesu bat atera
                }

               
            
            }
        });
        
        btnEditatu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		paneltextfields.setVisible(false);
        		editatuElementua();
        		//ajustarValoresSegunJolasten();
        		
        	}
        });

        btnEzabatu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                // Obtener el índice de la fila seleccionada
                int selectedRowIndex = table.getSelectedRow();

                // Verificar si hay una fila seleccionada
                if (selectedRowIndex != -1) {
                	model.removeRow(selectedRowIndex);
                }else {
                	JOptionPane.showMessageDialog(null, "Aukeratu denboraldia bat");
				}
                
        	}
        });
	}
	
	
			
					/*----------		Fin	Botones				------------*/

				
	
	
					/*----------		METODOS				------------*/
	/**
	 * gehituElementu metodoa botoi batentzako balio du metodo hau egiten duena da textfield bat hutsik badago ez du geitzen eta mezu bat bidaltzen dizu,
	 *  guztia ipintzen baduzu ondo betetzen da.
	 * Azkenik ipini textfield-etan textu bat ipintzen da hurrengo aldiz sartzeko
	 */
        private void gehituElementua() {
            
        	// hemen JTextField-en  balioak hartzen dut
        	
            String urtea = txtUrtea.getText();
            String hasiera = txtHasiera.getText();
            String amaiera = txtAmaiera.getText();
            String jolasten = (String)jolastenCBox.getSelectedItem();

            if (urtea.isEmpty() || hasiera.isEmpty() || amaiera.isEmpty() || jolasten.isEmpty() ) {
                // Abisua eman: Eremu guztiak bete behar dira
                JOptionPane.showMessageDialog(this, "Eremu guztiak bete behar dira", "Errorea", JOptionPane.WARNING_MESSAGE);
            } else {
            	// Gehitu lerro berri bat modelora
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.addRow(new Object[]{urtea, hasiera, amaiera, jolasten});
                
                //jolasten bai bada
                if (jolasten.equals("Bai")) {
                	ajustarValoresSegunJolasten(model.getRowCount()-1);
    				
    			}

            }
            


                // Garbitu gure JTextField-ak
            txtUrtea.setText(urtea);
            txtHasiera.setText(hasiera);
            txtAmaiera.setText(amaiera);
                       }
        
        
        //Fitxategi bakarra
        //	1.irakurri jardunaldien fitxategia eta zerrenda batean ipini
        //  2.sortu beste zerrenda batean, denboraldi h8onen jardunaldiak
        //  3.denboraldi honen jardunaldiak gehitu beste urteetako jardunaldien zerrendara
        //  4.zerrenda osoa edo bateratua fitxategian gorde
        
        
        //Fitxategi bat denboraldi bakoitzeko
        // 1.sortu  zerrenda batean, denboraldi honen jardunaldiak
        // 2.fitxategi propioa sortu, honetarako fitxategiaren izenean denboraldiaren izena agertu behar da.
        
        
        /**
         * editatuElementua metodoa botoietan implentatzeko balio du ere, hau bere izena ezaten duenez editatzeko balio du. ez baduzuhautatzen zein aldatu nahi duzun errore bat emango dizu
         */
        private void editatuElementua() {
            // Obtenemos el índice de la fila seleccionada en la tabla
            int indiceFilaSeleccionada = table.getSelectedRow();

            // Verificamos si hay alguna fila seleccionada
            if (indiceFilaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Hautatu behar duzu editatu nahi duzun lerroa", "Errorea", JOptionPane.WARNING_MESSAGE);
            } else {
                // JTextField balioak lortu
                String urtea = txtUrtea.getText();
                String hasiera = txtHasiera.getText();
                String amaiera = txtAmaiera.getText();
                String jolasten = (String)jolastenCBox.getSelectedItem();

                // Verificamos si los campos obligatorios están vacíos
                if (urtea.isEmpty() || hasiera.isEmpty() || amaiera.isEmpty() || jolasten.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Eremu guztiak bete behar dira", "Errorea", JOptionPane.WARNING_MESSAGE);
                } else {
                    // Accedemos al modelo de la tabla
                    DefaultTableModel model = (DefaultTableModel) table.getModel();

                    // Actualizamos los valores en la fila seleccionada
                    model.setValueAt(urtea, indiceFilaSeleccionada, 0);
                    model.setValueAt(hasiera, indiceFilaSeleccionada, 1);
                    model.setValueAt(amaiera, indiceFilaSeleccionada, 2);
                    model.setValueAt(jolasten, indiceFilaSeleccionada, 3);
                }
                
                //jolasten bai bada
                if (jolasten.equals("Bai")) {
                	ajustarValoresSegunJolasten(indiceFilaSeleccionada);
					
				}

                // Limpiamos los JTextField
                txtUrtea.setText("20xx-xx");
                txtHasiera.setText("dd/mm/aa");
                txtAmaiera.setText("dd/mm/aa");
               
                
            }
        }
        
                
        /*
         * beheko metodo hau Jolasten filan ipintzen duen lekuan Bai ipintzen badu beste guztietan Ez ipintzeko.
         */
        
        /**
         * @param baiPosizioa
         */
        private void ajustarValoresSegunJolasten(int baiPosizioa ) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int rowCount = model.getRowCount();
            int targetColumn = 3; // Índice de la columna "Jolasten"
            

            //baiPosizioa ez den bitartean besteak jarri ez
            for (int i = 0; i < rowCount; i++) {
            	if (baiPosizioa != i ) {
            		model.setValueAt("Ez", i, targetColumn);
				}else {
					model.setValueAt("Bai", i, targetColumn);
				}
            }
            
            
        }

        
        
        		/*----------			Fin metodos			------------*/
}
