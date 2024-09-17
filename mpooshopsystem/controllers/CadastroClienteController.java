package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import model.BaseDados;
import model.CPFException;
import model.CadastroException;
import model.Cliente;
import model.ClienteException;
import view.CadastroClienteView;
import view.CupomView;
import view.IndexView;
import view.MensagemView;

public class CadastroClienteController implements ActionListener, WindowListener {
	CadastroClienteView cadastroClienteView;
	CupomView cupomView;

	public CadastroClienteController(CadastroClienteView cadastroClienteView, CupomView cupomView) {
		this.cadastroClienteView = cadastroClienteView;
		this.cupomView = cupomView;
		control();
	}
	
	void control() {
		cadastroClienteView.getCadastrarButton().addActionListener(this);
		cadastroClienteView.getSaibaMaisButton().addActionListener(this);
		cadastroClienteView.addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == cadastroClienteView.getCadastrarButton()) {			
			try {
				BaseDados.adicionarCliente(new Cliente(cadastroClienteView.getCpfField().getText(), cadastroClienteView.getEmailField().getText()));
				MensagemView.exibirMensagemConfirmacaoCadastro();
			} catch (CPFException e1) {
				MensagemView.exibirMensagemErro(e1.getMessage());
				e1.printStackTrace();
			} catch (CadastroException e1) {
				MensagemView.exibirMensagemErroCadastroCliente();
				e1.printStackTrace();
			} catch (ClienteException e1) {
				MensagemView.exibirMensagemErro(e1.getMessage());;
				e1.printStackTrace();
			}
		}
		
		if (e.getSource() == cadastroClienteView.getSaibaMaisButton()) {
			MensagemView.exibirMensagemSaibaMais();
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		cadastroClienteView.setVisible(false);
		cupomView.setVisible(true);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
