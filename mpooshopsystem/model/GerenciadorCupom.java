package model;

import view.MensagemView;

public class GerenciadorCupom extends Thread {
	private static String CUPOM_50_OFF = "Parábens você ganhou R$50,00";
	private static final int VALOR_CUPOM_50_OFF = 50;
	private static final int TOTAL_CUPOM_50_OFF = 2;
	
	private static int quant_cupom_50_off;

	@Override
	public void run() {
		
		
		//TODO Criar Gerenciamento do cupom para o cliente
		
		
		try {
			sleep(10000);
			MensagemView.exibirFimPromocao();
			System.exit(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
