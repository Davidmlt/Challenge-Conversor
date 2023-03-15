package Conversor;

import javax.swing.JOptionPane;

public class Monedas {
	
	public void pesoADolar(double valorRecibido) {
		double dolar = valorRecibido / 365;
		
		dolar = (double) Math.round(dolar * 1000000) / 1000000.0;
		
		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = US$" + dolar);
	}
	
	public void pesoAEuro(double valorRecibido) {
		double euro = valorRecibido / 405;
		
		euro = (double) Math.round(euro * 1000000) / 1000000.0;
		
		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = €" + euro);

	}
	
	public void pesoALibras(double valorRecibido) {
		double libras = valorRecibido / 250;
		
		libras = (double) Math.round(libras * 1000000) / 1000000.0;
		
		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = £" + libras);
	}
	
	public void pesoAYen(double valorRecibido) {
		double yen = valorRecibido / 1.5;
		
		yen = (double) Math.round(yen * 1000000) / 1000000.0;
		
		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = ¥" + yen);
	}
	
	public void pesoAWon(double valorRecibido) {
		double won = valorRecibido / 0.15;
		
		won = (double) Math.round(won * 1000000) / 1000000.0;
		
		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = ₩" + won);
	}
	
	public void dolarAPeso(double valorRecibido) {
		double pesos = valorRecibido * 365;
		
		pesos = (double) Math.round(pesos * 1000000) / 1000000.0;
		
		JOptionPane.showMessageDialog(null, "US$" + valorRecibido + " = $" + pesos);
	}
	
	public void euroAPeso(double valorRecibido) {
		double pesos = valorRecibido * 405;
		
		pesos = (double) Math.round(pesos * 1000000) / 1000000.0;
		
		JOptionPane.showMessageDialog(null, "€" + valorRecibido + " = $" + pesos);
	}
	
	public void libraAPeso(double valorRecibido) {
		double pesos = valorRecibido * 250;
		
		pesos = (double) Math.round(pesos * 1000000) / 1000000.0;
		
		JOptionPane.showMessageDialog(null, "£" + valorRecibido + " = $" + pesos);
	}
	
	public void yenAPeso(double valorRecibido) {
		double pesos = valorRecibido * 1.5;
		
		pesos = (double) Math.round(pesos * 1000000) / 1000000.0;
		
		JOptionPane.showMessageDialog(null, "¥" + valorRecibido + " = $" + pesos);
	}
	
	public void wonAPeso(double valorRecibido) {
		double pesos = valorRecibido * 0.15;
		
		pesos = (double) Math.round(pesos * 1000000) / 1000000.0;
		
		JOptionPane.showMessageDialog(null, "₩" + valorRecibido + " = $" + pesos);
	}
}
