package T1ERRONKA;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
@SuppressWarnings({ "unused", "javadoc" })



/**
 *  JardunaldiaPanel jardunaldiak erakusteko balioko du.
 */
public class JardunaldiaPanel extends JPanel {


	private static final long serialVersionUID = 1L;
	/**
	 * Jpanel-a
	 */
	private JPanel panel;
	
	
	/**
	 *  lehenengo etxeko textua
	 */
	private JTextField textEtxeko1;
	/**
	 *  bigarren etxeko textua
	 */
	private JTextField textEtxeko2;
	/**
	 *  hirugarren etxeko textua
	 */
	private JTextField textEtxeko3;
	/**
	 *  laugarren etxeko textua
	 */
	private JTextField textEtxeko4;
	/**
	 *  lehenengo kanpoko textua
	 */
	private JTextField textKanpoko1;
	/**
	 *  bigarren kanpoko textua
	 */
	private JTextField textKanpoko2;
	/**
	 *  hirugarren kanpoko textua
	 */
	private JTextField textKanpoko3;
	/**
	 *  laugarren kanpoko textua
	 */
	private JTextField textKanpoko4;
	/**
	 * Jcombox
	 */
	@SuppressWarnings("rawtypes")
	private JComboBox JardunaldiaBox;
	/**
	 *  Jardunaldia List deklaratuta
	 */
	ArrayList<Jardunaldia> jardunaldiaList;
		
	/**
	 * Gure denboraldia bariablea
	 */
	private String gureDenboraldia;
	

	
	
	/**
	 * @param denboraldia
	 * denboraldia parametroa Denboraldiapanel-ean pasatzen diogu
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public JardunaldiaPanel(String denboraldia) {
		this.gureDenboraldia=denboraldia;
		ArrayList<Taldeak> taldeakList = Utils.IrakurriTaldeakFitx();
		// jardunaldiaList =  Utils.IrakurriJardunaldiaFitx();
		jardunaldiaList =  Utils.IrakurriJardunaldiaDenboraldiaFitx(denboraldia);
		//jardunaldiaList = Utils.generarJornadas(taldeakList);
			
			

			///////////////////////////////
		/**
		 * Panelari tamaina ematen diot.
		 * labelak et beste elementu batzuk sortzen ditut
		 */
				setLayout(null);
		
				setLayout(null);
				
				JPanel spanel = new JPanel();
				spanel.setBounds(0, 5, 700, 600);
				add(spanel);
				spanel.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBounds(10, 10, 680, 39);
				spanel.add(panel);
				
				JLabel lblSailkapena = new JLabel("Jaurdunaldia\r\n");
				panel.add(lblSailkapena);
				
				JPanel panel2 = new JPanel();
				panel2.setBounds(20, 77, 670, 513);
				spanel.add(panel2);
				panel2.setLayout(null);
				panel2.setVisible(false);
				
				textEtxeko1 = new JTextField();
				textEtxeko1.setBounds(207, 65, 96, 19);
				panel2.add(textEtxeko1);
				textEtxeko1.setColumns(10);
				
				textEtxeko2 = new JTextField();
				textEtxeko2.setColumns(10);
				textEtxeko2.setBounds(207, 105, 96, 19);
				panel2.add(textEtxeko2);
				
				textEtxeko3 = new JTextField();
				textEtxeko3.setColumns(10);
				textEtxeko3.setBounds(207, 145, 96, 19);
				panel2.add(textEtxeko3);
				
				textEtxeko4 = new JTextField();
				textEtxeko4.setColumns(10);
				textEtxeko4.setBounds(207, 185, 96, 19);
				panel2.add(textEtxeko4);
				
				JLabel lbLvs = new JLabel("VS");
				lbLvs.setBounds(329, 68, 45, 13);
				panel2.add(lbLvs);
				
				JLabel lbLvs_1 = new JLabel("VS");
				lbLvs_1.setBounds(329, 108, 45, 13);
				panel2.add(lbLvs_1);
				
				JLabel lbLvs_1_1 = new JLabel("VS");
				lbLvs_1_1.setBounds(329, 148, 45, 13);
				panel2.add(lbLvs_1_1);
				
				JLabel lbLvs_1_1_1 = new JLabel("VS");
				lbLvs_1_1_1.setBounds(329, 188, 45, 13);
				panel2.add(lbLvs_1_1_1);
				
				textKanpoko1 = new JTextField();
				textKanpoko1.setColumns(10);
				textKanpoko1.setBounds(363, 65, 96, 19);
				panel2.add(textKanpoko1);
				
				textKanpoko2 = new JTextField();
				textKanpoko2.setColumns(10);
				textKanpoko2.setBounds(363, 105, 96, 19);
				panel2.add(textKanpoko2);
				
				textKanpoko3 = new JTextField();
				textKanpoko3.setColumns(10);
				textKanpoko3.setBounds(363, 145, 96, 19);
				panel2.add(textKanpoko3);
				
				textKanpoko4 = new JTextField();
				textKanpoko4.setColumns(10);
				textKanpoko4.setBounds(363, 185, 96, 19);
				panel2.add(textKanpoko4);
				
				JLabel lblEtxekoTaldea1 = new JLabel("EtxekoTaldea");
				lblEtxekoTaldea1.setBounds(10, 68, 187, 13);
				panel2.add(lblEtxekoTaldea1);
				
				JLabel lblEtxekoTaldea2 = new JLabel("EtxekoTaldea");
				lblEtxekoTaldea2.setBounds(10, 108, 187, 13);
				panel2.add(lblEtxekoTaldea2);
				
				JLabel lblEtxekoTaldea3 = new JLabel("EtxekoTaldea");
				lblEtxekoTaldea3.setBounds(10, 148, 184, 13);
				panel2.add(lblEtxekoTaldea3);
				
				JLabel lblEtxekoTaldea4 = new JLabel("EtxekoTaldea");
				lblEtxekoTaldea4.setBounds(10, 188, 184, 13);
				panel2.add(lblEtxekoTaldea4);
				
				JLabel lblKanpokoTaldea1 = new JLabel("KanpokoTaldea");
				lblKanpokoTaldea1.setBounds(493, 71, 167, 13);
				panel2.add(lblKanpokoTaldea1);
				
				JLabel lblKanpokoTaldea2 = new JLabel("KanpokoTaldea\r\n");
				lblKanpokoTaldea2.setBounds(496, 111, 164, 13);
				panel2.add(lblKanpokoTaldea2);
				
				JLabel lblKanpokoTaldea3 = new JLabel("KanpokoTaldea");
				lblKanpokoTaldea3.setBounds(493, 151, 167, 13);
				panel2.add(lblKanpokoTaldea3);
				
				JLabel lblKanpokoTaldea4 = new JLabel("KanpokoTaldea");
				lblKanpokoTaldea4.setBounds(493, 191, 167, 13);
				panel2.add(lblKanpokoTaldea4);
				
				JButton btnGordeJardunaldia = new JButton("Gorde Jardunaldia");
				
				btnGordeJardunaldia.setBounds(490, 324, 150, 21);
				panel2.add(btnGordeJardunaldia);
				
