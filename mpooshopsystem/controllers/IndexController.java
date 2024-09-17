package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import view.CupomView;
import view.IndexView;
import view.MensagemView;

public class IndexController {
	IndexView indexView;
	CupomView cupomView;
	KeyHandler keyHandler;
	ButtonHandler buttonHandler;
	
	public IndexController(IndexView indexView, CupomView cupomView) {
		this.indexView = indexView;
		this.cupomView = cupomView;
		keyHandler = new KeyHandler();
		buttonHandler = new ButtonHandler();
		control();
	}

	void control() {
		this.indexView.addKeyListener(keyHandler);
		this.indexView.getParticiparButton().addKeyListener(keyHandler);
		this.indexView.getParticiparButton().addActionListener(buttonHandler);
	}
	
	void updateView() {
		indexView.setVisible(false);
		cupomView.setVisible(true);
	}
	
	private class KeyHandler extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				int opt = MensagemView.exibirMensagemEncerrarSistema();
				if (opt == 0)
					System.exit(0);
			}
			
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				updateView();
			}
		}	
	}
	
	private class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == indexView.getParticiparButton()) {
				updateView();
			}
		}
	}

	
}
