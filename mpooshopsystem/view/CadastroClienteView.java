package view;

import java.awt.FlowLayout;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroClienteView extends JFrame {
	JLabel nomeLabel;
	JTextField nomeField;
	JLabel emailLabel;
	JTextField emailField;
	JLabel cpfLabel;
	JFormattedTextField cpfField;
	JButton cadastrarButton;
	JButton saibaMaisButton;
	
	
	public CadastroClienteView() {
		setSize(200, 200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setTitle("Cadastrar Cliente");
		
		nomeLabel = new JLabel("Nome:");
		nomeField = new JTextField(15);
		
		emailLabel = new JLabel("Email:");
		emailField = new JTextField(15);
		
		cpfLabel = new JLabel("CPF:");
		try {
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(15);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cadastrarButton = new JButton("Cadastrar");
		saibaMaisButton = new JButton("Saiba Mais");
		
		add(nomeLabel);
		add(nomeField);
		add(emailLabel);
		add(emailField);
		add(cpfLabel);
		add(cpfField);
		add(cadastrarButton);
		add(saibaMaisButton);
		
		setVisible(false);
	}


	public JButton getCadastrarButton() {
		return cadastrarButton;
	}


	public JButton getSaibaMaisButton() {
		return saibaMaisButton;
	}


	public JTextField getEmailField() {
		return emailField;
	}


	public JFormattedTextField getCpfField() {
		return cpfField;
	}
	
	
}
