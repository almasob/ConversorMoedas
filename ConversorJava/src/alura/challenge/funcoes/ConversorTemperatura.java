package alura.challenge.funcoes;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
		
	public void celFa(double celsus) {
		double resultado = celsus * 1.8 + 32;
		JOptionPane.showMessageDialog(null,String.format("%.1f°C corresponde a %.1f°F",celsus,resultado));
		
	}
	
	public void faCel(double fahrenheit) {
		double resultado = (fahrenheit - 32)/1.8;
		JOptionPane.showMessageDialog(null,String.format("%.1f°F corresponde a %.1f°C",fahrenheit,resultado));
		
	}
}
