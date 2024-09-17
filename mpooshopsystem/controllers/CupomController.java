package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import model.BaseDados;
import model.Cliente;
import view.CadastroClienteView;
import view.CupomView;
import view.IndexView;
import view.MensagemView;

public class CupomController {
	IndexView indexView;
	CupomView cupomView;
	CadastroClienteView cadastroClienteView;

	public CupomController(CupomView cupomView, CadastroClienteView cadastroClienteView, IndexView indexView) {
		this.cupomView = cupomView;
		this.cadastroClienteView = cadastroClienteView;
		this.indexView = indexView;
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
		
		cupomView.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
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
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				cupomView.setVisible(false);
				indexView.setVisible(true);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
