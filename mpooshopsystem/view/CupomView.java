package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CupomView extends JFrame {
	JLabel emailLabel;
	JTextField emailField;
	JButton ganharButton;
	
	public CupomView() {
		setSize(300, 100);
		setTitle("Ganhar Cupom");
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		emailLabel = new JLabel("Email:");
		emailField = new JTextField(20);
		ganharButton = new JButton("Ganhar Cupom");
		
		add(emailLabel);
		add(emailField);
		add(ganharButton);
		
		setVisible(false);
	}

	public JButton getGanharButton() {
		return ganharButton;
	}

	public JTextField getEmailField() {
		return emailField;
	}
	
	
}
