package app;

import controllers.CadastroClienteController;
import controllers.CupomController;
import controllers.IndexController;
import model.BaseDados;
import model.CPFException;
import model.CadastroException;
import model.ClienteException;
import model.GerenciadorCupom;
import view.CadastroClienteView;
import view.CupomView;
import view.IndexView;

public class App {
	public static void main(String[] args) {
		try {
			BaseDados.createBase();
		} catch (CPFException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CadastroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		GerenciadorCupom gerenciadorCupom = new GerenciadorCupom();
		
		IndexView indexView = new IndexView();
		CupomView cupomView = new CupomView();
		CadastroClienteView cadastroClienteView = new CadastroClienteView();
		
		IndexController indexController = new IndexController(indexView, cupomView);
		CupomController cupomController = new CupomController(cupomView, cadastroClienteView, indexView);
		CadastroClienteController cadastroClienteController = new CadastroClienteController(cadastroClienteView, cupomView);
		
//		gerenciadorCupom.start();
		
	}
}
