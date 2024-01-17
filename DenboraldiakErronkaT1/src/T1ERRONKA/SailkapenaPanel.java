package T1ERRONKA;

import javax.swing.JPanel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class SailkapenaPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	//private DefaultListModel<String> dlmIzena;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public SailkapenaPanel() {
		setLayout(null);
		
		JPanel spanel = new JPanel();
		spanel.setBounds(0, 5, 434, 230);
		add(spanel);
		spanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 414, 57);
		spanel.add(panel);
		
		JLabel lblSailkapena = new JLabel("Sailkapena\r\n");
		panel.add(lblSailkapena);
		setVisible(true);
		//dlmIzena = new DefaultListModel<String>();
		
		
		//JPanel panel_taula = new JPanel();
		//panel_taula.setBounds(10, 83, 414, 137);
		//spanel.add(panel_taula);
		//panel_taula.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 0, 414, 137);
		//panel_taula.add(table);
		
		/*   Hasierako dautak lortu	
		 * 	 */
		ArrayList<Taldeak> taldeakList = Utils.IrakurriTaldeakFitx();
		

		
		
		Object[][] hasierakoDatuak= {
				
				{"1",taldeakList.get(0).getTaldeIzena(),"90"},				
				{"2",taldeakList.get(1).getTaldeIzena(),"90"},
				{"3",taldeakList.get(2).getTaldeIzena(),"90"},
				{"4",taldeakList.get(3).getTaldeIzena(),"90"},
				{"5",taldeakList.get(4).getTaldeIzena(),"90"},
				{"6",taldeakList.get(5).getTaldeIzena(),"90"},
				{"7",taldeakList.get(6).getTaldeIzena(),"90"},
				{"8",taldeakList.get(7).getTaldeIzena(),"90"}
		};
		//zutaben izenak
		Object[] zutabeizena = {"Sailkapena","izena","puntoak" }; 
		// Sortu DefaultTableModel bat datuekin eta zutabeen izenekin
        DefaultTableModel model = new DefaultTableModel(hasierakoDatuak, zutabeizena);

        // setratu Jtablearen modeloa
        table.setModel(model);
     // Sortu JScrollPane bat JTable-rentzat eta gehitu taula
     	JScrollPane panel_taula = new JScrollPane(table);
     	panel_taula.setBounds(10, 83, 414, 137);
     	spanel.add(panel_taula);
     		

	}
	

}
