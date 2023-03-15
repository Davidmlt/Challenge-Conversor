package Conversor;

import javax.swing.JOptionPane;

public class FuncionTemperatura {

	Temperatura temp = new Temperatura();

	  public void convertirTemperatura(double tempRecibida) {
	    String opciones = (JOptionPane.showInputDialog(null, "Seleccione el valor a convertir", "Temperatura",
	        JOptionPane.PLAIN_MESSAGE, null, new Object[] {
	            "Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius", "Fahrenheit a Kelvin",
	            "Kelvin a Celsius", "Kelvin a Fahrenheit"
	        }, "Selección")).toString();

	    switch (opciones) {
	      case "Celsius a Fahrenheit":
	        temp.celsiusAFahrenheit(tempRecibida);
	        break;
	      case "Celsius a Kelvin":
	        temp.celsiusAKelvin(tempRecibida);
	        break;
	      case "Fahrenheit a Celsius":
	        temp.fahrenheitACelsius(tempRecibida);
	        break;
	      case "Fahrenheit a Kelvin":
	        temp.fahrenheitAKelvin(tempRecibida);
	        break;
	      case "Kelvin a Celsius":
	        temp.kelvinACelsius(tempRecibida);
	        break;
	      case "Kelvin a Fahrenheit":
	        temp.kelvinAFahrenheit(tempRecibida);
	        break;
	      default:
	        break;
	    }
	  }
}
