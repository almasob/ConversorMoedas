package alura.challenge.execucao;

import javax.swing.JOptionPane;

import alura.challenge.funcoes.ConversorMoeda;
import alura.challenge.funcoes.ConversorTemperatura;

public class Conversor {
	
	public static void main(String[] args) {
		
		while(true) {
			Object[] opcoes = {"Conversor Moedas", "Conversor Temperatura"};
			String escolha = JOptionPane.showInputDialog(null, "Escolha uma opção","Menu",JOptionPane.PLAIN_MESSAGE,null,opcoes,opcoes[0]).toString();
			
			if(escolha == "Conversor Moedas") {
				ConversorMoeda conversorM = new ConversorMoeda();
				
				Object[] opcoesConvert = {"Real para dolar", "Dolar para Real", "Real para Euro","Euro para Real"};
				String tipoDeConversao = JOptionPane.showInputDialog(null, "Escolha uma conversão", "Conversao Moeda",JOptionPane.PLAIN_MESSAGE,null,opcoesConvert,"Escolha").toString();
				
				try {
				String valor =JOptionPane.showInputDialog(null,"Qual valor?");
				Double valorConverter = Double.parseDouble(valor.replace(",", "."));
				
				
				switch(tipoDeConversao) {
				case "Real para dolar":
					conversorM.realDolar(valorConverter);
					break;
				case "Dolar para Real":
					conversorM.dolarReal(valorConverter);
					break;
				case "Real para Euro":
					conversorM.realEuro(valorConverter);
					break;
				case "Euro para Real":
					conversorM.euroReal(valorConverter);
					break;
				
				}
				}	catch(Exception e) {
					
					e.printStackTrace();
					JOptionPane.showMessageDialog(null,"Valor inválido! \n Use apenas numeros inteiros ou decimais!","Alerta!",JOptionPane.ERROR_MESSAGE);
					
				}
				
			}
			
			
			if(escolha == "Conversor Temperatura") {
				ConversorTemperatura conversorT = new ConversorTemperatura();
				
				String tipoTemperatura = JOptionPane.showInputDialog(null,"Escolha a conversão","Conversão Temperatura",JOptionPane.PLAIN_MESSAGE,null, new Object[]{"Graus Celsius para Fahrenheit","Graus Fahrenheit para Celsius"},"Escolha").toString();
				
				String temperaturaAtual = JOptionPane.showInputDialog(null,"Qual a temperatura atual?");
				Double valorConverter = Double.parseDouble(temperaturaAtual.replace(",", "."));
				
				switch(tipoTemperatura) {
				case "Graus Celsius para Fahrenheit":
					conversorT.celFa(valorConverter);
					break;
				case  "Graus Fahrenheit para Celsius":
					conversorT.faCel(valorConverter);
					break;
				}
				
				
			
		}
		
			
			int sair = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar?", JOptionPane.YES_NO_OPTION);
			if(sair == 1) {
				break;
			}
			
		}	
		
		JOptionPane.showMessageDialog(null, "Programa finalizado!", "Concluído!",JOptionPane.INFORMATION_MESSAGE);
	}
}
