package ÜbungGUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Fenster extends JFrame{

	// Versuche ein GUI zu erstellen 
	private Spiel spiel;
	private JLabel willkommen;
	private JLabel vs;
	private JLabel name1;
	private JLabel name2;
	private JTextField ersterSpieler;
	private JTextField zweiterSpieler;
	private JButton speichern;
	private JButton zeichen1;
	private JButton zeichen2;
	private JButton spielen;
	private String spieler1;
	private String spieler2;
	private String[] zeichen = new String[2];

	public Fenster() {
		setLayout(null);
		setVisible(true);
		setResizable(true);
		setSize(900,500);
		setLocation(100, 100);
		setTitle("TicTacToe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		willkommen = new JLabel("Hallo und Herzlich Willkommen");
		willkommen.setBounds(250, 25, 400, 20);
		willkommen  = ueberschrift(willkommen);
		add(willkommen);
		name1 = new JLabel("Name des ersten Spieler");
		name1.setBounds(50, 80, 200, 20);
		add(name1);
		ersterSpieler = new JTextField(15);
		// Abstand von links nach rechts,Hoehe,Länge des Spiefeldes, Breite des TextFeldes
		ersterSpieler.setBounds(50, 100, 200, 20);
		add(ersterSpieler);
		vs = new JLabel("gegen");
		vs.setBounds(300, 100, 100, 20);
		add(vs);
		name2 = new JLabel("Name des zweiten Spieler");
		name2.setBounds(400, 80, 200, 20);
		add(name2);
		zweiterSpieler = new JTextField(15);
		zweiterSpieler.setBounds(400, 100, 200, 20);
		add(zweiterSpieler);
		zeichen1 = new JButton("X");
		zeichen1.setBounds(50, 130, 100, 20);
		add(zeichen1);
		zeichen2 = new JButton("O");
		zeichen2.setBounds(150, 130, 100, 20);
		add(zeichen2);
		speichern = new JButton("Speichern");
		speichern.setBounds(400, 130, 200, 20);
		add(speichern);
		spielen = new JButton("Spielen");
		spielen.setBounds(230, 200, 200, 50);
		add(spielen);

		Händler händler = new Händler();
		ersterSpieler.addActionListener(händler);
		zweiterSpieler.addActionListener(händler);
		zeichen1.addActionListener(händler);
		zeichen2.addActionListener(händler);
		speichern.addActionListener(händler);
		spielen.addActionListener(händler);


	}

	public JLabel ueberschrift(JLabel willkommen) {

		Font schriftart = new Font("Serif",Font.PLAIN + Font.ITALIC,20);
		willkommen.setFont(schriftart);
		return willkommen;

	}

	private class Händler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			if(e.getSource() == zeichen1) {
				zeichen[0] = "x";
				zeichen[1] = "o";
				
			}else if(e.getSource() == zeichen2) {				
				zeichen[0] = "o";
				zeichen[1] = "x";
			}
			if(e.getSource() == speichern) {
				spieler1 = ersterSpieler.getText();
				spieler2 = zweiterSpieler.getText();
				JOptionPane.showMessageDialog(Fenster.this, "Es spielt " + spieler1 + " mit " + zeichen[0] + " gegen " + spieler2 + " mit " + zeichen[1],"Zeichengebung",JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			if(e.getSource() == spielen) {
				Spiel s = new Spiel();
				
				
			}
			


		}




	}
	
	public String getSpieler1() {
		return spieler1;
	}
	
	public String getSpieler2() {
		return spieler2;
	}
	
	public String[] getZeichen() {
		return zeichen;
	}




}