				JButton btnSailkapena = new JButton("Sailkapena");
				btnSailkapena.setBounds(490, 355, 150, 21);
				panel2.add(btnSailkapena);
				
				JardunaldiaBox = new JComboBox();
				JardunaldiaBox.setBounds(20, 52, 99, 21);
				spanel.add(JardunaldiaBox);
				JardunaldiaBox.setModel(new DefaultComboBoxModel(new String[] {"", "J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9", "J10", "J11", "J12", "J13", "J14"}));
				
				
				
				
				
				
				/*----------		ComboBox/Botoiak Listener				------------*/
				
				
				
				btnGordeJardunaldia.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jardunaldiaList =  Utils.IrakurriJardunaldiaDenboraldiaFitx(denboraldia);
						
						String seleccion = (String) JardunaldiaBox.getSelectedItem();
						switch (seleccion) {
							case "J1":														
								//J1
								Jardunaldia jardunaldiaJ1 = jardunaldiaList.get(0);
								
								gordeJardunaldia( 0, jardunaldiaJ1, denboraldia);
					           
//					           //P1
//								Partidoa partidoJ1P1 = jardunaldiaJ1.getPartidoaList().get(0);
//								partidoJ1P1.setEtxekoemaitza(Integer.parseInt(textEtxeko1.getText()));
//					            partidoJ1P1.setKanpokoEmaitza(Integer.parseInt(textKanpoko1.getText()));
//					            jardunaldiaJ1.getPartidoaList().set(0, partidoJ1P1);
//					            
//					            //P2
//					            
//					            Partidoa partidoJ1P2 = jardunaldiaJ1.getPartidoaList().get(1);
//					            partidoJ1P2.setEtxekoemaitza(Integer.parseInt(textEtxeko2.getText()));
//					            partidoJ1P2.setKanpokoEmaitza(Integer.parseInt(textKanpoko2.getText()));
//					            jardunaldiaJ1.getPartidoaList().set(1, partidoJ1P2);
//					            
//				
								//P3
//					            Partidoa partidoJ1P3 = jardunaldiaJ1.getPartidoaList().get(2);
//					            partidoJ1P3.setEtxekoemaitza(Integer.parseInt(textEtxeko3.getText()));
//					            partidoJ1P3.setKanpokoEmaitza(Integer.parseInt(textKanpoko3.getText()));					           				            
//					            jardunaldiaJ1.getPartidoaList().set(2, partidoJ1P3);
//					            
//					            //P4
//					            Partidoa partidoJ1P4 = jardunaldiaJ1.getPartidoaList().get(3);
//					            partidoJ1P4.setEtxekoemaitza(Integer.parseInt(textEtxeko4.getText()));
//					            partidoJ1P4.setKanpokoEmaitza(Integer.parseInt(textKanpoko4.getText()));					           				            
//					            jardunaldiaJ1.getPartidoaList().set(3, partidoJ1P4);
//					            
//					            
//					            
//					            jardunaldiaList.set(0, jardunaldiaJ1);
//					            Utils.gordeJardunaldiaDenboraldiaList(jardunaldiaList, denboraldia);    
					           					            
					        	break;
					        	
							case "J2":														
								//J2
								Jardunaldia jardunaldiaJ2 = jardunaldiaList.get(1);
								gordeJardunaldia( 1, jardunaldiaJ2, denboraldia);
					            
					            
					        	break;
					        	
					        	
							case "J3":														
								//J3
								Jardunaldia jardunaldiaJ3 = jardunaldiaList.get(2);
								
								
					           
								gordeJardunaldia( 2, jardunaldiaJ3, denboraldia);					            
					            
					            
					        	break;
					        	

							case "J4":	
								Jardunaldia jardunaldiaJ4 = jardunaldiaList.get(3);
								gordeJardunaldia( 3, jardunaldiaJ4, denboraldia);
					            
					            
					        	break;
					        	
							case "J5":														
								//J5
								Jardunaldia jardunaldiaJ5 = jardunaldiaList.get(4);
								
								
								gordeJardunaldia( 4, jardunaldiaJ5, denboraldia);    
					            
					        	break;
					        
							case "J6":														
								//J6
								Jardunaldia jardunaldiaJ6 = jardunaldiaList.get(5);
								
								
								gordeJardunaldia( 5, jardunaldiaJ6, denboraldia);   
					            
					        	break;
					        	
							case "J7":														
								//J7
								Jardunaldia jardunaldiaJ7 = jardunaldiaList.get(6);
								gordeJardunaldia( 6, jardunaldiaJ7, denboraldia);
					        	
								break;
					        	
							case "J8":														
								//J8
								Jardunaldia jardunaldiaJ8 = jardunaldiaList.get(7);

								gordeJardunaldia( 7, jardunaldiaJ8, denboraldia);
								break;
					        
							case "J9":														
								//J9
								Jardunaldia jardunaldiaJ9 = jardunaldiaList.get(8);
								gordeJardunaldia( 8, jardunaldiaJ9, denboraldia);
								
					            
					            
					        	break;
					        	
							case "J10":														
								//J10
								Jardunaldia jardunaldiaJ10 = jardunaldiaList.get(9);
								gordeJardunaldia( 9, jardunaldiaJ10, denboraldia);					        	break;
					        	
							case "J11":														
								//J11
								Jardunaldia jardunaldiaJ11 = jardunaldiaList.get(10);
								gordeJardunaldia( 10, jardunaldiaJ11, denboraldia);
								break;
					        	
					        	
							case "J12":														
								//J12
								Jardunaldia jardunaldiaJ12 = jardunaldiaList.get(11);
								gordeJardunaldia( 11, jardunaldiaJ12, denboraldia);					        	
								break;
				

							case "J13":														
								//J13
								Jardunaldia jardunaldiaJ13 = jardunaldiaList.get(12);
								gordeJardunaldia( 12, jardunaldiaJ13, denboraldia);
					            
					        	break;
					        	
							case "J14":														
								//J14
								Jardunaldia jardunaldiaJ14 = jardunaldiaList.get(13);
								gordeJardunaldia( 3, jardunaldiaJ14, denboraldia);
								break;
				
				
						}    
				            
					}
				});
				
				JardunaldiaBox.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                // Obtener la opción seleccionada
		                String seleccion = (String) JardunaldiaBox.getSelectedItem();

		                // Aplicar condiciones según la opción seleccionada
		                if ("J1".equals(seleccion)) {
		                    
		                    panel2.setVisible(true);
		                    Jardunaldia jardunaldiaJ1 = jardunaldiaList.get(0);
		                   /*
		                    * Lehenengo partidoa
		                    * */
		                    Partidoa partidoJ1P1 = jardunaldiaJ1.getPartidoaList().get(0);
		                    String taldeaEtxeko1 = partidoJ1P1.getEtxekoTaldea();
		                    String taldeaKanpoko1 = partidoJ1P1.getKanpokoTaldea();
		                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
		                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
		                    
		                    //emaitzak
		                    textEtxeko1.setText(""+partidoJ1P1.getEtxekoemaitza());
		                    textKanpoko1.setText(""+partidoJ1P1.getKanpokoEmaitza());
		                   
		                    /*
		                     * Bigarren partidoa
		                     */
		                    Partidoa partidoJ1P2 = jardunaldiaJ1.getPartidoaList().get(1);
		                    String taldeaEtxeko2 = partidoJ1P2.getEtxekoTaldea();
		                    String taldeaKanpoko2 = partidoJ1P2.getKanpokoTaldea();
		                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
		                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
		                    
		                  //emaitzak
		                    textEtxeko2.setText(""+partidoJ1P2.getEtxekoemaitza());
		                    textKanpoko2.setText(""+partidoJ1P2.getKanpokoEmaitza());
		                    
		                    /*
		                     * hirugarren partidoa
		                     */
		                    Partidoa partidoJ1P3 = jardunaldiaJ1.getPartidoaList().get(2);
		                    String taldeaEtxeko3 = partidoJ1P3.getEtxekoTaldea();
		                    String taldeaKanpoko3 = partidoJ1P3.getKanpokoTaldea();
		                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
		                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
		                    
		                  //emaitzak
		                    textEtxeko3.setText(""+partidoJ1P3.getEtxekoemaitza());
		                    textKanpoko3.setText(""+partidoJ1P3.getKanpokoEmaitza());
		                    /*
		                     * laugarren partidoa
		                     */
		                    Partidoa partidoJ1P4 = jardunaldiaJ1.getPartidoaList().get(3);
		                    String taldeaEtxeko4 = partidoJ1P4.getEtxekoTaldea();
		                    String taldeaKanpoko4 = partidoJ1P4.getKanpokoTaldea();
		                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
		                    lblKanpokoTaldea4.setText(taldeaKanpoko4);
		                    
		                  //emaitzak
		                    textEtxeko4.setText(""+partidoJ1P4.getEtxekoemaitza());
		                    textKanpoko4.setText(""+partidoJ1P4.getKanpokoEmaitza());
		                    
		                } else if ("J2".equals(seleccion)) {
		                    // Código para la opción 2
		                	Jardunaldia jardunaldiaJ2 = jardunaldiaList.get(1);
		                	/*
			                    * Lehenengo partidoa
			                    * */
			                    Partidoa partidoJ2P1 = jardunaldiaJ2.getPartidoaList().get(0);
			                    String taldeaEtxeko1 = partidoJ2P1.getEtxekoTaldea();
			                    String taldeaKanpoko1 = partidoJ2P1.getKanpokoTaldea();
			                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
			                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
			                   
			                  //emaitzak
			                    textEtxeko1.setText(""+partidoJ2P1.getEtxekoemaitza());
			                    textKanpoko1.setText(""+partidoJ2P1.getKanpokoEmaitza());
			                    
			                    /*
			                     * Bigarren partidoa
			                     */
			                    Partidoa partidoJ2P2 = jardunaldiaJ2.getPartidoaList().get(1);
			                    String taldeaEtxeko2 = partidoJ2P2.getEtxekoTaldea();
			                    String taldeaKanpoko2 = partidoJ2P2.getKanpokoTaldea();
			                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
			                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
			                    
			                  //emaitzak
			                    textEtxeko2.setText(""+partidoJ2P2.getEtxekoemaitza());
			                    textKanpoko2.setText(""+partidoJ2P2.getKanpokoEmaitza());
			                    /*
			                     * hirugarren partidoa
			                     */
			                    Partidoa partidoJ2P3 = jardunaldiaJ2.getPartidoaList().get(2);
			                    String taldeaEtxeko3 = partidoJ2P3.getEtxekoTaldea();
			                    String taldeaKanpoko3 = partidoJ2P3.getKanpokoTaldea();
			                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
			                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
			                  //emaitzak
			                    textEtxeko3.setText(""+partidoJ2P3.getEtxekoemaitza());
			                    textKanpoko3.setText(""+partidoJ2P3.getKanpokoEmaitza());
			                    
			                    /*
			                     * laugarren partidoa
			                     */
			                    Partidoa partidoJ2P4 = jardunaldiaJ2.getPartidoaList().get(3);
			                    String taldeaEtxeko4 = partidoJ2P4.getEtxekoTaldea();
			                    String taldeaKanpoko4 = partidoJ2P4.getKanpokoTaldea();
			                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
			                    lblKanpokoTaldea4.setText(taldeaKanpoko4);	
			                  //emaitzak
			                    textEtxeko4.setText(""+partidoJ2P4.getEtxekoemaitza());
			                    textKanpoko4.setText(""+partidoJ2P4.getKanpokoEmaitza());
		                    panel2.setVisible(true);
		                    

		                } 
							else if ("J3".equals(seleccion)) {
							// Código para la opción 3
							    // Código para la opción 2
			                	Jardunaldia jardunaldiaJ3 = jardunaldiaList.get(2);
			                	/*
				                    * Lehenengo partidoa
				                    * */
				                    Partidoa partidoJ3P1 = jardunaldiaJ3.getPartidoaList().get(0);
				                    String taldeaEtxeko1 = partidoJ3P1.getEtxekoTaldea();
				                    String taldeaKanpoko1 = partidoJ3P1.getKanpokoTaldea();
				                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
				                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
				                  //emaitzak
				                    textEtxeko1.setText(""+partidoJ3P1.getEtxekoemaitza());
				                    textKanpoko1.setText(""+partidoJ3P1.getKanpokoEmaitza());
				                    /*
				                     * Bigarren partidoa
				                     */
				                    Partidoa partidoJ3P2 = jardunaldiaJ3.getPartidoaList().get(1);
				                    String taldeaEtxeko2 = partidoJ3P2.getEtxekoTaldea();
				                    String taldeaKanpoko2 = partidoJ3P2.getKanpokoTaldea();
				                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
				                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
				                  //emaitza
				                    textEtxeko2.setText(""+partidoJ3P2.getEtxekoemaitza());
				                    textKanpoko2.setText(""+partidoJ3P2.getKanpokoEmaitza());
				                    /*
				                     * hirugarren partidoa
				                     */
				                    Partidoa partidoJ3P3 = jardunaldiaJ3.getPartidoaList().get(2);
				                    String taldeaEtxeko3 = partidoJ3P3.getEtxekoTaldea();
				                    String taldeaKanpoko3 = partidoJ3P3.getKanpokoTaldea();
				                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
				                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
				                  //emaitza
				                    textEtxeko3.setText(""+partidoJ3P3.getEtxekoemaitza());
				                    textKanpoko3.setText(""+partidoJ3P3.getKanpokoEmaitza());
				                    /*
				                     * laugarren partidoa
				                     */
				                    Partidoa partidoJ3P4 = jardunaldiaJ3.getPartidoaList().get(3);
				                    String taldeaEtxeko4 = partidoJ3P4.getEtxekoTaldea();
				                    String taldeaKanpoko4 = partidoJ3P4.getKanpokoTaldea();
				                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
				                    lblKanpokoTaldea4.setText(taldeaKanpoko4);
				                    //emaitza
				                    textEtxeko4.setText(""+partidoJ3P4.getEtxekoemaitza());
				                    textKanpoko4.setText(""+partidoJ3P4.getKanpokoEmaitza());
			                    
			                    panel2.setVisible(true);
							
							 panel2.setVisible(true);
									             
							}
							else if ("J4".equals(seleccion)) {
							    // Código para la opción 2
			                	Jardunaldia jardunaldiaJ4 = jardunaldiaList.get(3);
			                	/*
				                    * Lehenengo partidoa
				                    * */
				                    Partidoa partidoJ4P1 = jardunaldiaJ4.getPartidoaList().get(0);
				                    String taldeaEtxeko1 = partidoJ4P1.getEtxekoTaldea();
				                    String taldeaKanpoko1 = partidoJ4P1.getKanpokoTaldea();
				                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
				                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
				                  //emaitzak
				                    textEtxeko1.setText(""+partidoJ4P1.getEtxekoemaitza());
				                    textKanpoko1.setText(""+partidoJ4P1.getKanpokoEmaitza());
				                    /*
				                     * Bigarren partidoa
				                     */
				                    Partidoa partidoJ4P2 = jardunaldiaJ4.getPartidoaList().get(1);
				                    String taldeaEtxeko2 = partidoJ4P2.getEtxekoTaldea();
				                    String taldeaKanpoko2 = partidoJ4P2.getKanpokoTaldea();
				                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
				                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
				                  //emaitzak
				                    textEtxeko2.setText(""+partidoJ4P2.getEtxekoemaitza());
				                    textKanpoko2.setText(""+partidoJ4P2.getKanpokoEmaitza());
				                    
				                    /*
				                     * hirugarren partidoa
				                     */
				                    Partidoa partidoJ4P3 = jardunaldiaJ4.getPartidoaList().get(2);
				                    String taldeaEtxeko3 = partidoJ4P3.getEtxekoTaldea();
				                    String taldeaKanpoko3 = partidoJ4P3.getKanpokoTaldea();
				                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
				                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
				                    
				                  //emaitzak
				                    textEtxeko3.setText(""+partidoJ4P3.getEtxekoemaitza());
				                    textKanpoko3.setText(""+partidoJ4P3.getKanpokoEmaitza());
				                    
				                    /*
				                     * laugarren partidoa
				                     */
				                    Partidoa partidoJ4P4 = jardunaldiaJ4.getPartidoaList().get(3);
				                    String taldeaEtxeko4 = partidoJ4P4.getEtxekoTaldea();
				                    String taldeaKanpoko4 = partidoJ4P4.getKanpokoTaldea();
				                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
				                    lblKanpokoTaldea4.setText(taldeaKanpoko4);	
			                    
				                  //emaitzak
				                    textEtxeko4.setText(""+partidoJ4P4.getEtxekoemaitza());
				                    textKanpoko4.setText(""+partidoJ4P4.getKanpokoEmaitza());
				                    
							
							 panel2.setVisible(true);
							 
							}
							else if ("J5".equals(seleccion)) {
							// Código para la opción 3
								Jardunaldia jardunaldiaJ5 = jardunaldiaList.get(4);
			                	/*
				                    * Lehenengo partidoa
				                    * */
				                    Partidoa partidoJ5P1 = jardunaldiaJ5.getPartidoaList().get(0);
				                    String taldeaEtxeko1 = partidoJ5P1.getEtxekoTaldea();
				                    String taldeaKanpoko1 = partidoJ5P1.getKanpokoTaldea();
				                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
				                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
				                    
				                  //emaitzak
				                    textEtxeko1.setText(""+partidoJ5P1.getEtxekoemaitza());
				                    textKanpoko1.setText(""+partidoJ5P1.getKanpokoEmaitza());
				                    
				                    /*
				                     * Bigarren partidoa
				                     */
				                    Partidoa partidoJ5P2 = jardunaldiaJ5.getPartidoaList().get(1);
				                    String taldeaEtxeko2 = partidoJ5P2.getEtxekoTaldea();
				                    String taldeaKanpoko2 = partidoJ5P2.getKanpokoTaldea();
				                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
				                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
				                 
				                    //emaitzak
				                    textEtxeko2.setText(""+partidoJ5P2.getEtxekoemaitza());
				                    textKanpoko2.setText(""+partidoJ5P2.getKanpokoEmaitza());
				                    /*
				                     * hirugarren partidoa
				                     */
				                    Partidoa partidoJ5P3 = jardunaldiaJ5.getPartidoaList().get(2);
				                    String taldeaEtxeko3 = partidoJ5P3.getEtxekoTaldea();
				                    String taldeaKanpoko3 = partidoJ5P3.getKanpokoTaldea();
				                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
				                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
				                    
				                    //emaitzak
				                    textEtxeko3.setText(""+partidoJ5P3.getEtxekoemaitza());
				                    textKanpoko3.setText(""+partidoJ5P3.getKanpokoEmaitza());
				                    
				                    /*
				                     * laugarren partidoa
				                     */
				                    Partidoa partidoJ5P4 = jardunaldiaJ5.getPartidoaList().get(3);
				                    String taldeaEtxeko4 = partidoJ5P4.getEtxekoTaldea();
				                    String taldeaKanpoko4 = partidoJ5P4.getKanpokoTaldea();
				                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
				                    lblKanpokoTaldea4.setText(taldeaKanpoko4);	
			                    
				                    //emaitzak
				                    textEtxeko4.setText(""+partidoJ5P4.getEtxekoemaitza());
				                    textKanpoko4.setText(""+partidoJ5P4.getKanpokoEmaitza());
							 panel2.setVisible(true);		                
							}
							else if ("J6".equals(seleccion)) {
							// Código para la opción 3
								Jardunaldia jardunaldiaJ6 = jardunaldiaList.get(5);
			                	/*
				                    * Lehenengo partidoa
				                    * */
				                    Partidoa partidoJ6P1 = jardunaldiaJ6.getPartidoaList().get(0);
				                    String taldeaEtxeko1 = partidoJ6P1.getEtxekoTaldea();
				                    String taldeaKanpoko1 = partidoJ6P1.getKanpokoTaldea();
				                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
				                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
				                    //emaitzak
				                    textEtxeko1.setText(""+partidoJ6P1.getEtxekoemaitza());
				                    textKanpoko1.setText(""+partidoJ6P1.getKanpokoEmaitza());
				                    
				                    /*
				                     * Bigarren partidoa
				                     */
				                    Partidoa partidoJ6P2 = jardunaldiaJ6.getPartidoaList().get(1);
				                    String taldeaEtxeko2 = partidoJ6P2.getEtxekoTaldea();
				                    String taldeaKanpoko2 = partidoJ6P2.getKanpokoTaldea();
				                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
				                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
				                  //emaitzak
				                    textEtxeko2.setText(""+partidoJ6P2.getEtxekoemaitza());
				                    textKanpoko2.setText(""+partidoJ6P2.getKanpokoEmaitza());
				                    
				                    /*
				                     * hirugarren partidoa
				                     */
				                    Partidoa partidoJ6P3 = jardunaldiaJ6.getPartidoaList().get(2);
				                    String taldeaEtxeko3 = partidoJ6P3.getEtxekoTaldea();
				                    String taldeaKanpoko3 = partidoJ6P3.getKanpokoTaldea();
				                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
				                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
				                  //emaitzak
				                    textEtxeko3.setText(""+partidoJ6P3.getEtxekoemaitza());
				                    textKanpoko3.setText(""+partidoJ6P3.getKanpokoEmaitza());
				                    
				                    
				                    /*
				                     * laugarren partidoa
				                     */
				                    Partidoa partidoJ6P4 = jardunaldiaJ6.getPartidoaList().get(3);
				                    String taldeaEtxeko4 = partidoJ6P4.getEtxekoTaldea();
				                    String taldeaKanpoko4 = partidoJ6P4.getKanpokoTaldea();
				                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
				                    lblKanpokoTaldea4.setText(taldeaKanpoko4);
				                  //emaitzak
				                    textEtxeko4.setText(""+partidoJ6P4.getEtxekoemaitza());
				                    textKanpoko4.setText(""+partidoJ6P4.getKanpokoEmaitza());
				                    	
			                    
							
							 panel2.setVisible(true);		                
							}
							else if ("J7".equals(seleccion)) {
							// Código para la opción 3
								Jardunaldia jardunaldiaJ7 = jardunaldiaList.get(6);
			                	/*
				                    * Lehenengo partidoa
				                    * */
				                    Partidoa partidoJ7P1 = jardunaldiaJ7.getPartidoaList().get(0);
				                    String taldeaEtxeko1 = partidoJ7P1.getEtxekoTaldea();
				                    String taldeaKanpoko1 = partidoJ7P1.getKanpokoTaldea();
				                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
				                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
				                  //emaitzak
				                    textEtxeko1.setText(""+partidoJ7P1.getEtxekoemaitza());
				                    textKanpoko1.setText(""+partidoJ7P1.getKanpokoEmaitza());
				                    
				                    /*
				                     * Bigarren partidoa
				                     */
				                    Partidoa partidoJ7P2 = jardunaldiaJ7.getPartidoaList().get(1);
				                    String taldeaEtxeko2 = partidoJ7P2.getEtxekoTaldea();
				                    String taldeaKanpoko2 = partidoJ7P2.getKanpokoTaldea();
				                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
				                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
				                  
				                  //emaitzak
				                    textEtxeko2.setText(""+partidoJ7P2.getEtxekoemaitza());
				                    textKanpoko2.setText(""+partidoJ7P2.getKanpokoEmaitza());
				                    /*
				                     * hirugarren partidoa
				                     */
				                    Partidoa partidoJ7P3 = jardunaldiaJ7.getPartidoaList().get(2);
				                    String taldeaEtxeko3 = partidoJ7P3.getEtxekoTaldea();
				                    String taldeaKanpoko3 = partidoJ7P3.getKanpokoTaldea();
				                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
				                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
				                  //emaitzak
				                    textEtxeko3.setText(""+partidoJ7P3.getEtxekoemaitza());
				                    textKanpoko3.setText(""+partidoJ7P3.getKanpokoEmaitza());
				                    /*
				                     * laugarren partidoa
				                     */
				                    Partidoa partidoJ7P4 = jardunaldiaJ7.getPartidoaList().get(3);
				                    String taldeaEtxeko4 = partidoJ7P4.getEtxekoTaldea();
				                    String taldeaKanpoko4 = partidoJ7P4.getKanpokoTaldea();
				                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
				                    lblKanpokoTaldea4.setText(taldeaKanpoko4);	
				                  //emaitzak
				                    textEtxeko4.setText(""+partidoJ7P4.getEtxekoemaitza());
				                    textKanpoko4.setText(""+partidoJ7P4.getKanpokoEmaitza());
							
							 panel2.setVisible(true);		                
							}
							else if ("J8".equals(seleccion)) {
							// Código para la opción 3
								Jardunaldia jardunaldiaJ8 = jardunaldiaList.get(7);
			                	/*
				                    * Lehenengo partidoa
				                    * */
				                    Partidoa partidoJ8P1 = jardunaldiaJ8.getPartidoaList().get(0);
				                    String taldeaEtxeko1 = partidoJ8P1.getEtxekoTaldea();
				                    String taldeaKanpoko1 = partidoJ8P1.getKanpokoTaldea();
				                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
				                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
				                    
				                  //emaitzak
				                    textEtxeko1.setText(""+partidoJ8P1.getEtxekoemaitza());
				                    textKanpoko1.setText(""+partidoJ8P1.getKanpokoEmaitza());
				                    /*
				                     * Bigarren partidoa
				                     */
				                    Partidoa partidoJ8P2 = jardunaldiaJ8.getPartidoaList().get(1);
				                    String taldeaEtxeko2 = partidoJ8P2.getEtxekoTaldea();
				                    String taldeaKanpoko2 = partidoJ8P2.getKanpokoTaldea();
				                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
				                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
				                    
				                  //emaitzak
				                    textEtxeko2.setText(""+partidoJ8P2.getEtxekoemaitza());
				                    textKanpoko2.setText(""+partidoJ8P2.getKanpokoEmaitza());
				                    /*
				                     * hirugarren partidoa
				                     */
				                    Partidoa partidoJ8P3 = jardunaldiaJ8.getPartidoaList().get(2);
				                    String taldeaEtxeko3 = partidoJ8P3.getEtxekoTaldea();
				                    String taldeaKanpoko3 = partidoJ8P3.getKanpokoTaldea();
				                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
				                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
				                    textEtxeko3.setText(""+partidoJ8P3.getEtxekoemaitza());
				                    textKanpoko3.setText(""+partidoJ8P3.getKanpokoEmaitza());
				                    
				                    /*
				                     * laugarren partidoa
				                     */
				                    Partidoa partidoJ8P4 = jardunaldiaJ8.getPartidoaList().get(3);
				                    String taldeaEtxeko4 = partidoJ8P4.getEtxekoTaldea();
				                    String taldeaKanpoko4 = partidoJ8P4.getKanpokoTaldea();
				                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
				                    lblKanpokoTaldea4.setText(taldeaKanpoko4);	
				                    textEtxeko4.setText(""+partidoJ8P4.getEtxekoemaitza());
				                    textKanpoko4.setText(""+partidoJ8P4.getKanpokoEmaitza());
							 panel2.setVisible(true);		                
							}
							else if ("J9".equals(seleccion)) {
							// Código para la opción 3
								Jardunaldia jardunaldiaJ9 = jardunaldiaList.get(8);
			                	/*
				                    * Lehenengo partidoa
				                    * */
				                    Partidoa partidoJ9P1 = jardunaldiaJ9.getPartidoaList().get(0);
				                    String taldeaEtxeko1 = partidoJ9P1.getEtxekoTaldea();
				                    String taldeaKanpoko1 = partidoJ9P1.getKanpokoTaldea();
				                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
				                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
				                    
				                  //emaitzak
				                    textEtxeko1.setText(""+partidoJ9P1.getEtxekoemaitza());
				                    textKanpoko1.setText(""+partidoJ9P1.getKanpokoEmaitza());
							
				                    /*
				                     * Bigarren partidoa
				                     */
				                    Partidoa partidoJ9P2 = jardunaldiaJ9.getPartidoaList().get(1);
				                    String taldeaEtxeko2 = partidoJ9P2.getEtxekoTaldea();
				                    String taldeaKanpoko2 = partidoJ9P2.getKanpokoTaldea();
				                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
				                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
				                    
				                  //emaitzak
				                    textEtxeko2.setText(""+partidoJ9P2.getEtxekoemaitza());
				                    textKanpoko2.setText(""+partidoJ9P2.getKanpokoEmaitza());
							
				                    /*
				                     * hirugarren partidoa
				                     */
				                    Partidoa partidoJ9P3 = jardunaldiaJ9.getPartidoaList().get(2);
				                    String taldeaEtxeko3 = partidoJ9P3.getEtxekoTaldea();
				                    String taldeaKanpoko3 = partidoJ9P3.getKanpokoTaldea();
				                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
				                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
				                    
				                    
				                  //emaitzak
				                    textEtxeko3.setText(""+partidoJ9P3.getEtxekoemaitza());
				                    textKanpoko3.setText(""+partidoJ9P3.getKanpokoEmaitza());
							
				                    /*
				                     * laugarren partidoa
				                     */
				                    Partidoa partidoJ9P4 = jardunaldiaJ9.getPartidoaList().get(3);
				                    String taldeaEtxeko4 = partidoJ9P4.getEtxekoTaldea();
				                    String taldeaKanpoko4 = partidoJ9P4.getKanpokoTaldea();
				                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
				                    lblKanpokoTaldea4.setText(taldeaKanpoko4);	
				                  //emaitzak
				                    textEtxeko4.setText(""+partidoJ9P4.getEtxekoemaitza());
				                    textKanpoko4.setText(""+partidoJ9P4.getKanpokoEmaitza());
							
							
							 panel2.setVisible(true);		                
							}
							else if ("J10".equals(seleccion)) {
							// Código para la opción 3
								Jardunaldia jardunaldiaJ10 = jardunaldiaList.get(9);
			                	/*
				                    * Lehenengo partidoa
				                    * */
				                    Partidoa partidoJ10P1 = jardunaldiaJ10.getPartidoaList().get(0);
				                    String taldeaEtxeko1 = partidoJ10P1.getEtxekoTaldea();
				                    String taldeaKanpoko1 = partidoJ10P1.getKanpokoTaldea();
				                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
				                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
				                  //emaitzak
				                    textEtxeko1.setText(""+partidoJ10P1.getEtxekoemaitza());
				                    textKanpoko1.setText(""+partidoJ10P1.getKanpokoEmaitza());
							
				                    /*
				                     * Bigarren partidoa
				                     */
				                    Partidoa partidoJ10P2 = jardunaldiaJ10.getPartidoaList().get(1);
				                    String taldeaEtxeko2 = partidoJ10P2.getEtxekoTaldea();
				                    String taldeaKanpoko2 = partidoJ10P2.getKanpokoTaldea();
				                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
				                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
				                    
				                    textEtxeko2.setText(""+partidoJ10P2.getEtxekoemaitza());
				                    textKanpoko2.setText(""+partidoJ10P2.getKanpokoEmaitza());
				                    /*
				                     * hirugarren partidoa
				                     */
				                    Partidoa partidoJ10P3 = jardunaldiaJ10.getPartidoaList().get(2);
				                    String taldeaEtxeko3 = partidoJ10P3.getEtxekoTaldea();
				                    String taldeaKanpoko3 = partidoJ10P3.getKanpokoTaldea();
				                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
				                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
				                    
				                    
				                    textEtxeko3.setText(""+partidoJ10P3.getEtxekoemaitza());
				                    textKanpoko3.setText(""+partidoJ10P3.getKanpokoEmaitza());
				                    /*
				                     * laugarren partidoa
				                     */
				                    Partidoa partidoJ10P4 = jardunaldiaJ10.getPartidoaList().get(3);
				                    String taldeaEtxeko4 = partidoJ10P4.getEtxekoTaldea();
				                    String taldeaKanpoko4 = partidoJ10P4.getKanpokoTaldea();
				                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
				                    lblKanpokoTaldea4.setText(taldeaKanpoko4);	
				                    textEtxeko4.setText(""+partidoJ10P4.getEtxekoemaitza());
				                    textKanpoko4.setText(""+partidoJ10P4.getKanpokoEmaitza());
								 panel2.setVisible(true);

							}
							else if ("J11".equals(seleccion)) {
							// Código para la opción 3
								Jardunaldia jardunaldiaJ11 = jardunaldiaList.get(10);
			                	/*
				                    * Lehenengo partidoa
				                    * */
				                    Partidoa partidoJ11P1 = jardunaldiaJ11.getPartidoaList().get(0);
				                    String taldeaEtxeko1 = partidoJ11P1.getEtxekoTaldea();
				                    String taldeaKanpoko1 = partidoJ11P1.getKanpokoTaldea();
				                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
				                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
				                    //emaitza
				                    textEtxeko1.setText(""+partidoJ11P1.getEtxekoemaitza());
				                    textKanpoko1.setText(""+partidoJ11P1.getKanpokoEmaitza());
				                    /*
				                     * Bigarren partidoa
				                     */
				                    Partidoa partidoJ11P2 = jardunaldiaJ11.getPartidoaList().get(1);
				                    String taldeaEtxeko2 = partidoJ11P2.getEtxekoTaldea();
				                    String taldeaKanpoko2 = partidoJ11P2.getKanpokoTaldea();
				                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
				                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
				                    
				                    //emaitza
				                    textEtxeko2.setText(""+partidoJ11P2.getEtxekoemaitza());
				                    textKanpoko2.setText(""+partidoJ11P2.getKanpokoEmaitza());
				                   
				                    /*
				                     * hirugarren partidoa
				                     */
				                    Partidoa partidoJ11P3 = jardunaldiaJ11.getPartidoaList().get(2);
				                    String taldeaEtxeko3 = partidoJ11P3.getEtxekoTaldea();
				                    String taldeaKanpoko3 = partidoJ11P3.getKanpokoTaldea();
				                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
				                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
				                    
				                    //emaitza
				                    textEtxeko3.setText(""+partidoJ11P3.getEtxekoemaitza());
				                    textKanpoko3.setText(""+partidoJ11P3.getKanpokoEmaitza());
				                   
				                    /*
				                     * laugarren partidoa
				                     */
				                    Partidoa partidoJ11P4 = jardunaldiaJ11.getPartidoaList().get(3);
				                    String taldeaEtxeko4 = partidoJ11P4.getEtxekoTaldea();
				                    String taldeaKanpoko4 = partidoJ11P4.getKanpokoTaldea();
				                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
				                    lblKanpokoTaldea4.setText(taldeaKanpoko4);	
				                    //emaitza
				                    textEtxeko4.setText(""+partidoJ11P4.getEtxekoemaitza());
				                    textKanpoko4.setText(""+partidoJ11P4.getKanpokoEmaitza());
				                   
								 panel2.setVisible(true);		         									                
							}
							else if ("J12".equals(seleccion)) {
								 // Código para la opción 3
								Jardunaldia jardunaldiaJ12 = jardunaldiaList.get(11);
			                	/*
				                    * Lehenengo partidoa
				                    * */
				                    Partidoa partidoJ12P1 = jardunaldiaJ12.getPartidoaList().get(0);
				                    String taldeaEtxeko1 = partidoJ12P1.getEtxekoTaldea();
				                    String taldeaKanpoko1 = partidoJ12P1.getKanpokoTaldea();
				                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
				                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
				                    //emaitza
				                    textEtxeko1.setText(""+partidoJ12P1.getEtxekoemaitza());
				                    textKanpoko1.setText(""+partidoJ12P1.getKanpokoEmaitza());
				                   
				                    /*
				                     * Bigarren partidoa
				                     */
				                    Partidoa partidoJ12P2 = jardunaldiaJ12.getPartidoaList().get(1);
				                    String taldeaEtxeko2 = partidoJ12P2.getEtxekoTaldea();
				                    String taldeaKanpoko2 = partidoJ12P2.getKanpokoTaldea();
				                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
				                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
				                    
				                    textEtxeko2.setText(""+partidoJ12P2.getEtxekoemaitza());
				                    textKanpoko2.setText(""+partidoJ12P2.getKanpokoEmaitza());
				                   
				                    /*
				                     * hirugarren partidoa
				                     */
				                    Partidoa partidoJ12P3 = jardunaldiaJ12.getPartidoaList().get(2);
				                    String taldeaEtxeko3 = partidoJ12P3.getEtxekoTaldea();
				                    String taldeaKanpoko3 = partidoJ12P3.getKanpokoTaldea();
				                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
				                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
				                    
				                    //emaitza
				                    textEtxeko3.setText(""+partidoJ12P3.getEtxekoemaitza());
				                    textKanpoko3.setText(""+partidoJ12P3.getKanpokoEmaitza());
				                   
				                    /*
				                     * laugarren partidoa
				                     */
				                    Partidoa partidoJ12P4 = jardunaldiaJ12.getPartidoaList().get(3);
				                    String taldeaEtxeko4 = partidoJ12P4.getEtxekoTaldea();
				                    String taldeaKanpoko4 = partidoJ12P4.getKanpokoTaldea();
				                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
				                    lblKanpokoTaldea4.setText(taldeaKanpoko4);	
			                    
									         
				                    textEtxeko4.setText(""+partidoJ12P4.getEtxekoemaitza());
				                    textKanpoko4.setText(""+partidoJ12P4.getKanpokoEmaitza());
				                   
								 panel2.setVisible(true);
							}
							else if ("J13".equals(seleccion)) {
								// Código para la opción 3
								Jardunaldia jardunaldiaJ13 = jardunaldiaList.get(12);
			                	/*
				                    * Lehenengo partidoa
				                    * */
				                    Partidoa partidoJ13P1 = jardunaldiaJ13.getPartidoaList().get(0);
				                    String taldeaEtxeko1 = partidoJ13P1.getEtxekoTaldea();
				                    String taldeaKanpoko1 = partidoJ13P1.getKanpokoTaldea();
				                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
				                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
				                    
				                    //emaitza
				                    textEtxeko1.setText(""+partidoJ13P1.getEtxekoemaitza());
				                    textKanpoko1.setText(""+partidoJ13P1.getKanpokoEmaitza());
				                   
				                    /*
				                     * Bigarren partidoa
				                     */
				                    Partidoa partidoJ13P2 = jardunaldiaJ13.getPartidoaList().get(1);
				                    String taldeaEtxeko2 = partidoJ13P2.getEtxekoTaldea();
				                    String taldeaKanpoko2 = partidoJ13P2.getKanpokoTaldea();
				                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
				                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
				                    
				                  //emaitza
				                    textEtxeko2.setText(""+partidoJ13P2.getEtxekoemaitza());
				                    textKanpoko2.setText(""+partidoJ13P2.getKanpokoEmaitza());
				                    /*
				                     * hirugarren partidoa
				                     */
				                    Partidoa partidoJ13P3 = jardunaldiaJ13.getPartidoaList().get(2);
				                    String taldeaEtxeko3 = partidoJ13P3.getEtxekoTaldea();
				                    String taldeaKanpoko3 = partidoJ13P3.getKanpokoTaldea();
				                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
				                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
				                    
				                  //emaitza
				                    textEtxeko3.setText(""+partidoJ13P3.getEtxekoemaitza());
				                    textKanpoko3.setText(""+partidoJ13P3.getKanpokoEmaitza());
				                  
				                    /*
				                     * laugarren partidoa
				                     */
				                    Partidoa partidoJ13P4 = jardunaldiaJ13.getPartidoaList().get(3);
				                    String taldeaEtxeko4 = partidoJ13P4.getEtxekoTaldea();
				                    String taldeaKanpoko4 = partidoJ13P4.getKanpokoTaldea();
				                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
				                    lblKanpokoTaldea4.setText(taldeaKanpoko4);	
			                    
				                  //emaitza
				                    textEtxeko4.setText(""+partidoJ13P4.getEtxekoemaitza());
				                    textKanpoko4.setText(""+partidoJ13P4.getKanpokoEmaitza());
				                  
								 panel2.setVisible(true);		        
							}
							else if ("J14".equals(seleccion)) {
								 panel2.setVisible(true);
								 Jardunaldia jardunaldiaJ14 = jardunaldiaList.get(13);
				                	/*
					                    * Lehenengo partidoa
					                    * */
					                    Partidoa partidoJ14P1 = jardunaldiaJ14.getPartidoaList().get(0);
					                    String taldeaEtxeko1 = partidoJ14P1.getEtxekoTaldea();
					                    String taldeaKanpoko1 = partidoJ14P1.getKanpokoTaldea();
					                    lblEtxekoTaldea1.setText(taldeaEtxeko1);
					                    lblKanpokoTaldea1.setText(taldeaKanpoko1);
					                    
					                  //emaitza
					                    textEtxeko1.setText(""+partidoJ14P1.getEtxekoemaitza());
					                    textKanpoko1.setText(""+partidoJ14P1.getKanpokoEmaitza());
					                  
					                    /*
					                     * Bigarren partidoa
					                     */
					                    Partidoa partidoJ14P2 = jardunaldiaJ14.getPartidoaList().get(1);
					                    String taldeaEtxeko2 = partidoJ14P2.getEtxekoTaldea();
					                    String taldeaKanpoko2 = partidoJ14P2.getKanpokoTaldea();
					                    lblEtxekoTaldea2.setText(taldeaEtxeko2);
					                    lblKanpokoTaldea2.setText(taldeaKanpoko2);
					                    
					                  //emaitza
					                    textEtxeko2.setText(""+partidoJ14P2.getEtxekoemaitza());
					                    textKanpoko2.setText(""+partidoJ14P2.getKanpokoEmaitza());
					                  
					                    /*
					                     * hirugarren partidoa
					                     */
					                    Partidoa partidoJ14P3 = jardunaldiaJ14.getPartidoaList().get(2);
					                    String taldeaEtxeko3 = partidoJ14P3.getEtxekoTaldea();
					                    String taldeaKanpoko3 = partidoJ14P3.getKanpokoTaldea();
					                    lblEtxekoTaldea3.setText(taldeaEtxeko3);
					                    lblKanpokoTaldea3.setText(taldeaKanpoko3);
					                  
					                  //emaitza
					                    textEtxeko3.setText(""+partidoJ14P3.getEtxekoemaitza());
					                    textKanpoko3.setText(""+partidoJ14P3.getKanpokoEmaitza());
					                  
					                    
					                    /*
					                     * laugarren partidoa
					                     */
					                    Partidoa partidoJ14P4 = jardunaldiaJ14.getPartidoaList().get(3);
					                    String taldeaEtxeko4 = partidoJ14P4.getEtxekoTaldea();
					                    String taldeaKanpoko4 = partidoJ14P4.getKanpokoTaldea();
					                    lblEtxekoTaldea4.setText(taldeaEtxeko4);
					                    lblKanpokoTaldea4.setText(taldeaKanpoko4);	
					                    
					                  //emaitza
					                    textEtxeko4.setText(""+partidoJ14P4.getEtxekoemaitza());
					                    textKanpoko4.setText(""+partidoJ14P4.getKanpokoEmaitza());
					                  	
							                }
		                
		            }
		        });
				
				setVisible(true);
				
						
				
				btnSailkapena.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						SailkapenaPanel SP = new SailkapenaPanel(gureDenboraldia);
						SP.setSize(700,600);
						SP.setLocation(0, 0);
						Dashboard.ShowPanel(SP);
					}
				});
				/*----------		ComboBox/Botoiak Listener FIN				------------*/
				///////////
			

		        
		        

	}
		/*----------		METODOA				------------*/
	
	/**
	 * @param jardunaldiZenbakia
	 * @param j
	 * @param d
	 * d parametroa DenboraldiaPanel-ean pasatzen diogu
	 */
	public void gordeJardunaldia( int jardunaldiZenbakia, Jardunaldia j, String d) {
		
		//P1
		Partidoa P1 = j.getPartidoaList().get(0);
		P1.setEtxekoemaitza(Integer.parseInt(textEtxeko1.getText()));
		P1.setKanpokoEmaitza(Integer.parseInt(textKanpoko1.getText()));
        j.getPartidoaList().set(0, P1);
        
        //P2
        
        Partidoa P2 = j.getPartidoaList().get(1);
        P2.setEtxekoemaitza(Integer.parseInt(textEtxeko2.getText()));
        P2.setKanpokoEmaitza(Integer.parseInt(textKanpoko2.getText()));
        j.getPartidoaList().set(1, P2);
        
        //P3
        Partidoa P3 = j.getPartidoaList().get(2);
        P3.setEtxekoemaitza(Integer.parseInt(textEtxeko3.getText()));	
        P3.setKanpokoEmaitza(Integer.parseInt(textKanpoko3.getText()));					           				            
        j.getPartidoaList().set(2, P3);
        
        //P4
        Partidoa P4 = j.getPartidoaList().get(3);
        P4.setEtxekoemaitza(Integer.parseInt(textEtxeko4.getText()));
        P4.setKanpokoEmaitza(Integer.parseInt(textKanpoko4.getText()));					           				            
        j.getPartidoaList().set(3, P4);
        
        
        
        jardunaldiaList.set(jardunaldiZenbakia, j);
        //Utils.gordeJardunaldiaList(jardunaldiaList);;
        Utils.gordeJardunaldiaDenboraldiaList(jardunaldiaList, d);
	}
	
