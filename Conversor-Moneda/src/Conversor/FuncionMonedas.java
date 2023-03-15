package Conversor;

import javax.swing.JOptionPane;

public class FuncionMonedas {
	
	Monedas moneda = new Monedas();
	
	public void convertirMonedas(double valorRecibido) {
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione la moneda a convertir", "monedas ",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"Peso Arg a Dólar", "Peso Arg a Euro", "Peso Arg a Libra esterlina", "Peso Arg a Yen", "Peso Arg a Won",
						"Dólar a Peso Arg", "Euro a Peso Arg", "Libra esterlina a Peso Arg", "Yen a Peso Arg",
						"Won a Peso Arg"
				}, "Selección")).toString();

		switch (opciones) {
			case "Peso Arg a Dólar":
			moneda.pesoADolar(valorRecibido);
				break;
			case "Peso Arg a Euro":
				moneda.pesoAEuro(valorRecibido);
				break;
			case "Peso Arg a Libra esterlina":
				moneda.pesoALibras(valorRecibido);
				break;
			case "Peso Arg a Yen":
				moneda.pesoAYen(valorRecibido);
				break;
			case "Peso Arg a Won":
				moneda.pesoAWon(valorRecibido);
				break;
			case "Dólar a Peso Arg":
				moneda.dolarAPeso(valorRecibido);
				break;
			case "Euro a Peso Arg":
				moneda.euroAPeso(valorRecibido);
				break;
			case "Libra esterlina a Peso Arg":
				moneda.libraAPeso(valorRecibido);
				break;
			case "Yen a Peso Arg":
				moneda.yenAPeso(valorRecibido);
				break;
			case "Won a Peso Arg":
				moneda.wonAPeso(valorRecibido);
				break;
			default:
				break;
		}
	}

}
