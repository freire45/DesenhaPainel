package br.com.erickfreire.desenhapainel;

import javax.swing.JFrame;

public class DesenhaPainelTeste {

	public static void main(String[] args) {
		DesenhaPainel painel1 = new DesenhaPainel();
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel1);
		aplicacao.setSize(250,250);
		aplicacao.setVisible(true);

	}

}