///////////////////////////metodoak//////////////////////////
//private void gehituElementua() {
//String etxekoTaldea1txt = textEtxeko1.getText();
//String kanpokoTaldea1txt = textKanpoko1.getText();
//String etxekoTaldea2txt = textEtxeko2.getText();
//String kanpokoTaldea2txt = textKanpoko2.getText();
//String etxekoTaldea3txt = textEtxeko3.getText();
//String kanpokoTaldea3txt = textKanpoko3.getText();
//String etxekoTaldea4txt = textEtxeko4.getText();
//String kanpokoTaldea4txt = textKanpoko4.getText();
//
//int etxekoTaldea1Int = Integer.parseInt(etxekoTaldea1txt);
//int kanpokoTaldea1Int = Integer.parseInt(kanpokoTaldea1txt);
//int etxekoTaldea2Int = Integer.parseInt(etxekoTaldea2txt);
//int kanpokoTaldea2Int = Integer.parseInt(kanpokoTaldea2txt);
//int etxekoTaldea3Int = Integer.parseInt(etxekoTaldea3txt);
//int kanpokoTaldea3Int = Integer.parseInt(kanpokoTaldea3txt);
//int etxekoTaldea4Int = Integer.parseInt(etxekoTaldea4txt);
//int kanpokoTaldea4Int = Integer.parseInt(kanpokoTaldea4txt);
//
//
//String seleccion = (String) JardunaldiaBox.getSelectedItem();
//
//textEtxeko1.setText("");
//textKanpoko1.setText("");
//textEtxeko2.setText("");
//textKanpoko2.setText("");
//textEtxeko3.setText("");
//textKanpoko3.setText("");
//textEtxeko4.setText("");
//textKanpoko4.setText("");
//
////irakurri jardunaldien fitx
//ArrayList<Jardunaldia> jardunaldiaList = Utils.IrakurriJardunaldiaFitx();
//
//if (etxekoTaldea1txt.isEmpty() || kanpokoTaldea1txt.isEmpty() || etxekoTaldea2txt.isEmpty() || kanpokoTaldea2txt.isEmpty() || etxekoTaldea3txt.isEmpty()|| kanpokoTaldea3txt.isEmpty()|| etxekoTaldea4txt.isEmpty() || kanpokoTaldea4txt.isEmpty() ) {
//    // Abisua eman: Eremu guztiak bete behar dira
//    JOptionPane.showMessageDialog(this, "Eremu guztiak bete behar dira", "Errorea", JOptionPane.WARNING_MESSAGE);
//} else {
//	 switch (seleccion) {
//     case "J1":
//         // Guardar información para J1
//    	 Jardunaldia jardunaldiaJ1 = new Jardunaldia();
//    	 for (Jardunaldia jardunaldia : jardunaldiaList) {
//			
//		}
//
//    	    // Crear instancias de Partidoa para los cuatro partidos
//    	    Partidoa partidoJ1P1 = new Partidoa(etxekoTaldea1Int, etxekoTaldea1);
//    	   
//
//    	    // Agregar los partidos a la lista de partidos de la jornada J1
//    	    jardunaldiaJ1.getPartidoaList().add(partidoJ1P1);
//    	    jardunaldiaJ1.getPartidoaList().add(partidoJ1P2);
//    	    jardunaldiaJ1.getPartidoaList().add(partidoJ1P3);
//    	    jardunaldiaJ1.getPartidoaList().add(partidoJ1P4);
//
//    	    // Agregar la jornada J1 a tu lista de jornadas (jardunaldiaList)
//    	    jardunaldiaList.add(jardunaldiaJ1);
//         break;


	
	
	
	
	
	
	

}