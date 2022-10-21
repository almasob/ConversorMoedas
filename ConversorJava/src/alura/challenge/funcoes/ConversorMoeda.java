package alura.challenge.funcoes;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorMoeda {
	private double dolar = 5.22;
	private double real = 0.19;
	private double euro = 5.09;
	private double realE = 0.20;
			
			
	DecimalFormat formato = new DecimalFormat("#.##");

	public void realDolar(double valor) {
		double resultado = valor * real;
		JOptionPane.showMessageDialog(null, "Você tem $" + formato.format(resultado));
	}
	
	public void dolarReal(double valor) {
		double resultado = valor * dolar;
		JOptionPane.showMessageDialog(null, "Você tem R$" + formato.format(resultado));
	}
	
	public void euroReal(double valor) {
		double resultado = valor * euro;
		JOptionPane.showMessageDialog(null, "Você tem €" + formato.format(resultado));
	}
	
	public void realEuro(double valor) {
		double resultado = valor * realE;
		JOptionPane.showMessageDialog(null, "Você tem R$" + formato.format(resultado));
	}
}
