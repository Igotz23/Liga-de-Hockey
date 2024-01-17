package T1ERRONKA;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Component;

public class JardunaldiaPanel extends JPanel {


	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JScrollBar scrollBar;
	private JTable table;

	/**
	 * Create the panel.
	 */
	
	public JardunaldiaPanel() {
				setLayout(null);
		
				setLayout(null);
				
				JPanel spanel = new JPanel();
				spanel.setBounds(0, 5, 434, 230);
				add(spanel);
				spanel.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBounds(10, 10, 414, 57);
				spanel.add(panel);
				
				JLabel lblSailkapena = new JLabel("Jaurdunaldia\r\n");
				panel.add(lblSailkapena);
				setVisible(true);
				
				
				//JScrollPane panel_taula = new JScrollPane((Component) null);
				//panel_taula.setBounds(10, 83, 414, 137);
				//spanel.add(panel_taula);
				
				
			
				table = new JTable();
				table.setBounds(0, 0, 414, 137);
				///////////
				ArrayList<Taldeak> taldeakList = Utils.IrakurriTaldeakFitx();
				Object[][] hasierakoDatuak= {
						
						{taldeakList.get(0).getTaldeIzena(),null,"-",null,taldeakList.get(1).getTaldeIzena()},				
						{taldeakList.get(2).getTaldeIzena(),null,"-",null,taldeakList.get(3).getTaldeIzena()},
						{taldeakList.get(4).getTaldeIzena(),null,"-",null,taldeakList.get(5).getTaldeIzena()},
						{taldeakList.get(6).getTaldeIzena(),null,"-",null,taldeakList.get(7).getTaldeIzena()}
				};
				//zutaben izenak
				Object[] zutabeizena = {"Etxeko Taldea","Emaitza","J1","Emaitza","Kanpoko Taldea" }; 
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
