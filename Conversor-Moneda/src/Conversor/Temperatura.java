package Conversor;

import javax.swing.JOptionPane;

public class Temperatura {

	 public void fahrenheitACelsius(double valorRecibido) {
		    double celsius = (valorRecibido - 32) * 5 / 9;
		    celsius = (double) Math.round(celsius * 100) / 100; // Redondea a 2 decimales

		    JOptionPane.showMessageDialog(null, valorRecibido + " °F = " + celsius + " °C"); // Muestra valor convertido
		  }

		  public void celsiusAFahrenheit(double valorRecibido) {
		    double fahrenheit = valorRecibido * 9 / 5 + 32;
		    fahrenheit = (double) Math.round(fahrenheit * 100) / 100;

		    JOptionPane.showMessageDialog(null, valorRecibido + " °C = " + fahrenheit + " °F");
		  }

		  public void kelvinACelsius(double valorRecibido) {
		    double celsius = valorRecibido - 273.15;
		    celsius = (double) Math.round(celsius * 100) / 100;

		    JOptionPane.showMessageDialog(null, valorRecibido + " °K = " + celsius + " °C");
		  }

		  public void celsiusAKelvin(double valorRecibido) {
		    double kelvin = valorRecibido + 273.15;
		    kelvin = (double) Math.round(kelvin * 100) / 100;

		    JOptionPane.showMessageDialog(null, valorRecibido + " °C = " + kelvin + " °K");
		  }

		  public void kelvinAFahrenheit(double valorRecibido) {
		    double fahrenheit = valorRecibido * 9 / 5 - 459.67;
		    fahrenheit = (double) Math.round(fahrenheit * 100) / 100;

		    JOptionPane.showMessageDialog(null, valorRecibido + " °K = " + fahrenheit + " °F");
		  }

		  public void fahrenheitAKelvin(double valorRecibido) {
		    double kelvin = (valorRecibido + 459.67) * 5 / 9;
		    kelvin = (double) Math.round(kelvin * 100) / 100;

		    JOptionPane.showMessageDialog(null, valorRecibido + " °F = " + kelvin + " °K");
		  }
}
