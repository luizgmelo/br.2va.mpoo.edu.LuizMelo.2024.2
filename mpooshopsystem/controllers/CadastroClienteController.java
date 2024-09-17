package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseDados;
import model.CPFException;
import model.CadastroException;
import model.Cliente;
import model.ClienteException;
import view.CadastroClienteView;
import view.MensagemView;

public class CadastroClienteController implements ActionListener {
	CadastroClienteView cadastroClienteView;
	

	public CadastroClienteController(CadastroClienteView cadastroClienteView) {
		this.cadastroClienteView = cadastroClienteView;
		control();
	}
	
	void control() {
		cadastroClienteView.getCadastrarButton().addActionListener(this);
		cadastroClienteView.getSaibaMaisButton().addActionListener(this);
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
}
