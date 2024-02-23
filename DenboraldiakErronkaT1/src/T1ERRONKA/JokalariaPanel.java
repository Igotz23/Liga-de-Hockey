package T1ERRONKA;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;


public class JokalariaPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private DefaultListModel<String> dlm;
	private DefaultListModel<String> dlm2;
	private String gureDenboraldia;
	
	//jokalariakList =
	/**
	 * Create the panel.
	 */
	public JokalariaPanel(String denboraldia) {
		this.gureDenboraldia=denboraldia;
		setLayout(null);

		JPanel spanel = new JPanel();
		spanel.setBounds(10, 10, 700, 600);
		add(spanel);
		spanel.setLayout(null);
		
		JButton btnTraspaso = new JButton("----------->");
		
		btnTraspaso.setBounds(303, 246, 85, 21);
		spanel.add(btnTraspaso);
		
		JList<String> list = new JList<String>();
		list.setBounds(76, 177, 203, 210);
		spanel.add(list);
		dlm= new DefaultListModel<String>();
		list.setModel(dlm);
		
		JList<String> list2 = new JList<String>();
		list2.setBounds(400, 177, 203, 210);
		spanel.add(list2);
		dlm2= new DefaultListModel<String>();
		list.setModel(dlm2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Carolina Hurricanes","Columbus Blue Jackets","New Jersey Devils","New York Islanders","New York Rangers","Philadelphia Flyers","Pittsburgh Penguins","Washington Capitals"}));
		comboBox.setBounds(76, 146, 203, 21);
		spanel.add(comboBox);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"", "Carolina Hurricanes","Columbus Blue Jackets","New Jersey Devils","New York Islanders","New York Rangers","Philadelphia Flyers","Pittsburgh Penguins","Washington Capitals"}));
		comboBox2.setBounds(400, 146, 203, 21);
		spanel.add(comboBox2);
		
		JPanel panel = new JPanel();
		panel.setBounds(76, 31, 507, 35);
		spanel.add(panel);
		
		JLabel lblNewLabel = new JLabel("Jokalarien Fitxaketak\r\n");
		panel.add(lblNewLabel);
		
		JButton GordeFitx = new JButton("Gorde Fitx\r\n");
		
		GordeFitx.setBounds(518, 432, 85, 21);
		spanel.add(GordeFitx);
		
		
		
		
		comboBox.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	dlm.clear();
		        String seleccion = (String) comboBox.getSelectedItem();
		        // Aquí puedes realizar acciones basadas en la selección del JComboBox
		        
		        ///zerrenda kargatu fitxategitik
		        ArrayList <Jokalaria> jokalariakList= Utils.IrakurriJokalariFitx();
		        //zerrenda zeharkatu
		        for (Jokalaria jokalaria : jokalariakList) {
					if (jokalaria.getTaldeak().getTaldeIzena().equals(seleccion)) {
						
						dlm.addElement(jokalaria.toString());
						list.setModel(dlm);
					}
				}
		        //comboboxen taldean jokalariaren taldea bada, gehitu zerrendara
		       
		    }
		});
		
		
		comboBox2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	dlm2= new DefaultListModel<String>();
		        String seleccion = (String) comboBox2.getSelectedItem();
		        // Aquí puedes realizar acciones basadas en la selección del JComboBox
		        
		        ///zerrenda kargatu fitxategitik
		        ArrayList <Jokalaria> jokalariakList= Utils.IrakurriJokalariFitx();
		        //zerrenda zeharkatu
		        for (Jokalaria jokalaria : jokalariakList) {
					if (jokalaria.getTaldeak().getTaldeIzena().equals(seleccion)) {
						
						dlm2.addElement(jokalaria.toString());
						list2.setModel(dlm2);
					}
				}
		        //comboboxen taldean jokalariaren taldea bada, gehitu zerrendara
		       
		    }
		});
		
		btnTraspaso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int seleccionList = list.getSelectedIndex();
				
				String seleccionCbox1 = (String) comboBox.getSelectedItem(); 
				String seleccionCbox2 = (String) comboBox2.getSelectedItem();
				if (seleccionCbox1.equals(seleccionCbox2)) {
					JOptionPane.showMessageDialog(null, "Ezin duzu traspazatu Jokalari bat bere Talde berdinera ");
				
				
				}else if (seleccionCbox2.equals("")) {
					JOptionPane.showMessageDialog(null, "Ezin duzu traspazatu Jokalariak hemen");
					
				}else if (seleccionList != -1) {
					String jokalariIzena = dlm.getElementAt(seleccionList);
					dlm2.addElement(jokalariIzena);
					dlm.remove(seleccionList);					
					list.setModel(dlm);
					list2.setModel(dlm2);
					
				}
			
			}
		});
		
		GordeFitx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList <Jokalaria> jokalariakList = new ArrayList<Jokalaria>();
				
				for (int i = 0; i < dlm2.size(); i++) {
		            String jokalariIzena = dlm2.getElementAt(i);
		            // Buscar el objeto Jokalaria correspondiente al nombre del jugador en jokalariakList
		            // y añadirlo a la nueva lista jokalariakList
		            for (Jokalaria jokalaria : Utils.IrakurriJokalariFitx()) {
		                if (jokalaria.toString().equals(jokalariIzena)) {
		                    jokalariakList.add(jokalaria);
		                    break; // Salir del bucle interior una vez que se haya encontrado el jugador
		                }
		            }
		        }
				
				Utils.gordeJokalariDenboraldiaList(jokalariakList, denboraldia);
			}
		});

		
		
	}
	
	 
         
}
