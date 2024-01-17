package T1ERRONKA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel content ;
	private JardunaldiaPanel JP;
	private SailkapenaPanel SP;
	private JLabel lblTexto;
	List<Taldeak> taldeakList;
	//private void ShowPanel;

	/**
	 * Launch the application.
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
	 */
	/////////////Metodos/////////////////
	private void ShowPanel (JPanel p) {
		p.setSize(434,230);
		p.setLocation(0, 0);
		content.removeAll();
		content.add(p, BorderLayout.CENTER);
		content.revalidate();
		content.repaint();	
	}
	////////////////////talde aleatorio/////////////////////////
	   Taldeak obtenerTaldeAleatorio(List<Taldeak> taldeakList) {
	        Random taldeAleatorio = new Random();
	        int index = taldeAleatorio.nextInt(taldeakList.size());
	        return taldeakList.get(index);
	    }
	
	//////////////////////////////////
	public Dashboard() {

		/////////////Panelak////////////
		JP = new JardunaldiaPanel();
		JP.setSize(434,230);
		JP.setLocation(0, 0);
		
		SP = new SailkapenaPanel();
		SP.setSize(434,230);
		SP.setLocation(0, 0);
		///////////////////////////////
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		content = new JPanel();
		content.setBounds(0, 31, 434, 230);
		contentPane.add(content);
		content.setLayout(null);
		
		lblTexto = new JLabel("Botoi bateri eman Beste horriak ikusteko");
		lblTexto.setBounds(106, 81, 235, 31);
		
		content.add(lblTexto);
		
		JButton btnSailkapena = new JButton("Sailkapena\r\n");
		btnSailkapena.setBounds(245, -3, 144, 23);
		contentPane.add(btnSailkapena);
		
		JButton btnJaurdunaldia = new JButton("Jaurdunaldia\r\n");
		btnJaurdunaldia.setBounds(0, 0, 144, 23);
		contentPane.add(btnJaurdunaldia);
		btnJaurdunaldia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			ShowPanel(JP);
			}
		});
		btnSailkapena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			ShowPanel(SP);
			}
		});
		
		
		/////////////////////////////////////////////
		
		ArrayList<Taldeak> taldeakList = Utils.IrakurriTaldeakFitx();
		  
		  
		  
		////////////////////////////////////////////
	
	}

	public List<Taldeak> getTaldeakList() {
		return taldeakList;
	}

	public void setTaldeakList(List<Taldeak> taldeakList) {
		taldeakList = taldeakList;
	}
}
	
	

