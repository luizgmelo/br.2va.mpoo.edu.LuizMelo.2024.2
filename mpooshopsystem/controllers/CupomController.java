package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseDados;
import model.Cliente;
import view.CadastroClienteView;
import view.CupomView;
import view.MensagemView;

public class CupomController {
	CupomView cupomView;
	CadastroClienteView cadastroClienteView;

	public CupomController(CupomView cupomView, CadastroClienteView cadastroClienteView) {
		this.cupomView = cupomView;
		this.cadastroClienteView = cadastroClienteView;
		control();
	}
	
	void control() {
		cupomView.getGanharButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == cupomView.getGanharButton()) {
					// simulando cadastrado true
					for (Cliente clienteCurrent : BaseDados.getClientes()) {
						if (clienteCurrent.getEmail().equalsIgnoreCase(cupomView.getEmailField().getText())) {
							MensagemView.exibirMensagem("Parábens você ganhou R$50,00");
							return;
						}
					}
					
					int opt = MensagemView.exibirMensagemCadastrarCliente();
					if (opt == 0) {
						cupomView.setVisible(false);
						cadastroClienteView.setVisible(true);
					}
				}
			}
		});
	}
}
