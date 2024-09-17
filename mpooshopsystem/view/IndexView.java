package view;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IndexView extends JFrame {
	JLabel logoLabel;
	ImageIcon logoImage;
	JLabel mensagemLabel;
	JButton participarButton;

	public IndexView() {
		setSize(400, 150);
		setUndecorated(true);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
		
		logoImage = new ImageIcon("img/logo.png");
		logoLabel = new JLabel(logoImage);
		
		mensagemLabel = new JLabel("Participe você também ganhe um cupom de MPOO Shop!");
		
		participarButton = new JButton("Participar");
		
		add(logoLabel);
		add(mensagemLabel);
		add(participarButton);
		
		setVisible(true);		
	}

	public JButton getParticiparButton() {
		return participarButton;
	}
	
	
}
