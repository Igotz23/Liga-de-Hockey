package T1ERRONKA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Color;

/**
 * 
 */
@SuppressWarnings("unused")
public class Dashboard extends JFrame {

	/**
	 * Serial Version
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private JPanel contentPane;
	/**
	 * 
	 */
	private static JPanel content ;
	/**
	 * 
	 */
	private JardunaldiaPanel JP;
	/**
	 * 
	 */
	private SailkapenaPanel SP;
	/**
	 * 
	 */
	private JLabel lblTexto;
	@SuppressWarnings("javadoc")
	List<Taldeak> taldeakList;
	
	/**
	 * 
	 */
	private denboraldiaPanel DP;
	/**
	 * 
	 */
	private JButton btnDenboraldia;
	//private void ShowPanel;

	/**
	 * Launch the application.
	 * @param args 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param p 
	 * hemen ShowPanel metodoa sortu dut, hau botoietan implementatzen ditut adibidez botoi bati ematean Sailkapena erakusten du
	 * bere funtzionamendua oso erreza da Dashbord-ean dagoen panela "content" husten du eta bere ordez beste bat erakusten du
	 *  
	 */
	 /////////////Metodos/////////////////
	public static void ShowPanel (JPanel p) {
		p.setSize(700,600);
		p.setLocation(0, 0);
	
		content.removeAll();
			
		
		content.add(p, BorderLayout.CENTER);
		content.revalidate();
		content.repaint();	
	}
//////////////////////////////////
	
	
	
	
	/**
	 * Hemen Dashbord-ean erabilitako elementu guztiak daude.
	 * Jpanelen deklarazioak, Jlabel-ak, Jbutton-ak
	 * 
	 */
	
	
	public Dashboard() {

		/////////////Panelak////////////
//		JP = new JardunaldiaPanel();
//		JP.setSize(700,600);
//		JP.setLocation(0, 0);
		
//		SP = new SailkapenaPanel();
//		SP.setSize(700,600);
//		SP.setLocation(0, 0);
//		
		DP = new denboraldiaPanel();
		DP.setSize(700,600);
		DP.setLocation(0, 0);
		///////////////////////////////
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		content = new JPanel();
		content.setBounds(0, 31, 700, 600);
		contentPane.add(content);
		content.setLayout(null);
		
		btnDenboraldia = new JButton("Aplikazioa Hasiaratu");	
		btnDenboraldia.setBackground(new Color(255, 128, 128));
		btnDenboraldia.setBounds(246, 227, 207, 66);
		content.add(btnDenboraldia);
		btnDenboraldia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ShowPanel(DP);
			}
		});
		
		
		
		
		
		/////////////////////////////////////////////
		
		/*
		 * aqui tengo un arrayList de los taldes  lo que hace es que llama metodo Utils.IrakurriTaldeakFitx() que este lee el Taldeak.dat y los añade al array List de Taldeak,
		 * en esta clase no lo utilizo por ahora
		 * */
		@SuppressWarnings("unused")
		ArrayList<Taldeak> taldeakList = Utils.IrakurriTaldeakFitx();
		  
		  
		  
		////////////////////////////////////////////
	
	}

	@SuppressWarnings("javadoc")
	public List<Taldeak> getTaldeakList() {
		return taldeakList;
	}

	@SuppressWarnings("javadoc")
	public void setTaldeakList(List<Taldeak> taldeakList) {
		this.taldeakList = taldeakList;
	}
}
	
	

