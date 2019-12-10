package ÜbungGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Spiel extends JFrame{
	
	private Fenster fenster;
	
	// Spielfeld 
	private JTextField feld00;
	private JTextField feld01;
	private JTextField feld02;
	private JTextField feld10;
	private JTextField feld11;
	private JTextField feld12;
	private JTextField feld20;
	private JTextField feld21;
	private JTextField feld22;
	private JLabel punkte1;
	private JLabel punkte2;
	private JTextField punkteAnzahl1;
	private JTextField punkteAnzahl2;
	private JButton abbrechen;
	private int zähler;
	private int zähler2;
	
		
	
	
	
	public Spiel() {
		setLayout(null);
		setSize(900,600);
		setLocation(200,100);
		setVisible(true);
		setResizable(true);
		setTitle("Viel Glück");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setzteSpielfeld();
//		punkteStand();
		add(feld00);
		add(feld01);
		add(feld02);
		add(feld10);
		add(feld11);
		add(feld12);
		add(feld20);
		add(feld21);
		add(feld22);
//		add(punkte1);
//		add(punkteAnzahl1);
//		add(punkte2);
//		add(punkteAnzahl2);
		abbrechen = new JButton("Abbrechen");
		abbrechen.setBounds(550, 450, 150, 50);
		add(abbrechen);
		Händler händler = new Händler();
		abbrechen.addActionListener(händler);
		
		

	}
	
	
	public void setzteSpielfeld() {
		
		feld00 = new JTextField(1);
		feld00.setBounds(250, 75, 100, 100);
		feld01 = new JTextField(1);
		feld01.setBounds(350, 75, 100, 100);
		feld02 = new JTextField(1);
		feld02.setBounds(450, 75, 100, 100);
		
		feld10 = new JTextField(1);
		feld10.setBounds(250, 175, 100, 100);
		feld11 = new JTextField(1);
		feld11.setBounds(350, 175, 100, 100);
		feld12 = new JTextField(1);
		feld12.setBounds(450, 175, 100, 100);
		
		feld20 = new JTextField(1);
		feld20.setBounds(250, 275, 100, 100);
		feld21 = new JTextField(1);
		feld21.setBounds(350, 275, 100, 100);
		feld22 = new JTextField(1);
		feld22.setBounds(450, 275, 100, 100);
		
		
	}
	public void punkteStand() {
		punkte1 = new JLabel(fenster.getSpieler1() + " (" + fenster.getZeichen()[0] + ") ");
		punkte1.setBounds(30, 125, 100, 30);
		punkteAnzahl1 = new JTextField(zähler);
		punkteAnzahl1.setBounds(140, 125, 50, 30);
		punkteAnzahl1.setEditable(false);
		
		punkte2 = new JLabel(fenster.getSpieler2() + " (" + fenster.getZeichen()[1] + ") ");
		punkte2.setBounds(30, 250, 100, 30);
		punkteAnzahl2 = new JTextField(zähler2);
		punkteAnzahl2.setBounds(140, 250, 50, 30);
		punkteAnzahl2.setEditable(false);
		
	}
	
	public class Händler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == abbrechen) {
				if(JOptionPane.showConfirmDialog(null, "Wollen sie das Spiel wirklich beenden?","Sicher",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					dispose();
				}
				
			}
			
			
		}
		
	}


}
