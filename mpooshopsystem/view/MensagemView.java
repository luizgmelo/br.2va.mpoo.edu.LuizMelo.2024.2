package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MensagemView extends JOptionPane {
	
	public MensagemView(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "MPOOShop", INFORMATION_MESSAGE, new ImageIcon("img/icone.png"));
	}
	
	public static void exibirMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "MPOOShop", INFORMATION_MESSAGE, new ImageIcon("img/icone.png"));
	}
	
	public static void exibirMensagemErro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "Mensagem", ERROR_MESSAGE);
	}
	
	public static void exibirFimPromocao() {
		JOptionPane.showMessageDialog(null, "Fim da Promoção! O sistema será finalizado", "MPOOShop", INFORMATION_MESSAGE, new ImageIcon("img/icone.png"));
	}
	
	public static int exibirMensagemCadastrarCliente() {
		return JOptionPane.showConfirmDialog(null, "Cliente, deseja realizar seu cadastro?", "MPOOShop", YES_NO_OPTION);
	}
	
	public static int exibirMensagemEncerrarSistema() {
		return JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o sistema?", "MPOOShop", YES_NO_OPTION);
	}
	
	
	public static void exibirMensagemErroCadastroCliente() {
		JOptionPane.showMessageDialog(null, "Erro ao cadastrar Cliente!", "Mensagem", INFORMATION_MESSAGE);
	}
	
	public static void exibirMensagemErroCupomCliente() {
		JOptionPane.showMessageDialog(null, "Cliente já possui Cupom!", "Mensagem", INFORMATION_MESSAGE);
	}
	
	public static void exibirMensagemConfirmacaoCadastro() {
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso! Informe seu email e ganhe seu Cupom!", "Mensagem", INFORMATION_MESSAGE);
	}
	
	public static void exibirMensagemSaibaMais() {
		JOptionPane.showMessageDialog(null, "Cliente faça parte de MPOOShop e ganhe benefícios!", "Mensagem", INFORMATION_MESSAGE);
	}
}
