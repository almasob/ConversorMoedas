package alura.challenge.modelos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Conversor {
	
	public static void main(String[] args) {
		
		Object[] opcoes = {"Conversor Moedas", "Conversor Temperatura"};
		String escolha = JOptionPane.showInputDialog(null, "Escolha uma opção","Menu",JOptionPane.PLAIN_MESSAGE,null,opcoes,opcoes[0]).toString();
		System.out.println(escolha);
	}
	
	

}
